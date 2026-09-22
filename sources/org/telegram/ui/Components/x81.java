package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y81 b;

    public /* synthetic */ x81(y81 y81Var, int i10) {
        this.a = i10;
        this.b = y81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.y = null;
                break;
            default:
                this.b.y = null;
                break;
        }
    }
}
