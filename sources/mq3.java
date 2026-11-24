// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mq3 extends FrameLayout {
    public ui5 a;
    public ActionBarLayout b;
    public boolean c;
    public final Paint d;
    public vxc e;
    public io5 f;
    public io5 h;

    public mq3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        io5 io5Var = io5.e;
        this.f = io5Var;
        this.h = io5Var;
        vu2 vu2Var = new vu2(this, (byte) 26);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(this, vu2Var);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        vxc vxcVar = this.e;
        if (vxcVar != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                jdc.b(view, vxcVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.b.P(canvas, this);
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
        return ((ActionBarLayout) this.a).h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c = true;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e) {
                    fa4.g(e, true);
                    boolean z2 = w01.a;
                    throw e;
                }
            }
        }
        this.c = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        io5 io5Var = this.f;
        int i3 = (size - io5Var.a) - io5Var.c;
        int i4 = (size2 - io5Var.b) - io5Var.d;
        Point point = gl.q;
        point.x = i3;
        point.y = i4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, TLObject.FLAG_30);
                int i6 = layoutParams.height;
                int makeMeasureSpec2 = i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, TLObject.FLAG_30);
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).h0()) {
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

    public void setInternalNavigationBarColor(int i) {
        Paint paint = this.d;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(ui5 ui5Var) {
        this.a = ui5Var;
    }
}
