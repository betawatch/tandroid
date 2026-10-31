package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;
    public final /* synthetic */ v c;

    public /* synthetic */ t(v vVar, u uVar, int i10) {
        this.a = i10;
        this.c = vVar;
        this.b = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f = null;
                v.a(this.c);
                break;
            default:
                this.b.f = null;
                v.a(this.c);
                break;
        }
    }
}
