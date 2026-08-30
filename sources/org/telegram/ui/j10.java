package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vq b;

    public j10(vq vqVar) {
        this.b = vqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((t10) this.b.d).i0.unlock();
                break;
            default:
                vq vqVar = this.b;
                View view = vqVar.b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((t10) vqVar.d).b.removeView(view);
                break;
        }
    }

    public j10(vq vqVar, f2.v0 v0Var) {
        this.b = vqVar;
    }
}
