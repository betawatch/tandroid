package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sa d;

    public /* synthetic */ r9(sa saVar, int i7, int i10, int i11) {
        this.a = i11;
        this.d = saVar;
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
