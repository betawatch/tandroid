package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ek extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.xq b;

    public ek(org.telegram.ui.xq xqVar) {
        this.b = xqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((gk) this.b.d).R.unlock();
                break;
            default:
                org.telegram.ui.xq xqVar = this.b;
                View view = xqVar.b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((gk) xqVar.d).U.r.removeView(view);
                break;
        }
    }

    public ek(org.telegram.ui.xq xqVar, f2.v0 v0Var) {
        this.b = xqVar;
    }
}
