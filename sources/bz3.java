// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bz3 extends q39 {
    public boolean g3;
    public final /* synthetic */ t14 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz3(t14 t14Var, Context context) {
        super(context, null);
        this.h3 = t14Var;
    }

    @Override // q39, o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        t14 t14Var = this.h3;
        o14 o14Var = t14Var.A0;
        byte b = 0;
        if (t14Var.D0 != null) {
            t14Var.C0.setUnderlineHeight(t14Var.E0.canScrollVertically(-1) ? gl.e1() : 0);
        }
        if (o14Var != null && getAdapter() == o14Var && o14Var.d == 0) {
            o14 o14Var2 = o14Var.P.x;
            if (o14Var2.R.H0.G || o14Var2.E) {
                return;
            }
            if (t14Var.F0.M0() + 50 > o14Var.b()) {
                n14 n14Var = o14Var.P;
                Objects.requireNonNull(n14Var);
                gl.d3(new az3(n14Var, b));
            }
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t14 t14Var = this.h3;
        if (t14Var.f) {
            return false;
        }
        xv2 e = xv2.e();
        bz3 bz3Var = t14Var.E0;
        t14Var.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, bz3Var, t14Var.h2, this.o2);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t14 t14Var = this.h3;
        if (t14Var.J0 && t14Var.z0.b() > 0) {
            this.g3 = true;
            t14Var.F0.g1(0, 0);
            t14Var.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        t14Var.n(true);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
