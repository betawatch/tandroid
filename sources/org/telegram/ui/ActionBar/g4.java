package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                ks.f(j10.t0).d(new oi.c2(this, 13));
                break;
            default:
                ks.f(j10.t0).d(new oi.c2(this, 14));
                break;
        }
    }
}
