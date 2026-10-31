package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ w c;

    public /* synthetic */ u(w wVar, r rVar, int i10) {
        this.a = i10;
        this.c = wVar;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w wVar = this.c;
                wVar.N0 = null;
                this.b.E = false;
                r rVar = wVar.E;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        wVar.removeView(wVar.E);
                        wVar.E.e();
                    }
                    wVar.E = null;
                    break;
                }
                break;
            case 1:
                w wVar2 = this.c;
                wVar2.y.e();
                wVar2.r = null;
                this.b.r = false;
                if (!wVar2.b) {
                    wVar2.d();
                    wVar2.D = null;
                    wVar2.d = 0L;
                }
                wVar2.c = wVar2.b ? 1.0f : 0.0f;
                wVar2.l();
                wVar2.i(false);
                if (!wVar2.b) {
                    wVar2.k0.setVisibility(8);
                    wVar2.l0.setVisibility(8);
                    wVar2.e0.setVisibility(8);
                    wVar2.f0.setVisibility(8);
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
