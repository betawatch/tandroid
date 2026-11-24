// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class in9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;

    public /* synthetic */ in9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.Y = null;
                break;
            case 1:
                on9Var.V = null;
                break;
            default:
                on9Var.p0 = null;
                break;
        }
    }
}
