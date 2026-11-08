package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ l2(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.E2(this.b);
                break;
            case 1:
                org.telegram.messenger.g0.E2(this.b);
                break;
            default:
                this.b.setTranslationX(0.0f);
                break;
        }
    }
}
