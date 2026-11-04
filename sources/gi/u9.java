package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ va d;

    public /* synthetic */ u9(va vaVar, int i3, int i10, int i11) {
        this.a = i11;
        this.d = vaVar;
        this.b = i3;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.M(this.b, this.c);
                break;
            default:
                int i3 = this.b;
                int i10 = this.c;
                if (i3 != i10) {
                    this.d.P(i3, i10);
                    break;
                }
                break;
        }
    }
}
