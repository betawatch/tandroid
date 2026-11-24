// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hr5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ir5 b;

    public /* synthetic */ hr5(ir5 ir5Var, byte b) {
        this.a = b;
        this.b = ir5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ir5 ir5Var = this.b;
        switch (b) {
            case 0:
                ir5Var.e.X1 = null;
                ir5Var.requestLayout();
                break;
            default:
                ir5Var.e.X1 = null;
                ir5Var.a = false;
                break;
        }
    }
}
