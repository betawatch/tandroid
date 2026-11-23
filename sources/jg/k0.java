package jg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
