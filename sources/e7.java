// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ e7(r7 r7Var, byte b) {
        this.a = b;
        this.b = r7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                r7Var.s.setVisibility(4);
                r7Var.w = null;
                break;
            default:
                r7Var.w = null;
                break;
        }
    }
}
