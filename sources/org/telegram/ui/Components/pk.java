package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.zq b;

    public pk(org.telegram.ui.zq zqVar) {
        this.b = zqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((rk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.zq zqVar = this.b;
                View view = zqVar.b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((rk) zqVar.d).X.r.removeView(view);
                break;
        }
    }

    public pk(org.telegram.ui.zq zqVar, s4.p0 p0Var) {
        this.b = zqVar;
    }
}
