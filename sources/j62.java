// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j62 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a72 b;

    public /* synthetic */ j62(a72 a72Var, byte b) {
        this.a = b;
        this.b = a72Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.F.setTranslationY(0.0f);
                break;
            case 1:
                a72Var.F.setTranslationY(0.0f);
                break;
            default:
                a72Var.g1 = false;
                a72Var.F.setTranslationY(0.0f);
                a72Var.Z();
                break;
        }
    }
}
