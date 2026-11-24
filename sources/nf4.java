// default package

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class nf4 extends gb3 {
    @Override // gb3
    public final void D(s49 s49Var) {
        View view = s49Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(s49Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ga2(this, s49Var, animate, view)).start();
    }

    @Override // gb3
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override // gb3
    public final long L() {
        return 0L;
    }

    @Override // b49
    public final long h() {
        return 220L;
    }

    @Override // b49
    public final long j() {
        return 220L;
    }

    @Override // gb3, hia
    public final void p(s49 s49Var) {
        super.p(s49Var);
        View view = s49Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
