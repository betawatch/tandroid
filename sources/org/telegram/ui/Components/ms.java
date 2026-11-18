package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ms extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.f1 b;
    public final /* synthetic */ org.telegram.ui.Cells.t2 c;
    public final /* synthetic */ rs d;

    public /* synthetic */ ms(rs rsVar, v4.f1 f1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.a = i7;
        this.d = rsVar;
        this.b = f1Var;
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
                rs rsVar = this.d;
                v4.f1 f1Var = this.b;
                rsVar.d(f1Var);
                rsVar.x.remove(f1Var);
                rsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                rs rsVar2 = this.d;
                v4.f1 f1Var2 = this.b;
                rsVar2.d(f1Var2);
                rsVar2.x.remove(f1Var2);
                rsVar2.A();
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
