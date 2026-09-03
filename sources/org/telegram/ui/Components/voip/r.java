package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ r(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                tVar.B = false;
                tVar.invalidate();
                break;
            case 1:
                t tVar2 = this.b;
                s sVar = tVar2.V;
                float f10 = tVar2.T ? 0.0f : 1.0f;
                tVar2.U = f10;
                sVar.setAlpha(f10);
                sVar.setVisibility(tVar2.T ? 8 : 0);
                tVar2.a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.b;
                tVar3.G0 = null;
                o oVar = tVar3.a;
                oVar.setRotationY(0.0f);
                if (!tVar3.H0) {
                    oVar.d.clearImage();
                    break;
                }
                break;
        }
    }
}
