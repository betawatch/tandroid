package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zq b;

    public n10(zq zqVar) {
        this.b = zqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((x10) this.b.d).l0.unlock();
                break;
            default:
                zq zqVar = this.b;
                View view = zqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) zqVar.d).b.removeView(view);
                break;
        }
    }

    public n10(zq zqVar, s4.o0 o0Var) {
        this.b = zqVar;
    }
}
