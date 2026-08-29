package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ps extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.n1 b;
    public final /* synthetic */ org.telegram.ui.Cells.p2 c;
    public final /* synthetic */ us d;

    public /* synthetic */ ps(us usVar, f2.n1 n1Var, org.telegram.ui.Cells.p2 p2Var, int i10) {
        this.a = i10;
        this.d = usVar;
        this.b = n1Var;
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
                us usVar = this.d;
                f2.n1 n1Var = this.b;
                usVar.d(n1Var);
                usVar.x.remove(n1Var);
                usVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var2 = this.c;
                p2Var2.setClipProgress(0.0f);
                p2Var2.setElevation(0.0f);
                us usVar2 = this.d;
                f2.n1 n1Var2 = this.b;
                usVar2.d(n1Var2);
                usVar2.x.remove(n1Var2);
                usVar2.A();
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
