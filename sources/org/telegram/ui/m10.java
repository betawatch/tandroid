package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zq b;

    public m10(zq zqVar) {
        this.b = zqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((w10) this.b.d).l0.unlock();
                break;
            default:
                zq zqVar = this.b;
                View view = zqVar.b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((w10) zqVar.d).b.removeView(view);
                break;
        }
    }

    public m10(zq zqVar, s4.p0 p0Var) {
        this.b = zqVar;
    }
}
