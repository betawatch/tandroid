package ig;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l0 extends s4.l {
    @Override // s4.l
    public final void D(s4.e1 e1Var) {
        View view = e1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(e1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new k0(this, e1Var, animate, view, 0)).start();
    }

    @Override // s4.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.l
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

    @Override // s4.l, s4.g1
    public final void p(s4.e1 e1Var) {
        super.p(e1Var);
        View view = e1Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
