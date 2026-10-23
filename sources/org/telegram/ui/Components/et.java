package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class et extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.b1 b;
    public final /* synthetic */ org.telegram.ui.Cells.q2 c;
    public final /* synthetic */ kt d;

    public /* synthetic */ et(kt ktVar, s4.b1 b1Var, org.telegram.ui.Cells.q2 q2Var, int i10) {
        this.a = i10;
        this.d = ktVar;
        this.b = b1Var;
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
                kt ktVar = this.d;
                s4.b1 b1Var = this.b;
                ktVar.d(b1Var);
                ktVar.x.remove(b1Var);
                ktVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var2 = this.c;
                q2Var2.setClipProgress(0.0f);
                q2Var2.setElevation(0.0f);
                kt ktVar2 = this.d;
                s4.b1 b1Var2 = this.b;
                ktVar2.d(b1Var2);
                ktVar2.x.remove(b1Var2);
                ktVar2.A();
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
