// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ig5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lg5 b;

    public /* synthetic */ ig5(lg5 lg5Var, byte b) {
        this.a = b;
        this.b = lg5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lg5 lg5Var = this.b;
        switch (b) {
            case 0:
                lg5Var.d = null;
                ea5 ea5Var = new ea5(this, (byte) 7);
                lg5Var.e = ea5Var;
                hl.d3(ea5Var, lg5Var.w);
                break;
            default:
                lg5Var.setVisibility(4);
                lg5Var.c = null;
                lg5Var.d = null;
                break;
        }
    }
}
