package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ls extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.f1 b;
    public final /* synthetic */ org.telegram.ui.Cells.u2 c;
    public final /* synthetic */ qs d;

    public /* synthetic */ ls(qs qsVar, v4.f1 f1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.a = i7;
        this.d = qsVar;
        this.b = f1Var;
        this.c = u2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var = this.c;
                u2Var.setClipProgress(0.0f);
                u2Var.setElevation(0.0f);
                qs qsVar = this.d;
                v4.f1 f1Var = this.b;
                qsVar.d(f1Var);
                qsVar.x.remove(f1Var);
                qsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
                qs qsVar2 = this.d;
                v4.f1 f1Var2 = this.b;
                qsVar2.d(f1Var2);
                qsVar2.x.remove(f1Var2);
                qsVar2.A();
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
