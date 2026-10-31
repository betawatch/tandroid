package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ h0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O1.setTranslationY(0.0f);
                break;
            default:
                r0 r0Var = this.b;
                r0Var.R1 = false;
                r0Var.O1.setTranslationY(0.0f);
                r0Var.l0();
                break;
        }
    }
}
