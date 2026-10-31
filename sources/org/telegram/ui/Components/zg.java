package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gh c;

    public /* synthetic */ zg(gh ghVar, boolean z10, int i10) {
        this.a = i10;
        this.c = ghVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gh ghVar = this.c;
                bi biVar = ghVar.e;
                boolean z10 = this.b;
                if (z10) {
                    biVar.r3.setVisibility(8);
                } else {
                    biVar.y3.setVisibility(8);
                }
                int L = z10 ? org.telegram.messenger.i0.L(36.0f) : 0;
                for (int i10 = 0; i10 < biVar.r2.size(); i10++) {
                    ((xh.i3) biVar.r2.valueAt(i10)).setMeasureOffsetY(L);
                }
                if (ghVar.a == animator) {
                    ghVar.a = null;
                    break;
                }
                break;
            default:
                bi biVar2 = this.c.e;
                boolean z11 = this.b;
                biVar2.v3 = z11;
                if (!z11) {
                    biVar2.w3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                bi biVar = this.c.e;
                if (this.b) {
                    biVar.y3.setAlpha(0.0f);
                    biVar.y3.setVisibility(0);
                    int L = org.telegram.messenger.i0.L(36.0f);
                    for (int i10 = 0; i10 < biVar.r2.size(); i10++) {
                        ((xh.i3) biVar.r2.valueAt(i10)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    biVar.r3.setAlpha(0.0f);
                    biVar.r3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
