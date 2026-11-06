package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
