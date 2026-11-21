package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ o e;

    public l(o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = oVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.e;
        oVar.G = false;
        if (this.a) {
            return;
        }
        oVar.e(this.b, this.c, this.d, true);
    }
}
