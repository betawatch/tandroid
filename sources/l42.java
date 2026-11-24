// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l42 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ m42 b;

    public l42(m42 m42Var) {
        this.b = m42Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        m42 m42Var = this.b;
        switch (b) {
            case 0:
                ((o42) m42Var.d).V.e();
                break;
            default:
                tk4 tk4Var = m42Var.b;
                tk4Var.setAlpha(1.0f);
                f69.w0(tk4Var);
                ((o42) m42Var.d).Y.r.removeView(tk4Var);
                break;
        }
    }

    public l42(m42 m42Var, f69 f69Var) {
        this.b = m42Var;
    }
}
