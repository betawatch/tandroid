package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv0 b;

    public /* synthetic */ fv0(mv0 mv0Var, int i10) {
        this.a = i10;
        this.b = mv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O.setTranslationY(0.0f);
                break;
            case 1:
                this.b.O.setTranslationY(0.0f);
                break;
            default:
                mv0 mv0Var = this.b;
                mv0Var.getClass();
                mv0Var.O.setTranslationY(0.0f);
                mv0Var.l0();
                break;
        }
    }
}
