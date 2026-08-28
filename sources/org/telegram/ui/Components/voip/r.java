package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ r(t tVar, int i9) {
        this.a = i9;
        this.b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                tVar.A = false;
                tVar.invalidate();
                break;
            case 1:
                t tVar2 = this.b;
                s sVar = tVar2.U;
                float f10 = tVar2.S ? 0.0f : 1.0f;
                tVar2.T = f10;
                sVar.setAlpha(f10);
                sVar.setVisibility(tVar2.S ? 8 : 0);
                tVar2.a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                t tVar3 = this.b;
                tVar3.F0 = null;
                o oVar = tVar3.a;
                oVar.setRotationY(0.0f);
                if (!tVar3.G0) {
                    oVar.d.clearImage();
                    break;
                }
                break;
        }
    }
}
