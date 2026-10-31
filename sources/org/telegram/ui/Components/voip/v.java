package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ v(w wVar, int i10) {
        this.a = i10;
        this.b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                wVar.N0 = null;
                wVar.D.E = false;
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
                super.onAnimationEnd(animator);
                w wVar2 = this.b;
                wVar2.J0 = null;
                wVar2.I0 = 0.0f;
                wVar2.invalidate();
                break;
            default:
                w wVar3 = this.b;
                wVar3.B0 = null;
                wVar3.y0 = 1.0f;
                wVar3.r0 = 0.0f;
                wVar3.s0 = 0.0f;
                wVar3.invalidate();
                break;
        }
    }
}
