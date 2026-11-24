// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h65 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h75 b;

    public /* synthetic */ h65(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                h75Var.O1.setVisibility(4);
                h75Var.P1.setVisibility(4);
                h75Var.N1.setVisibility(4);
                break;
            default:
                h75Var.a2 = null;
                break;
        }
    }
}
