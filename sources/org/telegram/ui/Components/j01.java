package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s01 b;

    public /* synthetic */ j01(s01 s01Var, int i7) {
        this.a = i7;
        this.b = s01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s01 s01Var = this.b;
                if (s01Var.T == animator) {
                    s01Var.T = null;
                    break;
                }
                break;
            case 1:
                s01 s01Var2 = this.b;
                if (s01Var2.f0 == animator) {
                    s01Var2.f0 = null;
                }
                s01Var2.b(1.0f);
                break;
            default:
                s01 s01Var3 = this.b;
                if (s01Var3.J == animator) {
                    s01Var3.J = null;
                    break;
                }
                break;
        }
    }
}
