package of;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i0 extends f2.n {
    @Override // f2.n
    public final void D(f2.q1 q1Var) {
        View view = q1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(q1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new h0(this, q1Var, animate, view, 0)).start();
    }

    @Override // f2.n
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.n
    public final long L() {
        return 0L;
    }

    @Override // f2.w0
    public final long h() {
        return 220L;
    }

    @Override // f2.w0
    public final long j() {
        return 220L;
    }

    @Override // f2.n, f2.t1
    public final void p(f2.q1 q1Var) {
        super.p(q1Var);
        View view = q1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
