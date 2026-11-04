package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ai extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ ai(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wi wiVar;
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                org.telegram.ui.Components.p40 p40Var = wmVar.q3;
                if (p40Var != null) {
                    p40Var.setIsMessageTransition(false);
                    wmVar.q3.c(true);
                    wmVar.q3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float L = org.telegram.messenger.g0.L(30.0f);
                wm wmVar2 = this.b;
                wmVar2.U9 = L;
                wmVar2.K9();
                break;
            case 2:
                wm wmVar3 = this.b;
                if (wmVar3.fragmentView != null && (wiVar = wmVar3.A0) != null) {
                    wiVar.invalidate();
                    wmVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.R.setVisibility(4);
                break;
            case 4:
                wm wmVar4 = this.b;
                if (animator.equals(wmVar4.v3)) {
                    wmVar4.v3 = null;
                    break;
                }
                break;
            case 5:
                wm wmVar5 = this.b;
                if (animator.equals(wmVar5.v3)) {
                    wmVar5.v3 = null;
                    break;
                }
                break;
            case 6:
                wm wmVar6 = this.b;
                if (animator.equals(wmVar6.w3)) {
                    wmVar6.x3 = 1.0f;
                    wmVar6.Pc();
                    wmVar6.w3 = null;
                    break;
                }
                break;
            case 7:
                wm wmVar7 = this.b;
                if (animator.equals(wmVar7.w3)) {
                    wmVar7.x3 = 0.0f;
                    wmVar7.Pc();
                    wmVar7.w3 = null;
                    break;
                }
                break;
            case 8:
                this.b.g5 = null;
                break;
            case 9:
                wm wmVar8 = this.b;
                wmVar8.Ya = 1.0f;
                wmVar8.a0.setVisibility(4);
                wmVar8.d1.setVisibility(4);
                wmVar8.K9();
                break;
            default:
                wm wmVar9 = this.b;
                wmVar9.Ya = 0.0f;
                wmVar9.K9();
                break;
        }
    }
}
