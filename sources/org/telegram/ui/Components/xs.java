package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class xs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.s2 c;
    public final /* synthetic */ ct d;

    public /* synthetic */ xs(ct ctVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.a = i10;
        this.d = ctVar;
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
                ct ctVar = this.d;
                s4.c1 c1Var = this.b;
                ctVar.d(c1Var);
                ctVar.x.remove(c1Var);
                ctVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                ct ctVar2 = this.d;
                s4.c1 c1Var2 = this.b;
                ctVar2.d(c1Var2);
                ctVar2.x.remove(c1Var2);
                ctVar2.A();
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
