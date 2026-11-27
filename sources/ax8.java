// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ax8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bx8 b;

    public /* synthetic */ ax8(bx8 bx8Var, byte b) {
        this.a = b;
        this.b = bx8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        bx8 bx8Var = this.b;
        switch (b) {
            case 1:
                AnimatorSet animatorSet = bx8Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bx8Var.s = null;
                    bx8Var.getClass();
                    break;
                }
                break;
            case 2:
                AnimatorSet animatorSet2 = bx8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bx8Var.s = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        bx8 bx8Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = bx8Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bx8Var.h = null;
                }
                jn7.e().k(100, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = bx8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bx8Var.s = null;
                    if (bx8Var.x) {
                        bx8Var.setLayerType(0, null);
                    }
                }
                jn7.e().k(100, 512);
                break;
            default:
                AnimatorSet animatorSet3 = bx8Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bx8Var.s = null;
                    hl.c3(new uk8(this, (byte) 18));
                }
                jn7.e().k(100, 512);
                break;
        }
    }
}
