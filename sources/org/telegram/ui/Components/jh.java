package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class jh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qh c;

    public /* synthetic */ jh(qh qhVar, boolean z10, int i7) {
        this.a = i7;
        this.c = qhVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qh qhVar = this.c;
                ki kiVar = qhVar.e;
                boolean z10 = this.b;
                if (z10) {
                    kiVar.v3.setVisibility(8);
                } else {
                    kiVar.C3.setVisibility(8);
                }
                int L = z10 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i7 = 0; i7 < kiVar.v2.size(); i7++) {
                    ((ki.y3) kiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                }
                if (qhVar.a == animator) {
                    qhVar.a = null;
                    break;
                }
                break;
            default:
                ki kiVar2 = this.c.e;
                boolean z11 = this.b;
                kiVar2.z3 = z11;
                if (!z11) {
                    kiVar2.A3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ki kiVar = this.c.e;
                if (this.b) {
                    kiVar.C3.setAlpha(0.0f);
                    kiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < kiVar.v2.size(); i7++) {
                        ((ki.y3) kiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    kiVar.v3.setAlpha(0.0f);
                    kiVar.v3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
