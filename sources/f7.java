// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ f7(s7 s7Var, byte b) {
        this.a = b;
        this.b = s7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                s7Var.s.setVisibility(4);
                s7Var.w = null;
                break;
            default:
                s7Var.w = null;
                break;
        }
    }
}
