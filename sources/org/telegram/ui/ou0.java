package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ou0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu0 b;

    public /* synthetic */ ou0(vu0 vu0Var, int i10) {
        this.a = i10;
        this.b = vu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N.setTranslationY(0.0f);
                break;
            case 1:
                this.b.N.setTranslationY(0.0f);
                break;
            default:
                vu0 vu0Var = this.b;
                vu0Var.getClass();
                vu0Var.N.setTranslationY(0.0f);
                vu0Var.l0();
                break;
        }
    }
}
