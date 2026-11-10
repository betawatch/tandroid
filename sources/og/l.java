package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ o e;

    public l(o oVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.e = oVar;
        this.a = z9;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.e;
        oVar.F = false;
        if (this.a) {
            return;
        }
        oVar.e(this.b, this.c, this.d, true);
    }
}
