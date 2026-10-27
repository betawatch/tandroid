package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class oa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sb d;

    public /* synthetic */ oa(sb sbVar, int i10, int i11, int i12) {
        this.a = i12;
        this.d = sbVar;
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
