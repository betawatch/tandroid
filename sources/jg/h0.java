package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
