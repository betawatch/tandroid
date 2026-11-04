package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ p(r rVar, int i3) {
        this.a = i3;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.F = false;
                rVar.invalidate();
                break;
            case 1:
                r rVar2 = this.b;
                q qVar = rVar2.c0;
                float f10 = rVar2.a0 ? 0.0f : 1.0f;
                rVar2.b0 = f10;
                qVar.setAlpha(f10);
                qVar.setVisibility(rVar2.a0 ? 8 : 0);
                rVar2.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                r rVar3 = this.b;
                rVar3.K0 = null;
                n nVar = rVar3.a;
                nVar.setRotationY(0.0f);
                if (!rVar3.L0) {
                    nVar.d.clearImage();
                    break;
                }
                break;
            case 3:
                this.b.F = false;
                break;
            default:
                this.b.F = false;
                break;
        }
    }
}
