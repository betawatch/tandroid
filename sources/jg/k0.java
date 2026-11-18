package jg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k0 extends v4.k {
    @Override // v4.k
    public final void D(v4.f1 f1Var) {
        View view = f1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(f1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, f1Var, animate, view, 0)).start();
    }

    @Override // v4.k
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override // v4.k
    public final long L() {
        return 0L;
    }

    @Override // v4.n0
    public final long h() {
        return 220L;
    }

    @Override // v4.n0
    public final long j() {
        return 220L;
    }

    @Override // v4.k, v4.h1
    public final void p(v4.f1 f1Var) {
        super.p(f1Var);
        View view = f1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
