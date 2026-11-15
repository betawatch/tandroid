package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ei extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ei(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aj ajVar;
        switch (this.a) {
            case 0:
                an anVar = this.b;
                org.telegram.ui.Components.w40 w40Var = anVar.q3;
                if (w40Var != null) {
                    w40Var.setIsMessageTransition(false);
                    anVar.q3.d(true);
                    anVar.q3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float L = org.telegram.messenger.g0.L(30.0f);
                an anVar2 = this.b;
                anVar2.W9 = L;
                anVar2.M9();
                break;
            case 2:
                an anVar3 = this.b;
                if (anVar3.fragmentView != null && (ajVar = anVar3.A0) != null) {
                    ajVar.invalidate();
                    anVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.R.setVisibility(4);
                break;
            case 4:
                an anVar4 = this.b;
                if (animator.equals(anVar4.v3)) {
                    anVar4.v3 = null;
                    break;
                }
                break;
            case 5:
                an anVar5 = this.b;
                if (animator.equals(anVar5.v3)) {
                    anVar5.v3 = null;
                    break;
                }
                break;
            case 6:
                an anVar6 = this.b;
                if (animator.equals(anVar6.w3)) {
                    anVar6.x3 = 1.0f;
                    anVar6.Tc();
                    anVar6.w3 = null;
                    break;
                }
                break;
            case 7:
                an anVar7 = this.b;
                if (animator.equals(anVar7.w3)) {
                    anVar7.x3 = 0.0f;
                    anVar7.Tc();
                    anVar7.w3 = null;
                    break;
                }
                break;
            case 8:
                this.b.g5 = null;
                break;
            case 9:
                an anVar8 = this.b;
                anVar8.ab = 1.0f;
                anVar8.a0.setVisibility(4);
                anVar8.d1.setVisibility(4);
                anVar8.M9();
                break;
            default:
                an anVar9 = this.b;
                anVar9.ab = 0.0f;
                anVar9.M9();
                break;
        }
    }
}
