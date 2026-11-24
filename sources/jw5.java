// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jw5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw5 b;

    public /* synthetic */ jw5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                rw5Var.Z1.setTranslationY(0.0f);
                break;
            default:
                rw5Var.c2 = false;
                rw5Var.Z1.setTranslationY(0.0f);
                rw5Var.j0();
                break;
        }
    }
}
