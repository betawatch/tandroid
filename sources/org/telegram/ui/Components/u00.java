package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v00 b;

    public /* synthetic */ u00(v00 v00Var, int i7) {
        this.a = i7;
        this.b = v00Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v00 v00Var = this.b;
                org.telegram.messenger.qs.f(v00Var.r.a).j(v00Var.f);
                v00Var.requestLayout();
                break;
            default:
                v00 v00Var2 = this.b;
                v00Var2.d = null;
                v00Var2.a = null;
                v00Var2.b = false;
                break;
        }
    }
}
