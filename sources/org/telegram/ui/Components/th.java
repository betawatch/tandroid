package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class th extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ai c;

    public /* synthetic */ th(ai aiVar, boolean z10, int i7) {
        this.a = i7;
        this.c = aiVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ai aiVar = this.c;
                ui uiVar = aiVar.e;
                boolean z10 = this.b;
                if (z10) {
                    uiVar.v3.setVisibility(8);
                } else {
                    uiVar.C3.setVisibility(8);
                }
                int L = z10 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i7 = 0; i7 < uiVar.v2.size(); i7++) {
                    ((ki.s3) uiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                }
                if (aiVar.a == animator) {
                    aiVar.a = null;
                    break;
                }
                break;
            default:
                ui uiVar2 = this.c.e;
                boolean z11 = this.b;
                uiVar2.z3 = z11;
                if (!z11) {
                    uiVar2.A3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ui uiVar = this.c.e;
                if (this.b) {
                    uiVar.C3.setAlpha(0.0f);
                    uiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < uiVar.v2.size(); i7++) {
                        ((ki.s3) uiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    uiVar.v3.setAlpha(0.0f);
                    uiVar.v3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
