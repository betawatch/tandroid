package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b71 b;

    public /* synthetic */ a71(b71 b71Var, int i7) {
        this.a = i7;
        this.b = b71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.D = null;
                break;
            default:
                this.b.D = null;
                break;
        }
    }
}
