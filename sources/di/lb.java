package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class lb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pc d;

    public /* synthetic */ lb(pc pcVar, int i10, int i11, int i12) {
        this.a = i12;
        this.d = pcVar;
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
