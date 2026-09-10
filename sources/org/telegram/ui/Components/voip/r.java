package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
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
                tVar.E = false;
                tVar.invalidate();
                break;
            case 1:
                t tVar2 = this.b;
                s sVar = tVar2.b0;
                float f7 = tVar2.W ? 0.0f : 1.0f;
                tVar2.a0 = f7;
                sVar.setAlpha(f7);
                sVar.setVisibility(tVar2.W ? 8 : 0);
                tVar2.a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.b;
                tVar3.J0 = null;
                o oVar = tVar3.a;
                oVar.setRotationY(0.0f);
                if (!tVar3.K0) {
                    oVar.d.clearImage();
                    break;
                }
                break;
        }
    }
}
