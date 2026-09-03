package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ g(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = this.b;
                iVar.b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                break;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = this.b;
                iVar2.b.d = 0.0f;
                iVar2.Q = null;
                iVar2.h(iVar2.F);
                break;
            case 2:
                super.onAnimationEnd(animator);
                i iVar3 = this.b;
                iVar3.b.d = 0.0f;
                iVar3.Q = null;
                iVar3.h(iVar3.F);
                break;
            default:
                super.onAnimationEnd(animator);
                i iVar4 = this.b;
                iVar4.b.d = 0.0f;
                iVar4.Q = null;
                iVar4.h(iVar4.F);
                break;
        }
    }
}
