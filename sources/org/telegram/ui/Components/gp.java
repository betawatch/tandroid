package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;

    public /* synthetic */ gp(hp hpVar, int i10) {
        this.a = i10;
        this.b = hpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                hpVar.d = null;
                ho hoVar = new ho(this, 1);
                hpVar.e = hoVar;
                org.telegram.messenger.i0.h3(hoVar, 3000L);
                break;
            default:
                hp hpVar2 = this.b;
                hpVar2.setVisibility(4);
                hpVar2.getClass();
                hpVar2.getClass();
                hpVar2.d = null;
                break;
        }
    }
}
