package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gh c;

    public /* synthetic */ zg(gh ghVar, boolean z10, int i3) {
        this.a = i3;
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
                    biVar.s3.setVisibility(8);
                } else {
                    biVar.z3.setVisibility(8);
                }
                int L = z10 ? org.telegram.messenger.g0.L(36.0f) : 0;
                for (int i3 = 0; i3 < biVar.s2.size(); i3++) {
                    ((ii.d4) biVar.s2.valueAt(i3)).setMeasureOffsetY(L);
                }
                if (ghVar.a == animator) {
                    ghVar.a = null;
                    break;
                }
                break;
            default:
                bi biVar2 = this.c.e;
                boolean z11 = this.b;
                biVar2.w3 = z11;
                if (!z11) {
                    biVar2.x3.setVisibility(8);
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
                    biVar.z3.setAlpha(0.0f);
                    biVar.z3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i3 = 0; i3 < biVar.s2.size(); i3++) {
                        ((ii.d4) biVar.s2.valueAt(i3)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    biVar.s3.setAlpha(0.0f);
                    biVar.s3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
