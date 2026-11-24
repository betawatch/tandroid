// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class he5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ke5 b;

    public /* synthetic */ he5(ke5 ke5Var, byte b) {
        this.a = b;
        this.b = ke5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ke5 ke5Var = this.b;
        switch (b) {
            case 0:
                ke5Var.d = null;
                iu4 iu4Var = new iu4(this, (byte) 22);
                ke5Var.e = iu4Var;
                gl.d3(iu4Var, ke5Var.w);
                break;
            default:
                ke5Var.setVisibility(4);
                ke5Var.c = null;
                ke5Var.d = null;
                break;
        }
    }
}
