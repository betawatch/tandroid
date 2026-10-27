package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.tq b;

    public kk(org.telegram.ui.tq tqVar) {
        this.b = tqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((mk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.tq tqVar = this.b;
                View view = tqVar.b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((mk) tqVar.d).X.r.removeView(view);
                break;
        }
    }

    public kk(org.telegram.ui.tq tqVar, s4.p0 p0Var) {
        this.b = tqVar;
    }
}
