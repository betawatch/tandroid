package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;

    public /* synthetic */ tm(on onVar, int i10) {
        this.a = i10;
        this.b = onVar;
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
                on onVar = this.b;
                onVar.b1 = false;
                onVar.A.setTranslationY(0.0f);
                onVar.a0();
                break;
        }
    }
}
