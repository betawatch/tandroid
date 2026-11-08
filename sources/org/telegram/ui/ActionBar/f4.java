package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ f4(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qs.f(p10.s0).d(new l2.w(this, 27));
                break;
            default:
                qs.f(p10.s0).d(new l2.w(this, 28));
                break;
        }
    }
}
