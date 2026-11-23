package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class os extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.f1 b;
    public final /* synthetic */ org.telegram.ui.Cells.u2 c;
    public final /* synthetic */ ts d;

    public /* synthetic */ os(ts tsVar, v4.f1 f1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.a = i7;
        this.d = tsVar;
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
                ts tsVar = this.d;
                v4.f1 f1Var = this.b;
                tsVar.d(f1Var);
                tsVar.x.remove(f1Var);
                tsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
                ts tsVar2 = this.d;
                v4.f1 f1Var2 = this.b;
                tsVar2.d(f1Var2);
                tsVar2.x.remove(f1Var2);
                tsVar2.A();
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
