package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;

    public /* synthetic */ jn(go goVar, int i10) {
        this.a = i10;
        this.b = goVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.E.setTranslationY(0.0f);
                break;
            case 1:
                this.b.E.setTranslationY(0.0f);
                break;
            default:
                go goVar = this.b;
                goVar.f1 = false;
                goVar.E.setTranslationY(0.0f);
                goVar.d0();
                break;
        }
    }
}
