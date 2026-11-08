package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l61 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ v61 d;

    public l61(v61 v61Var, View view, float f10) {
        this.d = v61Var;
        this.b = view;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.d.F(this.b, this.c);
    }
}
