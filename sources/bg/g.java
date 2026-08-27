package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                iVar.P = null;
                iVar.h(iVar.E);
                break;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = this.b;
                iVar2.b.d = 0.0f;
                iVar2.P = null;
                iVar2.h(iVar2.E);
                break;
            case 2:
                super.onAnimationEnd(animator);
                i iVar3 = this.b;
                iVar3.b.d = 0.0f;
                iVar3.P = null;
                iVar3.h(iVar3.E);
                break;
            default:
                super.onAnimationEnd(animator);
                i iVar4 = this.b;
                iVar4.b.d = 0.0f;
                iVar4.P = null;
                iVar4.h(iVar4.E);
                break;
        }
    }
}
