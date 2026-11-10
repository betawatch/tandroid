package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.xp b;

    public rj(org.telegram.ui.xp xpVar) {
        this.b = xpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((tj) this.b.d).U.e();
                break;
            default:
                org.telegram.ui.xp xpVar = this.b;
                View view = xpVar.b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((tj) xpVar.d).X.r.removeView(view);
                break;
        }
    }

    public rj(org.telegram.ui.xp xpVar, v4.n0 n0Var) {
        this.b = xpVar;
    }
}
