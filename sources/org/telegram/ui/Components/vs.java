package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.s2 c;
    public final /* synthetic */ at d;

    public /* synthetic */ vs(at atVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.a = i10;
        this.d = atVar;
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
                at atVar = this.d;
                s4.c1 c1Var = this.b;
                atVar.d(c1Var);
                atVar.x.remove(c1Var);
                atVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                at atVar2 = this.d;
                s4.c1 c1Var2 = this.b;
                atVar2.d(c1Var2);
                atVar2.x.remove(c1Var2);
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
