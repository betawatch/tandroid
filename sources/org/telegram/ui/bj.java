package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ bj(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ak akVar;
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                org.telegram.ui.Components.u60 u60Var = foVar.b3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    foVar.b3.c(true);
                    foVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                fo foVar2 = this.b;
                foVar2.A9 = dp;
                foVar2.t9();
                break;
            case 2:
                fo foVar3 = this.b;
                if (foVar3.fragmentView != null && (akVar = foVar3.x0) != null) {
                    akVar.invalidate();
                    foVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gj(this, 4), 2000L);
                break;
            case 5:
                fo foVar4 = this.b;
                if (animator.equals(foVar4.g3)) {
                    foVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                fo foVar5 = this.b;
                if (animator.equals(foVar5.g3)) {
                    foVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                fo foVar6 = this.b;
                if (animator.equals(foVar6.h3)) {
                    foVar6.i3 = 1.0f;
                    foVar6.pc();
                    foVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                fo foVar7 = this.b;
                if (animator.equals(foVar7.h3)) {
                    foVar7.i3 = 0.0f;
                    foVar7.pc();
                    foVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                fo foVar8 = this.b;
                foVar8.Ea = 1.0f;
                foVar8.Y.setVisibility(4);
                foVar8.O0.setVisibility(4);
                foVar8.t9();
                break;
            default:
                fo foVar9 = this.b;
                foVar9.Ea = 0.0f;
                foVar9.t9();
                break;
        }
    }
}
