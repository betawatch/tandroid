package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ta extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ wb d;

    public /* synthetic */ ta(wb wbVar, int i9, int i10, int i11) {
        this.a = i11;
        this.d = wbVar;
        this.b = i9;
        this.c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.N(this.b, this.c);
                break;
            default:
                int i9 = this.b;
                int i10 = this.c;
                if (i9 != i10) {
                    this.d.Q(i9, i10);
                    break;
                }
                break;
        }
    }
}
