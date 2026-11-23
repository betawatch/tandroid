package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ei extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ ei(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bj bjVar;
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                org.telegram.ui.Components.e50 e50Var = bnVar.q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(false);
                    bnVar.q3.d(true);
                    bnVar.q3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float L = org.telegram.messenger.g0.L(30.0f);
                bn bnVar2 = this.b;
                bnVar2.X9 = L;
                bnVar2.M9();
                break;
            case 2:
                bn bnVar3 = this.b;
                if (bnVar3.fragmentView != null && (bjVar = bnVar3.A0) != null) {
                    bjVar.invalidate();
                    bnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.R.setVisibility(4);
                break;
            case 4:
                bn bnVar4 = this.b;
                if (animator.equals(bnVar4.v3)) {
                    bnVar4.v3 = null;
                    break;
                }
                break;
            case 5:
                bn bnVar5 = this.b;
                if (animator.equals(bnVar5.v3)) {
                    bnVar5.v3 = null;
                    break;
                }
                break;
            case 6:
                bn bnVar6 = this.b;
                if (animator.equals(bnVar6.w3)) {
                    bnVar6.x3 = 1.0f;
                    bnVar6.Tc();
                    bnVar6.w3 = null;
                    break;
                }
                break;
            case 7:
                bn bnVar7 = this.b;
                if (animator.equals(bnVar7.w3)) {
                    bnVar7.x3 = 0.0f;
                    bnVar7.Tc();
                    bnVar7.w3 = null;
                    break;
                }
                break;
            case 8:
                this.b.h5 = null;
                break;
            case 9:
                bn bnVar8 = this.b;
                bnVar8.bb = 1.0f;
                bnVar8.a0.setVisibility(4);
                bnVar8.d1.setVisibility(4);
                bnVar8.M9();
                break;
            default:
                bn bnVar9 = this.b;
                bnVar9.bb = 0.0f;
                bnVar9.M9();
                break;
        }
    }
}
