package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ o0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c2.setTranslationY(0.0f);
                break;
            default:
                c1 c1Var = this.b;
                c1Var.f2 = false;
                c1Var.c2.setTranslationY(0.0f);
                c1Var.m0();
                break;
        }
    }
}
