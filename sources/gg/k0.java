package gg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k0 extends s4.j {
    @Override // s4.j
    public final void D(s4.d1 d1Var) {
        View view = d1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(d1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, d1Var, animate, view, 0)).start();
    }

    @Override // s4.j
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // s4.j
    public final long L() {
        return 0L;
    }

    @Override // s4.n0
    public final long h() {
        return 220L;
    }

    @Override // s4.n0
    public final long j() {
        return 220L;
    }

    @Override // s4.j, s4.g1
    public final void p(s4.d1 d1Var) {
        super.p(d1Var);
        View view = d1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
