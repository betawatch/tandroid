// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jt5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt5 b;

    public /* synthetic */ jt5(kt5 kt5Var, byte b) {
        this.a = b;
        this.b = kt5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        kt5 kt5Var = this.b;
        switch (b) {
            case 0:
                kt5Var.e.X1 = null;
                kt5Var.requestLayout();
                break;
            default:
                kt5Var.e.X1 = null;
                kt5Var.a = false;
                break;
        }
    }
}
