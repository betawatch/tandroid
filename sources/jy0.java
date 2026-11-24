// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ky0 b;

    public /* synthetic */ jy0(ky0 ky0Var, byte b) {
        this.a = b;
        this.b = ky0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ky0 ky0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = ky0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ky0Var.h = null;
                }
                nm7.e().k(100, 512);
                break;
            case 1:
                ky0Var.E = 0.0f;
                my0 my0Var = ky0Var.H;
                my0Var.b.setTranslationX(0.0f);
                my0Var.c.invalidate();
                break;
            case 2:
                my0 my0Var2 = ky0Var.H;
                my0Var2.O0 = true;
                my0Var2.b.setTranslationX(ky0Var.getMeasuredWidth());
                my0Var2.dismiss();
                my0Var2.c.invalidate();
                break;
            default:
                my0 my0Var3 = ky0Var.H;
                my0Var3.b.setTranslationY(0.0f);
                my0Var3.e0();
                my0Var3.n0(my0Var3.b.getTranslationY());
                ky0Var.invalidate();
                break;
        }
    }
}
