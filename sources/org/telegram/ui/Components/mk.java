package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.xq b;

    public mk(org.telegram.ui.xq xqVar) {
        this.b = xqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ok) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.xq xqVar = this.b;
                View view = xqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((ok) xqVar.d).X.r.removeView(view);
                break;
        }
    }

    public mk(org.telegram.ui.xq xqVar, s4.o0 o0Var) {
        this.b = xqVar;
    }
}
