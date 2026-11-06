package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ir0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr0 b;

    public /* synthetic */ ir0(pr0 pr0Var, int i7) {
        this.a = i7;
        this.b = pr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R.setTranslationY(0.0f);
                break;
            case 1:
                this.b.R.setTranslationY(0.0f);
                break;
            default:
                pr0 pr0Var = this.b;
                pr0Var.getClass();
                pr0Var.R.setTranslationY(0.0f);
                pr0Var.q0();
                break;
        }
    }
}
