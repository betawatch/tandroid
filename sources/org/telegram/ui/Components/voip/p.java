package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ p(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.E = false;
                rVar.invalidate();
                break;
            case 1:
                r rVar2 = this.b;
                q qVar = rVar2.b0;
                float f7 = rVar2.W ? 0.0f : 1.0f;
                rVar2.a0 = f7;
                qVar.setAlpha(f7);
                qVar.setVisibility(rVar2.W ? 8 : 0);
                rVar2.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                r rVar3 = this.b;
                rVar3.J0 = null;
                n nVar = rVar3.a;
                nVar.setRotationY(0.0f);
                if (!rVar3.K0) {
                    nVar.d.clearImage();
                    break;
                }
                break;
            case 3:
                this.b.E = false;
                break;
            default:
                this.b.E = false;
                break;
        }
    }
}
