package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ l5(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.X1 = 0.0f;
                f6Var.V1.setAlpha(1.0f);
                f6Var.V1.setVisibility(8);
                f6Var.V1.n();
                break;
            case 1:
                this.b.l2.setTranslationY(0.0f);
                break;
            default:
                f6 f6Var2 = this.b;
                f6Var2.o2 = false;
                f6Var2.l2.setTranslationY(0.0f);
                f6Var2.w0();
                break;
        }
    }
}
