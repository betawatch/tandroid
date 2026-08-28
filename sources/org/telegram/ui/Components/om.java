package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class om extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ om(jn jnVar, int i9) {
        this.a = i9;
        this.b = jnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.A.setTranslationY(0.0f);
                break;
            case 1:
                this.b.A.setTranslationY(0.0f);
                break;
            default:
                jn jnVar = this.b;
                jnVar.b1 = false;
                jnVar.A.setTranslationY(0.0f);
                jnVar.Z();
                break;
        }
    }
}
