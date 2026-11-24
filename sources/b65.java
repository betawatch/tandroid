// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b65 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h85 b;
    public final /* synthetic */ h75 c;

    public /* synthetic */ b65(h75 h75Var, h85 h85Var, byte b) {
        this.a = b;
        this.c = h75Var;
        this.b = h85Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h75 h75Var = this.c;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                if (h85Var.getParent() != null) {
                    h75Var.b.removeView(h85Var);
                    break;
                }
                break;
            default:
                if (h85Var.getParent() != null) {
                    h75Var.b.removeView(h85Var);
                    break;
                }
                break;
        }
    }
}
