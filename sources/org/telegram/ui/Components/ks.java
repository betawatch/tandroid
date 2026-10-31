package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ks extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.v2 c;
    public final /* synthetic */ ps d;

    public /* synthetic */ ks(ps psVar, s4.c1 c1Var, org.telegram.ui.Cells.v2 v2Var, int i10) {
        this.a = i10;
        this.d = psVar;
        this.b = c1Var;
        this.c = v2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.v2 v2Var = this.c;
                v2Var.setClipProgress(0.0f);
                v2Var.setElevation(0.0f);
                ps psVar = this.d;
                s4.c1 c1Var = this.b;
                psVar.d(c1Var);
                psVar.x.remove(c1Var);
                psVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.v2 v2Var2 = this.c;
                v2Var2.setClipProgress(0.0f);
                v2Var2.setElevation(0.0f);
                ps psVar2 = this.d;
                s4.c1 c1Var2 = this.b;
                psVar2.d(c1Var2);
                psVar2.x.remove(c1Var2);
                psVar2.A();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.y();
                break;
            default:
                this.d.y();
                break;
        }
    }
}
