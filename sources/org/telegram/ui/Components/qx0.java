package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rx0 b;

    public /* synthetic */ qx0(rx0 rx0Var, int i10) {
        this.a = i10;
        this.b = rx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.s.setVisibility(8);
                break;
            case 1:
                this.b.s.setVisibility(8);
                break;
            default:
                this.b.s.setVisibility(8);
                break;
        }
    }
}
