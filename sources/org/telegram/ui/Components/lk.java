package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class lk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.zq b;

    public lk(org.telegram.ui.zq zqVar) {
        this.b = zqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((nk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.zq zqVar = this.b;
                View view = zqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) zqVar.d).X.r.removeView(view);
                break;
        }
    }

    public lk(org.telegram.ui.zq zqVar, s4.o0 o0Var) {
        this.b = zqVar;
    }
}
