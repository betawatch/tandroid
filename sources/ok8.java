// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ok8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sk8 b;

    public /* synthetic */ ok8(sk8 sk8Var, byte b) {
        this.a = b;
        this.b = sk8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sk8 sk8Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (sk8Var.getParent() != null) {
                    ((ViewGroup) sk8Var.getParent()).removeView(sk8Var);
                    break;
                }
                break;
            case 1:
                if (sk8Var.getParent() != null) {
                    ((ViewGroup) sk8Var.getParent()).removeView(sk8Var);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                if (sk8Var.getParent() != null) {
                    ((ViewGroup) sk8Var.getParent()).removeView(sk8Var);
                    break;
                }
                break;
        }
    }
}
