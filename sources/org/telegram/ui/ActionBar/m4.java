package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.d20;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                zs.f(d20.s0).d(new lg.s(this, 26));
                break;
            default:
                zs.f(d20.s0).d(new lg.s(this, 27));
                break;
        }
    }
}
