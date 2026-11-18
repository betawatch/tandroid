package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ms extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.f1 b;
    public final /* synthetic */ org.telegram.ui.Cells.u2 c;
    public final /* synthetic */ rs d;

    public /* synthetic */ ms(rs rsVar, v4.f1 f1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.a = i7;
        this.d = rsVar;
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
                rs rsVar = this.d;
                v4.f1 f1Var = this.b;
                rsVar.d(f1Var);
                rsVar.x.remove(f1Var);
                rsVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
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
