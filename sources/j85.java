// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j85 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j95 b;

    public /* synthetic */ j85(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                j95Var.O1.setVisibility(4);
                j95Var.P1.setVisibility(4);
                j95Var.N1.setVisibility(4);
                break;
            default:
                j95Var.a2 = null;
                break;
        }
    }
}
