package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                org.telegram.ui.Components.t40 t40Var = anVar.p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    anVar.p3.d(true);
                    anVar.p3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float L = org.telegram.messenger.g0.L(30.0f);
                an anVar2 = this.b;
                anVar2.T9 = L;
                anVar2.K9();
                break;
            case 2:
                an anVar3 = this.b;
                if (anVar3.fragmentView != null && (ajVar = anVar3.z0) != null) {
                    ajVar.invalidate();
                    anVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.Q.setVisibility(4);
                break;
            case 4:
                an anVar4 = this.b;
                if (animator.equals(anVar4.u3)) {
                    anVar4.u3 = null;
                    break;
                }
                break;
            case 5:
                an anVar5 = this.b;
                if (animator.equals(anVar5.u3)) {
                    anVar5.u3 = null;
                    break;
                }
                break;
            case 6:
                an anVar6 = this.b;
                if (animator.equals(anVar6.v3)) {
                    anVar6.w3 = 1.0f;
                    anVar6.Pc();
                    anVar6.v3 = null;
                    break;
                }
                break;
            case 7:
                an anVar7 = this.b;
                if (animator.equals(anVar7.v3)) {
                    anVar7.w3 = 0.0f;
                    anVar7.Pc();
                    anVar7.v3 = null;
                    break;
                }
                break;
            case 8:
                this.b.f5 = null;
                break;
            case 9:
                an anVar8 = this.b;
                anVar8.Xa = 1.0f;
                anVar8.Z.setVisibility(4);
                anVar8.c1.setVisibility(4);
                anVar8.K9();
                break;
            default:
                an anVar9 = this.b;
                anVar9.Xa = 0.0f;
                anVar9.K9();
                break;
        }
    }
}
