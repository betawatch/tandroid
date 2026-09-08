package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class us extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.r2 c;
    public final /* synthetic */ zs d;

    public /* synthetic */ us(zs zsVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.a = i10;
        this.d = zsVar;
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
                zs zsVar = this.d;
                s4.c1 c1Var = this.b;
                zsVar.d(c1Var);
                zsVar.x.remove(c1Var);
                zsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                zs zsVar2 = this.d;
                s4.c1 c1Var2 = this.b;
                zsVar2.d(c1Var2);
                zsVar2.x.remove(c1Var2);
                zsVar2.A();
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
