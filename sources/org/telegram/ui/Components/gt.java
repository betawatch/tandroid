package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.e1 b;
    public final /* synthetic */ org.telegram.ui.Cells.p2 c;
    public final /* synthetic */ mt d;

    public /* synthetic */ gt(mt mtVar, s4.e1 e1Var, org.telegram.ui.Cells.p2 p2Var, int i10) {
        this.a = i10;
        this.d = mtVar;
        this.b = e1Var;
        this.c = p2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var = this.c;
                p2Var.setClipProgress(0.0f);
                p2Var.setElevation(0.0f);
                mt mtVar = this.d;
                s4.e1 e1Var = this.b;
                mtVar.d(e1Var);
                mtVar.x.remove(e1Var);
                mtVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var2 = this.c;
                p2Var2.setClipProgress(0.0f);
                p2Var2.setElevation(0.0f);
                mt mtVar2 = this.d;
                s4.e1 e1Var2 = this.b;
                mtVar2.d(e1Var2);
                mtVar2.x.remove(e1Var2);
                mtVar2.A();
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
