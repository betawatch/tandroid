package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
