package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
