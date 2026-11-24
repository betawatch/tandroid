// default package

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class oh4 extends sc3 {
    @Override // sc3
    public final void D(u69 u69Var) {
        View view = u69Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(u69Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new rb2(this, u69Var, animate, view)).start();
    }

    @Override // sc3
    public final long K(long j, long j2, long j3) {
        return 0L;
    }

    @Override // sc3
    public final long L() {
        return 0L;
    }

    @Override // d69
    public final long h() {
        return 220L;
    }

    @Override // d69
    public final long j() {
        return 220L;
    }

    @Override // sc3, jka
    public final void p(u69 u69Var) {
        super.p(u69Var);
        View view = u69Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
