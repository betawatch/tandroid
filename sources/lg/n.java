package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ n(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                q qVar = this.b;
                qVar.b.d = 0.0f;
                qVar.d0 = null;
                qVar.j(qVar.L);
                break;
            case 1:
                super.onAnimationEnd(animator);
                q qVar2 = this.b;
                qVar2.b.d = 0.0f;
                qVar2.d0 = null;
                qVar2.j(qVar2.L);
                break;
            case 2:
                super.onAnimationEnd(animator);
                q qVar3 = this.b;
                qVar3.b.d = 0.0f;
                qVar3.d0 = null;
                qVar3.j(qVar3.L);
                break;
            default:
                super.onAnimationEnd(animator);
                q qVar4 = this.b;
                qVar4.b.d = 0.0f;
                qVar4.d0 = null;
                qVar4.j(qVar4.L);
                break;
        }
    }
}
