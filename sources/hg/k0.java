package hg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k0 extends s4.k {
    @Override // s4.k
    public final void D(s4.b1 b1Var) {
        View view = b1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(b1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, b1Var, animate, view, 0)).start();
    }

    @Override // s4.k
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.k
    public final long L() {
        return 0L;
    }

    @Override // s4.l0
    public final long h() {
        return 220L;
    }

    @Override // s4.l0
    public final long j() {
        return 220L;
    }

    @Override // s4.k, s4.e1
    public final void p(s4.b1 b1Var) {
        super.p(b1Var);
        View view = b1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
