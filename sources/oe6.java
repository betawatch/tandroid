// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oe6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mh6 b;

    public /* synthetic */ oe6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                if (mh6Var.d == animator) {
                    mh6Var.d = null;
                    break;
                }
                break;
            default:
                mh6Var.c.setVisibility(8);
                if (mh6Var.d == animator) {
                    mh6Var.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
