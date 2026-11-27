// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ge8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he8 b;

    public /* synthetic */ ge8(he8 he8Var, byte b) {
        this.a = b;
        this.b = he8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        he8 he8Var = this.b;
        switch (b) {
            case 0:
                he8Var.h = false;
                he8Var.a = he8Var.c;
                he8Var.invalidate();
                int i = he8Var.K;
                if (i >= 0) {
                    he8Var.b(i);
                    he8Var.K = -1;
                    break;
                }
                break;
            default:
                he8Var.n = false;
                he8Var.h = false;
                he8Var.invalidate();
                int i2 = he8Var.K;
                if (i2 >= 0) {
                    he8Var.b(i2);
                    he8Var.K = -1;
                }
                he8Var.a();
                break;
        }
    }
}
