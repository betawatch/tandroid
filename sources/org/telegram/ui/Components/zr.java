package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zr extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4.d1 b;
    public final /* synthetic */ org.telegram.ui.Cells.t2 c;
    public final /* synthetic */ es d;

    public /* synthetic */ zr(es esVar, u4.d1 d1Var, org.telegram.ui.Cells.t2 t2Var, int i3) {
        this.a = i3;
        this.d = esVar;
        this.b = d1Var;
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
                es esVar = this.d;
                u4.d1 d1Var = this.b;
                esVar.d(d1Var);
                esVar.x.remove(d1Var);
                esVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                es esVar2 = this.d;
                u4.d1 d1Var2 = this.b;
                esVar2.d(d1Var2);
                esVar2.x.remove(d1Var2);
                esVar2.A();
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
