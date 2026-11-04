package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ x c;

    public /* synthetic */ v(x xVar, r rVar, int i3) {
        this.a = i3;
        this.c = xVar;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x xVar = this.c;
                xVar.O0 = null;
                this.b.F = false;
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
                x xVar2 = this.c;
                xVar2.y.e();
                xVar2.r = null;
                this.b.r = false;
                if (!xVar2.b) {
                    xVar2.d();
                    xVar2.E = null;
                    xVar2.d = 0L;
                }
                xVar2.c = xVar2.b ? 1.0f : 0.0f;
                xVar2.l();
                xVar2.i(false);
                if (!xVar2.b) {
                    xVar2.l0.setVisibility(8);
                    xVar2.m0.setVisibility(8);
                    xVar2.f0.setVisibility(8);
                    xVar2.g0.setVisibility(8);
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
