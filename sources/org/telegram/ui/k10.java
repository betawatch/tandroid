package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xq b;

    public k10(xq xqVar) {
        this.b = xqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((u10) this.b.d).l0.unlock();
                break;
            default:
                xq xqVar = this.b;
                View view = xqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((u10) xqVar.d).b.removeView(view);
                break;
        }
    }

    public k10(xq xqVar, s4.o0 o0Var) {
        this.b = xqVar;
    }
}
