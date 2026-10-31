package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ bi(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vj vjVar;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.Xa = 0.0f;
                unVar.A9();
                break;
            case 1:
                un unVar2 = this.b;
                org.telegram.ui.Components.j50 j50Var = unVar2.p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(false);
                    unVar2.p3.c(true);
                    unVar2.p3.setVisibility(4);
                    break;
                }
                break;
            case 2:
                float L = org.telegram.messenger.i0.L(30.0f);
                un unVar3 = this.b;
                unVar3.T9 = L;
                unVar3.A9();
                break;
            case 3:
                un unVar4 = this.b;
                if (unVar4.fragmentView != null && (vjVar = unVar4.z0) != null) {
                    vjVar.invalidate();
                    unVar4.fragmentView.invalidate();
                    break;
                }
                break;
            case 4:
                this.b.Q.setVisibility(4);
                break;
            case 5:
                org.telegram.messenger.i0.h3(new rh(this, 5), 2000L);
                break;
            case 6:
                un unVar5 = this.b;
                if (animator.equals(unVar5.u3)) {
                    unVar5.u3 = null;
                    break;
                }
                break;
            case 7:
                un unVar6 = this.b;
                if (animator.equals(unVar6.u3)) {
                    unVar6.u3 = null;
                    break;
                }
                break;
            case 8:
                un unVar7 = this.b;
                if (animator.equals(unVar7.v3)) {
                    unVar7.w3 = 1.0f;
                    unVar7.Fc();
                    unVar7.v3 = null;
                    break;
                }
                break;
            case 9:
                un unVar8 = this.b;
                if (animator.equals(unVar8.v3)) {
                    unVar8.w3 = 0.0f;
                    unVar8.Fc();
                    unVar8.v3 = null;
                    break;
                }
                break;
            case 10:
                this.b.f5 = null;
                break;
            default:
                un unVar9 = this.b;
                unVar9.Xa = 1.0f;
                unVar9.Z.setVisibility(4);
                unVar9.c1.setVisibility(4);
                unVar9.A9();
                break;
        }
    }
}
