package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ h4(k4 k4Var, int i7) {
        this.a = i7;
        this.b = k4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ks.f(j10.t0).d(new oi.a2(this, 13));
                break;
            default:
                ks.f(j10.t0).d(new oi.a2(this, 14));
                break;
        }
    }
}
