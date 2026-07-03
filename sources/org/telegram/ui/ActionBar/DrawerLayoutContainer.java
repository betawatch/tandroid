package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* loaded from: classes4.dex */
public class DrawerLayoutContainer extends FrameLayout {
    private boolean firstLayout;
    private boolean hasCutout;
    private int imeHeight;
    private boolean inLayout;
    private final Paint internalNavbarPaint;
    private boolean keyboardVisibility;
    private WindowInsetsCompat lastWindowInsetsCompat;
    private INavigationLayout parentActionBarLayout;

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isDrawCurrentPreviewFragmentAbove() {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public DrawerLayoutContainer(Context context) {
        super(context);
        this.firstLayout = true;
        this.internalNavbarPaint = new Paint(1);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.DrawerLayoutContainer$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$new$0;
                lambda$new$0 = DrawerLayoutContainer.this.lambda$new$0(view, windowInsetsCompat);
                return lambda$new$0;
            }
        });
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat lambda$new$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            boolean isVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
            int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
            if (this.keyboardVisibility != isVisible || this.imeHeight != i2) {
                this.keyboardVisibility = isVisible;
                this.imeHeight = i2;
                requestLayout();
            }
        }
        DrawerLayoutContainer drawerLayoutContainer = (DrawerLayoutContainer) view;
        if (AndroidUtilities.statusBarHeight != windowInsetsCompat.getSystemWindowInsetTop()) {
            drawerLayoutContainer.requestLayout();
        }
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || AndroidUtilities.isInMultiwindow || this.firstLayout) && AndroidUtilities.statusBarHeight != systemWindowInsetTop) {
            AndroidUtilities.statusBarHeight = systemWindowInsetTop;
        }
        boolean z = false;
        this.firstLayout = false;
        drawerLayoutContainer.setWillNotDraw(windowInsetsCompat.getSystemWindowInsetTop() <= 0 && getBackground() == null);
        if (i >= 28) {
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            if (displayCutout != null && !displayCutout.getBoundingRects().isEmpty()) {
                z = true;
            }
            this.hasCutout = z;
        }
        invalidate();
        return onApplyWindowInsets(view, windowInsetsCompat);
    }

    public void setParentActionBarLayout(INavigationLayout iNavigationLayout) {
        this.parentActionBarLayout = iNavigationLayout;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.parentActionBarLayout.checkTransitionAnimation();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.inLayout = true;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e) {
                    FileLog.e(e);
                    if (BuildVars.DEBUG_VERSION) {
                        throw e;
                    }
                }
            }
        }
        this.inLayout = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.inLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        WindowInsetsCompat rootWindowInsets;
        if (!BuildVars.USE_LEGACY_SYSTEM_INSETS && (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) != null) {
            Insets insetsIgnoringVisibility = rootWindowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            AndroidUtilities.statusBarHeight = insetsIgnoringVisibility.top;
            AndroidUtilities.navigationBarHeight = insetsIgnoringVisibility.bottom;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = (size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight;
        if (i3 > 0 && i3 < 4096) {
            AndroidUtilities.displaySize.y = i3;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, TLObject.FLAG_30);
                int i5 = layoutParams.height;
                if (i5 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, TLObject.FLAG_30);
                }
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).storyViewerAttached()) {
                    childAt.forceLayout();
                }
                childAt.measure(makeMeasureSpec2, makeMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsetsCompat;
        if (windowInsetsCompat == null) {
            return;
        }
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        if (insets.bottom > 0) {
            canvas.drawRect(0.0f, getMeasuredHeight() - insets.bottom, getMeasuredWidth(), getMeasuredHeight(), this.internalNavbarPaint);
        }
        if (this.hasCutout) {
            int i = insets.left;
            if (i != 0) {
                canvas.drawRect(0.0f, 0.0f, i, getMeasuredHeight(), Theme.fillingPaint(-16777216));
            }
            int i2 = insets.right;
            if (i2 != 0) {
                canvas.drawRect(i2, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.fillingPaint(-16777216));
            }
        }
    }

    public Paint getInternalNavbarPaint() {
        return this.internalNavbarPaint;
    }

    public void setInternalNavigationBarColor(int i) {
        if (this.internalNavbarPaint.getColor() != i) {
            this.internalNavbarPaint.setColor(i);
            invalidate();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsetsCompat;
        if (windowInsetsCompat != null) {
            dispatchApplyWindowInsetsInternal(view, windowInsetsCompat);
        }
    }

    private void dispatchApplyWindowInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        if ((view instanceof ActionBarLayout) || view.getTag() == null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            if (marginLayoutParams.topMargin != 0 || marginLayoutParams.bottomMargin != 0 || marginLayoutParams.leftMargin != insets.left || marginLayoutParams.rightMargin != insets.right) {
                marginLayoutParams.leftMargin = insets.left;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.rightMargin = insets.right;
                marginLayoutParams.bottomMargin = 0;
                view.requestLayout();
            }
            ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat.inset(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
        }
    }

    private WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.lastWindowInsetsCompat = windowInsetsCompat;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            dispatchApplyWindowInsetsInternal(getChildAt(i), windowInsetsCompat);
        }
        invalidate();
        return WindowInsetsCompat.CONSUMED;
    }
}
