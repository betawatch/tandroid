// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f94 extends AnimatorListenerAdapter {
    public final /* synthetic */ h94 a;

    public f94(h94 h94Var) {
        this.a = h94Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h94 h94Var = this.a;
        if (h94Var.r) {
            h94Var.d.setVisibility(4);
        } else {
            h94Var.e.setVisibility(4);
        }
    }
}
