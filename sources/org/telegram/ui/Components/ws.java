package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ws extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.r2 c;
    public final /* synthetic */ bt d;

    public /* synthetic */ ws(bt btVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.a = i10;
        this.d = btVar;
        this.b = c1Var;
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
                bt btVar = this.d;
                s4.c1 c1Var = this.b;
                btVar.d(c1Var);
                btVar.x.remove(c1Var);
                btVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
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
