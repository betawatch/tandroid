package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class js extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2.o1 b;
    public final /* synthetic */ org.telegram.ui.Cells.p2 c;
    public final /* synthetic */ os d;

    public /* synthetic */ js(os osVar, f2.o1 o1Var, org.telegram.ui.Cells.p2 p2Var, int i10) {
        this.a = i10;
        this.d = osVar;
        this.b = o1Var;
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
                os osVar = this.d;
                f2.o1 o1Var = this.b;
                osVar.d(o1Var);
                osVar.x.remove(o1Var);
                osVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var2 = this.c;
                p2Var2.setClipProgress(0.0f);
                p2Var2.setElevation(0.0f);
                os osVar2 = this.d;
                f2.o1 o1Var2 = this.b;
                osVar2.d(o1Var2);
                osVar2.x.remove(o1Var2);
                osVar2.A();
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
