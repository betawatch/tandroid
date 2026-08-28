package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i9) {
        this.a = i9;
        this.b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                j jVar = this.b;
                jVar.b.d = 0.0f;
                jVar.P = null;
                jVar.h(jVar.E);
                break;
            case 1:
                super.onAnimationEnd(animator);
                j jVar2 = this.b;
                jVar2.b.d = 0.0f;
                jVar2.P = null;
                jVar2.h(jVar2.E);
                break;
            case 2:
                super.onAnimationEnd(animator);
                j jVar3 = this.b;
                jVar3.b.d = 0.0f;
                jVar3.P = null;
                jVar3.h(jVar3.E);
                break;
            default:
                super.onAnimationEnd(animator);
                j jVar4 = this.b;
                jVar4.b.d = 0.0f;
                jVar4.P = null;
                jVar4.h(jVar4.E);
                break;
        }
    }
}
