package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ch extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jh c;

    public /* synthetic */ ch(jh jhVar, boolean z9, int i7) {
        this.a = i7;
        this.c = jhVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jh jhVar = this.c;
                di diVar = jhVar.e;
                boolean z9 = this.b;
                if (z9) {
                    diVar.r3.setVisibility(8);
                } else {
                    diVar.y3.setVisibility(8);
                }
                int L = z9 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i7 = 0; i7 < diVar.r2.size(); i7++) {
                    ((hi.c4) diVar.r2.valueAt(i7)).setMeasureOffsetY(L);
                }
                if (jhVar.a == animator) {
                    jhVar.a = null;
                    break;
                }
                break;
            default:
                di diVar2 = this.c.e;
                boolean z10 = this.b;
                diVar2.v3 = z10;
                if (!z10) {
                    diVar2.w3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                di diVar = this.c.e;
                if (this.b) {
                    diVar.y3.setAlpha(0.0f);
                    diVar.y3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < diVar.r2.size(); i7++) {
                        ((hi.c4) diVar.r2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    diVar.r3.setAlpha(0.0f);
                    diVar.r3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
