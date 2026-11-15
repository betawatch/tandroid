package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ qm(jn jnVar, int i7) {
        this.a = i7;
        this.b = jnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.F.setTranslationY(0.0f);
                break;
            case 1:
                this.b.F.setTranslationY(0.0f);
                break;
            default:
                jn jnVar = this.b;
                jnVar.g1 = false;
                jnVar.F.setTranslationY(0.0f);
                jnVar.f0();
                break;
        }
    }
}
