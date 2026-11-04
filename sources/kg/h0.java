package kg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 extends u4.k {
    @Override // u4.k
    public final void D(u4.d1 d1Var) {
        View view = d1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(d1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new g0(this, d1Var, animate, view, 0)).start();
    }

    @Override // u4.k
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // u4.k
    public final long L() {
        return 0L;
    }

    @Override // u4.m0
    public final long h() {
        return 220L;
    }

    @Override // u4.m0
    public final long j() {
        return 220L;
    }

    @Override // u4.k, u4.f1
    public final void p(u4.d1 d1Var) {
        super.p(d1Var);
        View view = d1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
