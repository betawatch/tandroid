package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ w(x xVar, int i3) {
        this.a = i3;
        this.b = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x xVar = this.b;
                xVar.O0 = null;
                xVar.E.F = false;
                r rVar = xVar.F;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        xVar.removeView(xVar.F);
                        xVar.F.e();
                    }
                    xVar.F = null;
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                x xVar2 = this.b;
                xVar2.K0 = null;
                xVar2.J0 = 0.0f;
                xVar2.invalidate();
                break;
            default:
                x xVar3 = this.b;
                xVar3.C0 = null;
                xVar3.z0 = 1.0f;
                xVar3.s0 = 0.0f;
                xVar3.t0 = 0.0f;
                xVar3.invalidate();
                break;
        }
    }
}
