package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ org.telegram.ui.Cells.r2 c;
    public final /* synthetic */ at d;

    public /* synthetic */ vs(at atVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.a = i10;
        this.d = atVar;
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
                at atVar = this.d;
                s4.c1 c1Var = this.b;
                atVar.d(c1Var);
                atVar.x.remove(c1Var);
                atVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
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
