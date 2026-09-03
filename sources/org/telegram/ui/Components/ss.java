package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ss extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.l1 b;
    public final /* synthetic */ org.telegram.ui.Cells.q2 c;
    public final /* synthetic */ xs d;

    public /* synthetic */ ss(xs xsVar, f2.l1 l1Var, org.telegram.ui.Cells.q2 q2Var, int i10) {
        this.a = i10;
        this.d = xsVar;
        this.b = l1Var;
        this.c = q2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var = this.c;
                q2Var.setClipProgress(0.0f);
                q2Var.setElevation(0.0f);
                xs xsVar = this.d;
                f2.l1 l1Var = this.b;
                xsVar.d(l1Var);
                xsVar.x.remove(l1Var);
                xsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var2 = this.c;
                q2Var2.setClipProgress(0.0f);
                q2Var2.setElevation(0.0f);
                xs xsVar2 = this.d;
                f2.l1 l1Var2 = this.b;
                xsVar2.d(l1Var2);
                xsVar2.x.remove(l1Var2);
                xsVar2.A();
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
