package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yr extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.d1 b;
    public final /* synthetic */ org.telegram.ui.Cells.t2 c;
    public final /* synthetic */ ds d;

    public /* synthetic */ yr(ds dsVar, v4.d1 d1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.a = i7;
        this.d = dsVar;
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
                ds dsVar = this.d;
                v4.d1 d1Var = this.b;
                dsVar.d(d1Var);
                dsVar.x.remove(d1Var);
                dsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                ds dsVar2 = this.d;
                v4.d1 d1Var2 = this.b;
                dsVar2.d(d1Var2);
                dsVar2.x.remove(d1Var2);
                dsVar2.A();
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
