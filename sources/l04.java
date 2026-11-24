// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l04 extends t59 {
    public boolean g3;
    public final /* synthetic */ e34 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l04(e34 e34Var, Context context) {
        super(context, null);
        this.h3 = e34Var;
    }

    @Override // t59, r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        e34 e34Var = this.h3;
        z24 z24Var = e34Var.A0;
        byte b = 0;
        if (e34Var.D0 != null) {
            e34Var.C0.setUnderlineHeight(e34Var.E0.canScrollVertically(-1) ? gm.e1() : 0);
        }
        if (z24Var != null && getAdapter() == z24Var && z24Var.d == 0) {
            z24 z24Var2 = z24Var.P.x;
            if (z24Var2.R.H0.G || z24Var2.E) {
                return;
            }
            if (e34Var.F0.M0() + 50 > z24Var.b()) {
                y24 y24Var = z24Var.P;
                Objects.requireNonNull(y24Var);
                gm.c3(new k04(y24Var, b));
            }
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e34 e34Var = this.h3;
        if (e34Var.f) {
            return false;
        }
        hx2 e = hx2.e();
        l04 l04Var = e34Var.E0;
        e34Var.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, l04Var, e34Var.h2, this.o2);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e34 e34Var = this.h3;
        if (e34Var.J0 && e34Var.z0.b() > 0) {
            this.g3 = true;
            e34Var.F0.g1(0, 0);
            e34Var.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        e34Var.n(true);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
