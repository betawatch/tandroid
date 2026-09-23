package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class ib extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ lc d;

    public /* synthetic */ ib(lc lcVar, int i10, int i11, int i12) {
        this.a = i12;
        this.d = lcVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.N(this.b, this.c);
                break;
            default:
                int i10 = this.b;
                int i11 = this.c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    break;
                }
                break;
        }
    }
}
