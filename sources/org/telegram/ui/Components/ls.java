package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ls extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.q1 b;
    public final /* synthetic */ org.telegram.ui.Cells.r2 c;
    public final /* synthetic */ ps d;

    public /* synthetic */ ls(ps psVar, f2.q1 q1Var, org.telegram.ui.Cells.r2 r2Var, int i9) {
        this.a = i9;
        this.d = psVar;
        this.b = q1Var;
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
                ps psVar = this.d;
                f2.q1 q1Var = this.b;
                psVar.d(q1Var);
                psVar.x.remove(q1Var);
                psVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                ps psVar2 = this.d;
                f2.q1 q1Var2 = this.b;
                psVar2.d(q1Var2);
                psVar2.x.remove(q1Var2);
                psVar2.A();
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
