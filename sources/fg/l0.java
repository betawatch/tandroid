package fg;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
