// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                mu1Var.G7();
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
                    mu1Var.Hc();
                    mu1Var.w3 = null;
                    break;
                }
                break;
            case 7:
                if (animator.equals(mu1Var.w3)) {
                    mu1Var.x3 = 0.0f;
                    mu1Var.Hc();
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
                mu1Var.G7();
                break;
            default:
                mu1Var.bb = 0.0f;
                mu1Var.G7();
                break;
        }
    }
}
