package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
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
                uVar.B = false;
                uVar.invalidate();
                break;
            case 1:
                u uVar2 = this.b;
                t tVar = uVar2.V;
                float f10 = uVar2.T ? 0.0f : 1.0f;
                uVar2.U = f10;
                tVar.setAlpha(f10);
                tVar.setVisibility(uVar2.T ? 8 : 0);
                uVar2.a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.b;
                uVar3.G0 = null;
                p pVar = uVar3.a;
                pVar.setRotationY(0.0f);
                if (!uVar3.H0) {
                    pVar.d.clearImage();
                    break;
                }
                break;
        }
    }
}
