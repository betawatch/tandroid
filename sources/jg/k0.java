package jg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k0 extends v4.k {
    @Override // v4.k
    public final void D(v4.d1 d1Var) {
        View view = d1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(d1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, d1Var, animate, view, 0)).start();
    }

    @Override // v4.k
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // v4.k
    public final long L() {
        return 0L;
    }

    @Override // v4.l0
    public final long h() {
        return 220L;
    }

    @Override // v4.l0
    public final long j() {
        return 220L;
    }

    @Override // v4.k, v4.f1
    public final void p(v4.d1 d1Var) {
        super.p(d1Var);
        View view = d1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
