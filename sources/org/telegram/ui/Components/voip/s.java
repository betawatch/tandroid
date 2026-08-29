package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                uVar.A = false;
                uVar.invalidate();
                break;
            case 1:
                u uVar2 = this.b;
                t tVar = uVar2.U;
                float f9 = uVar2.S ? 0.0f : 1.0f;
                uVar2.T = f9;
                tVar.setAlpha(f9);
                tVar.setVisibility(uVar2.S ? 8 : 0);
                uVar2.a.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                u uVar3 = this.b;
                uVar3.F0 = null;
                p pVar = uVar3.a;
                pVar.setRotationY(0.0f);
                if (!uVar3.G0) {
                    pVar.d.clearImage();
                    break;
                }
                break;
        }
    }
}
