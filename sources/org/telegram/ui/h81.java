package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ h81(i81 i81Var, int i7) {
        this.a = i7;
        this.b = i81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.s.setVisibility(8);
                break;
            default:
                this.b.b.a.setVisibility(8);
                break;
        }
    }
}
