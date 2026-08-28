package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x3 extends FrameLayout {
    public b5 a;
    public ActionBarLayout b;
    public boolean c;
    public final Paint d;
    public r0.m1 e;
    public i0.b f;
    public i0.b h;

    public x3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.b bVar = i0.b.e;
        this.f = bVar;
        this.h = bVar;
        n nVar = new n(this, 7);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(this, nVar);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        r0.m1 m1Var = this.e;
        if (m1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.j0.b(view, m1Var);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.b.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public Paint getInternalNavbarPaint() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return ((ActionBarLayout) this.a).j();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.c = true;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (BuildVars.DEBUG_VERSION) {
                        throw e10;
                    }
                }
            }
        }
        this.c = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        i0.b bVar = this.f;
        int i11 = (size - bVar.a) - bVar.c;
        int i12 = (size2 - bVar.b) - bVar.d;
        Point point = AndroidUtilities.displaySize;
        point.x = i11;
        point.y = i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, TLObject.FLAG_30);
                int i14 = layoutParams.height;
                int makeMeasureSpec2 = i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, TLObject.FLAG_30);
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).e0()) {
                    childAt.forceLayout();
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.b = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i9) {
        Paint paint = this.d;
        if (paint.getColor() != i9) {
            paint.setColor(i9);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(b5 b5Var) {
        this.a = b5Var;
    }
}
