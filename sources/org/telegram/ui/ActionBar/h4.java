package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
