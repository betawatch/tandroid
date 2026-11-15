package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.e1 b;
    public final /* synthetic */ org.telegram.ui.Cells.t2 c;
    public final /* synthetic */ ks d;

    public /* synthetic */ fs(ks ksVar, v4.e1 e1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.a = i7;
        this.d = ksVar;
        this.b = e1Var;
        this.c = t2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var = this.c;
                t2Var.setClipProgress(0.0f);
                t2Var.setElevation(0.0f);
                ks ksVar = this.d;
                v4.e1 e1Var = this.b;
                ksVar.d(e1Var);
                ksVar.x.remove(e1Var);
                ksVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                ks ksVar2 = this.d;
                v4.e1 e1Var2 = this.b;
                ksVar2.d(e1Var2);
                ksVar2.x.remove(e1Var2);
                ksVar2.A();
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
