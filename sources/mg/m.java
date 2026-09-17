package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class m extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ q e;

    public m(q qVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = qVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q qVar = this.e;
        qVar.F = false;
        if (this.a) {
            return;
        }
        qVar.e(this.b, this.c, this.d, true);
    }
}
