// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m16 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n16 b;
    public final /* synthetic */ o16 c;

    public /* synthetic */ m16(o16 o16Var, n16 n16Var, byte b) {
        this.a = b;
        this.c = o16Var;
        this.b = n16Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o16 o16Var = this.c;
        n16 n16Var = this.b;
        switch (b) {
            case 0:
                n16Var.f = null;
                o16Var.a();
                break;
            default:
                n16Var.f = null;
                o16Var.a();
                break;
        }
    }
}
