package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ gi(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cj cjVar;
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                org.telegram.ui.Components.u40 u40Var = cnVar.p3;
                if (u40Var != null) {
                    u40Var.setIsMessageTransition(false);
                    cnVar.p3.d(true);
                    cnVar.p3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float L = org.telegram.messenger.g0.L(30.0f);
                cn cnVar2 = this.b;
                cnVar2.V9 = L;
                cnVar2.L9();
                break;
            case 2:
                cn cnVar3 = this.b;
                if (cnVar3.fragmentView != null && (cjVar = cnVar3.z0) != null) {
                    cjVar.invalidate();
                    cnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.Q.setVisibility(4);
                break;
            case 4:
                cn cnVar4 = this.b;
                if (animator.equals(cnVar4.u3)) {
                    cnVar4.u3 = null;
                    break;
                }
                break;
            case 5:
                cn cnVar5 = this.b;
                if (animator.equals(cnVar5.u3)) {
                    cnVar5.u3 = null;
                    break;
                }
                break;
            case 6:
                cn cnVar6 = this.b;
                if (animator.equals(cnVar6.v3)) {
                    cnVar6.w3 = 1.0f;
                    cnVar6.Sc();
                    cnVar6.v3 = null;
                    break;
                }
                break;
            case 7:
                cn cnVar7 = this.b;
                if (animator.equals(cnVar7.v3)) {
                    cnVar7.w3 = 0.0f;
                    cnVar7.Sc();
                    cnVar7.v3 = null;
                    break;
                }
                break;
            case 8:
                this.b.f5 = null;
                break;
            case 9:
                cn cnVar8 = this.b;
                cnVar8.Za = 1.0f;
                cnVar8.Z.setVisibility(4);
                cnVar8.c1.setVisibility(4);
                cnVar8.L9();
                break;
            default:
                cn cnVar9 = this.b;
                cnVar9.Za = 0.0f;
                cnVar9.L9();
                break;
        }
    }
}
