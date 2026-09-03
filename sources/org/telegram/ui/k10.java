package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((u10) this.b.d).i0.unlock();
                break;
            default:
                xq xqVar = this.b;
                View view = xqVar.b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((u10) xqVar.d).b.removeView(view);
                break;
        }
    }

    public k10(xq xqVar, f2.v0 v0Var) {
        this.b = xqVar;
    }
}
