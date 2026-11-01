package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ m4(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                at.f(e20.s0).d(new lg.s(this, 26));
                break;
            default:
                at.f(e20.s0).d(new lg.s(this, 27));
                break;
        }
    }
}
