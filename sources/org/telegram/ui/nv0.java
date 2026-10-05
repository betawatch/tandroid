package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ nv0(uv0 uv0Var, int i10) {
        this.a = i10;
        this.b = uv0Var;
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
                uv0 uv0Var = this.b;
                uv0Var.getClass();
                uv0Var.R.setTranslationY(0.0f);
                uv0Var.l0();
                break;
        }
    }
}
