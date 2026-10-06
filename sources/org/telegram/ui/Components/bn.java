package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class bn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ bn(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
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
                xn xnVar = this.b;
                xnVar.f1 = false;
                xnVar.E.setTranslationY(0.0f);
                xnVar.Z();
                break;
        }
    }
}
