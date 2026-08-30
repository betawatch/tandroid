package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ vm(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.B.setTranslationY(0.0f);
                break;
            case 1:
                this.b.B.setTranslationY(0.0f);
                break;
            default:
                qn qnVar = this.b;
                qnVar.c1 = false;
                qnVar.B.setTranslationY(0.0f);
                qnVar.a0();
                break;
        }
    }
}
