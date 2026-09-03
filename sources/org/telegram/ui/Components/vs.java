package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.m1 b;
    public final /* synthetic */ org.telegram.ui.Cells.r2 c;
    public final /* synthetic */ at d;

    public /* synthetic */ vs(at atVar, f2.m1 m1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.a = i10;
        this.d = atVar;
        this.b = m1Var;
        this.c = r2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                at atVar = this.d;
                f2.m1 m1Var = this.b;
                atVar.d(m1Var);
                atVar.x.remove(m1Var);
                atVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                at atVar2 = this.d;
                f2.m1 m1Var2 = this.b;
                atVar2.d(m1Var2);
                atVar2.x.remove(m1Var2);
                atVar2.A();
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
