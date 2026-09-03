package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class um extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ um(pn pnVar, int i10) {
        this.a = i10;
        this.b = pnVar;
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
                pn pnVar = this.b;
                pnVar.c1 = false;
                pnVar.B.setTranslationY(0.0f);
                pnVar.a0();
                break;
        }
    }
}
