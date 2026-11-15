package jg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k0 extends v4.k {
    @Override // v4.k
    public final void D(v4.e1 e1Var) {
        View view = e1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(e1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, e1Var, animate, view, 0)).start();
    }

    @Override // v4.k
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // v4.k
    public final long L() {
        return 0L;
    }

    @Override // v4.m0
    public final long h() {
        return 220L;
    }

    @Override // v4.m0
    public final long j() {
        return 220L;
    }

    @Override // v4.k, v4.g1
    public final void p(v4.e1 e1Var) {
        super.p(e1Var);
        View view = e1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
