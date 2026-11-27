// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l04 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ o24 c;

    public /* synthetic */ l04(o24 o24Var, boolean z, byte b) {
        this.a = b;
        this.c = o24Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o24 o24Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    o24Var.y.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    o24Var.E.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
