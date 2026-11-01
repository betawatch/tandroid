package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ w(x xVar, int i10) {
        this.a = i10;
        this.b = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x xVar = this.b;
                xVar.N0 = null;
                xVar.D.E = false;
                r rVar = xVar.E;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        xVar.removeView(xVar.E);
                        xVar.E.e();
                    }
                    xVar.E = null;
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                x xVar2 = this.b;
                xVar2.J0 = null;
                xVar2.I0 = 0.0f;
                xVar2.invalidate();
                break;
            default:
                x xVar3 = this.b;
                xVar3.B0 = null;
                xVar3.y0 = 1.0f;
                xVar3.r0 = 0.0f;
                xVar3.s0 = 0.0f;
                xVar3.invalidate();
                break;
        }
    }
}
