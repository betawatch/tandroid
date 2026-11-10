package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ g4(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qs.f(p10.s0).d(new l2.a0(this, 26));
                break;
            default:
                qs.f(p10.s0).d(new l2.a0(this, 27));
                break;
        }
    }
}
