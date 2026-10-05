package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ys extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.s2 c;
    public final /* synthetic */ dt d;

    public /* synthetic */ ys(dt dtVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.a = i10;
        this.d = dtVar;
        this.b = c1Var;
        this.c = s2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                dt dtVar = this.d;
                s4.c1 c1Var = this.b;
                dtVar.d(c1Var);
                dtVar.x.remove(c1Var);
                dtVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                dt dtVar2 = this.d;
                s4.c1 c1Var2 = this.b;
                dtVar2.d(c1Var2);
                dtVar2.x.remove(c1Var2);
                dtVar2.A();
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
