package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ c50(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i60 i60Var = this.b;
                i60Var.V.setVisibility(4);
                i60Var.W.setVisibility(4);
                i60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                i60 i60Var2 = this.b;
                i60Var2.h1 = null;
                i60Var2.g1.setColor(i60Var2.T1 == 3 ? -1163700 : -12761513);
                i60Var2.f1.invalidate();
                break;
        }
    }
}
