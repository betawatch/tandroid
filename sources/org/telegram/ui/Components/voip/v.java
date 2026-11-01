package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ x c;

    public /* synthetic */ v(x xVar, r rVar, int i10) {
        this.a = i10;
        this.c = xVar;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x xVar = this.c;
                xVar.N0 = null;
                this.b.E = false;
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
                x xVar2 = this.c;
                xVar2.y.e();
                xVar2.r = null;
                this.b.r = false;
                if (!xVar2.b) {
                    xVar2.d();
                    xVar2.D = null;
                    xVar2.d = 0L;
                }
                xVar2.c = xVar2.b ? 1.0f : 0.0f;
                xVar2.l();
                xVar2.i(false);
                if (!xVar2.b) {
                    xVar2.k0.setVisibility(8);
                    xVar2.l0.setVisibility(8);
                    xVar2.e0.setVisibility(8);
                    xVar2.f0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                r rVar2 = this.b;
                if (rVar2.getParent() != null) {
                    this.c.removeView(rVar2);
                    rVar2.e();
                    break;
                }
                break;
            default:
                r rVar3 = this.b;
                if (rVar3.getParent() != null) {
                    this.c.removeView(rVar3);
                    rVar3.e();
                    break;
                }
                break;
        }
    }
}
