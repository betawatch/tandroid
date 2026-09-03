package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ wm(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
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
                rn rnVar = this.b;
                rnVar.c1 = false;
                rnVar.B.setTranslationY(0.0f);
                rnVar.a0();
                break;
        }
    }
}
