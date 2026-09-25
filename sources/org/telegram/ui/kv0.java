package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class kv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ kv0(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
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
                rv0 rv0Var = this.b;
                rv0Var.getClass();
                rv0Var.R.setTranslationY(0.0f);
                rv0Var.l0();
                break;
        }
    }
}
