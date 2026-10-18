package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class sa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vb d;

    public /* synthetic */ sa(vb vbVar, int i10, int i11, int i12) {
        this.a = i12;
        this.d = vbVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.M(this.b, this.c);
                break;
            default:
                int i10 = this.b;
                int i11 = this.c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    break;
                }
                break;
        }
    }
}
