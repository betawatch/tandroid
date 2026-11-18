package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class s9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ta d;

    public /* synthetic */ s9(ta taVar, int i7, int i10, int i11) {
        this.a = i11;
        this.d = taVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.M(this.b, this.c);
                break;
            default:
                int i7 = this.b;
                int i10 = this.c;
                if (i7 != i10) {
                    this.d.P(i7, i10);
                    break;
                }
                break;
        }
    }
}
