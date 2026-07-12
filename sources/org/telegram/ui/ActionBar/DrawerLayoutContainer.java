package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* loaded from: classes4.dex */
public class DrawerLayoutContainer extends FrameLayout {
    private ActionBarLayout actionBarLayout;
    private boolean inLayout;
    private final Paint internalNavbarPaint;
    private WindowInsetsCompat lastWindowInsetsCompat;
    private INavigationLayout parentActionBarLayout;
    private Insets systemAndCutoutAndImeInsets;
    private Insets systemAndCutoutInsets;

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
        this.internalNavbarPaint = new Paint(1);
        Insets insets = Insets.NONE;
        this.systemAndCutoutInsets = insets;
        this.systemAndCutoutAndImeInsets = insets;
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.DrawerLayoutContainer$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = DrawerLayoutContainer.this.onApplyWindowInsets(view, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
        setSystemUiVisibility(1280);
    }

    public void setParentActionBarLayout(INavigationLayout iNavigationLayout) {
        this.parentActionBarLayout = iNavigationLayout;
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.actionBarLayout = actionBarLayout;
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
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        Insets insets = this.systemAndCutoutInsets;
        int i3 = (size - insets.left) - insets.right;
        int i4 = (size2 - insets.top) - insets.bottom;
        Point point = AndroidUtilities.displaySize;
        point.x = i3;
        point.y = i4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, TLObject.FLAG_30);
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30);
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

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.actionBarLayout.parentDraw(this, canvas);
        }
        super.dispatchDraw(canvas);
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
            ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.lastWindowInsetsCompat = windowInsetsCompat;
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        Insets defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, true);
        if (!this.systemAndCutoutInsets.equals(defaultWindowInsets) || !this.systemAndCutoutAndImeInsets.equals(defaultWindowInsets2)) {
            AndroidUtilities.statusBarHeight = defaultWindowInsets.top;
            AndroidUtilities.navigationBarHeight = defaultWindowInsets.bottom;
            this.systemAndCutoutInsets = defaultWindowInsets;
            this.systemAndCutoutAndImeInsets = defaultWindowInsets2;
            requestLayout();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            dispatchApplyWindowInsetsInternal(getChildAt(i), windowInsetsCompat);
        }
        invalidate();
        return WindowInsetsCompat.CONSUMED;
    }
}
