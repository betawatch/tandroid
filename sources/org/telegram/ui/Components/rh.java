package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yh c;

    public /* synthetic */ rh(yh yhVar, boolean z10, int i7) {
        this.a = i7;
        this.c = yhVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yh yhVar = this.c;
                si siVar = yhVar.e;
                boolean z10 = this.b;
                if (z10) {
                    siVar.v3.setVisibility(8);
                } else {
                    siVar.C3.setVisibility(8);
                }
                int L = z10 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i7 = 0; i7 < siVar.v2.size(); i7++) {
                    ((ki.t3) siVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                }
                if (yhVar.a == animator) {
                    yhVar.a = null;
                    break;
                }
                break;
            default:
                si siVar2 = this.c.e;
                boolean z11 = this.b;
                siVar2.z3 = z11;
                if (!z11) {
                    siVar2.A3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                si siVar = this.c.e;
                if (this.b) {
                    siVar.C3.setAlpha(0.0f);
                    siVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < siVar.v2.size(); i7++) {
                        ((ki.t3) siVar.v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    siVar.v3.setAlpha(0.0f);
                    siVar.v3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
