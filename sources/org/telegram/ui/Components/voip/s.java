package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ s(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u uVar = this.b;
                uVar.E = false;
                uVar.invalidate();
                break;
            case 1:
                u uVar2 = this.b;
                t tVar = uVar2.b0;
                float f7 = uVar2.W ? 0.0f : 1.0f;
                uVar2.a0 = f7;
                tVar.setAlpha(f7);
                tVar.setVisibility(uVar2.W ? 8 : 0);
                uVar2.a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.b;
                uVar3.J0 = null;
                p pVar = uVar3.a;
                pVar.setRotationY(0.0f);
                if (!uVar3.K0) {
                    pVar.d.clearImage();
                    break;
                }
                break;
        }
    }
}
