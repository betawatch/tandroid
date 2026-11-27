// default package

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class lh4 extends zb3 {
    @Override // zb3
    public final void D(f89 f89Var) {
        View view = f89Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(f89Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new wa2(this, f89Var, animate, view)).start();
    }

    @Override // zb3
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override // zb3
    public final long L() {
        return 0L;
    }

    @Override // o79
    public final long h() {
        return 220L;
    }

    @Override // o79
    public final long j() {
        return 220L;
    }

    @Override // zb3, cma
    public final void p(f89 f89Var) {
        super.p(f89Var);
        View view = f89Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
