// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lp1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ lp1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jq1 jq1Var;
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    mu1Var.q3.m();
                    mu1Var.q3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                mu1Var.X9 = gl.L(30.0f);
                mu1Var.E7();
                break;
            case 2:
                if (mu1Var.fragmentView != null && (jq1Var = mu1Var.A0) != null) {
                    jq1Var.invalidate();
                    mu1Var.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                mu1Var.R.setVisibility(4);
                break;
            case 4:
                if (animator.equals(mu1Var.v3)) {
                    mu1Var.v3 = null;
                    break;
                }
                break;
            case 5:
                if (animator.equals(mu1Var.v3)) {
                    mu1Var.v3 = null;
                    break;
                }
                break;
            case 6:
                if (animator.equals(mu1Var.w3)) {
                    mu1Var.x3 = 1.0f;
                    mu1Var.Fc();
                    mu1Var.w3 = null;
                    break;
                }
                break;
            case 7:
                if (animator.equals(mu1Var.w3)) {
                    mu1Var.x3 = 0.0f;
                    mu1Var.Fc();
                    mu1Var.w3 = null;
                    break;
                }
                break;
            case 8:
                mu1Var.h5 = null;
                break;
            case 9:
                mu1Var.bb = 1.0f;
                mu1Var.a0.setVisibility(4);
                mu1Var.d1.setVisibility(4);
                mu1Var.E7();
                break;
            default:
                mu1Var.bb = 0.0f;
                mu1Var.E7();
                break;
        }
    }
}
