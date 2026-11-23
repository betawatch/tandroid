package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zh c;

    public /* synthetic */ sh(zh zhVar, boolean z10, int i7) {
        this.a = i7;
        this.c = zhVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                zh zhVar = this.c;
                ti tiVar = zhVar.e;
                boolean z10 = this.b;
                if (z10) {
                    tiVar.v3.setVisibility(8);
                } else {
                    tiVar.C3.setVisibility(8);
                }
                int L = z10 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i7 = 0; i7 < tiVar.v2.size(); i7++) {
                    ((ki.t3) tiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                }
                if (zhVar.a == animator) {
                    zhVar.a = null;
                    break;
                }
                break;
            default:
                ti tiVar2 = this.c.e;
                boolean z11 = this.b;
                tiVar2.z3 = z11;
                if (!z11) {
                    tiVar2.A3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ti tiVar = this.c.e;
                if (this.b) {
                    tiVar.C3.setAlpha(0.0f);
                    tiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < tiVar.v2.size(); i7++) {
                        ((ki.t3) tiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    tiVar.v3.setAlpha(0.0f);
                    tiVar.v3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
