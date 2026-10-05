package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ok extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.yq b;

    public ok(org.telegram.ui.yq yqVar) {
        this.b = yqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((qk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.yq yqVar = this.b;
                View view = yqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((qk) yqVar.d).X.r.removeView(view);
                break;
        }
    }

    public ok(org.telegram.ui.yq yqVar, s4.o0 o0Var) {
        this.b = yqVar;
    }
}
