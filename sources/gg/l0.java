package gg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l0 extends s4.j {
    @Override // s4.j
    public final void D(s4.c1 c1Var) {
        View view = c1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(c1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new k0(this, c1Var, animate, view, 0)).start();
    }

    @Override // s4.j
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // s4.j
    public final long L() {
        return 0L;
    }

    @Override // s4.m0
    public final long h() {
        return 220L;
    }

    @Override // s4.m0
    public final long j() {
        return 220L;
    }

    @Override // s4.j, s4.f1
    public final void p(s4.c1 c1Var) {
        super.p(c1Var);
        View view = c1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
