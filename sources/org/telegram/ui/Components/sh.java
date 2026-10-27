package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zh c;

    public /* synthetic */ sh(zh zhVar, boolean z10, int i10) {
        this.a = i10;
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
                    tiVar.A1.setVisibility(8);
                } else {
                    tiVar.H1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < tiVar.A0.size(); i10++) {
                    ((hi.o4) tiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (zhVar.a == animator) {
                    zhVar.a = null;
                    break;
                }
                break;
            default:
                ti tiVar2 = this.c.e;
                boolean z11 = this.b;
                tiVar2.E1 = z11;
                if (!z11) {
                    tiVar2.F1.setVisibility(8);
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
                    tiVar.H1.setAlpha(0.0f);
                    tiVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < tiVar.A0.size(); i10++) {
                        ((hi.o4) tiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    tiVar.A1.setAlpha(0.0f);
                    tiVar.A1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
