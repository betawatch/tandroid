package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ih c;

    public /* synthetic */ bh(ih ihVar, boolean z9, int i7) {
        this.a = i7;
        this.c = ihVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ih ihVar = this.c;
                ci ciVar = ihVar.e;
                boolean z9 = this.b;
                if (z9) {
                    ciVar.u3.setVisibility(8);
                } else {
                    ciVar.B3.setVisibility(8);
                }
                int L = z9 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i7 = 0; i7 < ciVar.u2.size(); i7++) {
                    ((hi.c4) ciVar.u2.valueAt(i7)).setMeasureOffsetY(L);
                }
                if (ihVar.a == animator) {
                    ihVar.a = null;
                    break;
                }
                break;
            default:
                ci ciVar2 = this.c.e;
                boolean z10 = this.b;
                ciVar2.y3 = z10;
                if (!z10) {
                    ciVar2.z3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ci ciVar = this.c.e;
                if (this.b) {
                    ciVar.B3.setAlpha(0.0f);
                    ciVar.B3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < ciVar.u2.size(); i7++) {
                        ((hi.c4) ciVar.u2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    ciVar.u3.setAlpha(0.0f);
                    ciVar.u3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
