package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ee1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe1 b;

    public /* synthetic */ ee1(fe1 fe1Var, int i10) {
        this.a = i10;
        this.b = fe1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.h.s.setVisibility(8);
                break;
            default:
                this.b.h.a.setVisibility(8);
                break;
        }
    }
}
