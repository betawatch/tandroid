package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ws extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.s2 c;
    public final /* synthetic */ bt d;

    public /* synthetic */ ws(bt btVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.a = i10;
        this.d = btVar;
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
                bt btVar = this.d;
                s4.c1 c1Var = this.b;
                btVar.d(c1Var);
                btVar.x.remove(c1Var);
                btVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                bt btVar2 = this.d;
                s4.c1 c1Var2 = this.b;
                btVar2.d(c1Var2);
                btVar2.x.remove(c1Var2);
                btVar2.A();
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
