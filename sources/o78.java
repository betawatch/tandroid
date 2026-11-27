// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o78 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r78 b;

    public /* synthetic */ o78(r78 r78Var, byte b) {
        this.a = b;
        this.b = r78Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r78 r78Var = this.b;
        switch (b) {
            case 0:
                r78Var.w1 = null;
                break;
            default:
                r78Var.x1 = null;
                break;
        }
    }
}
