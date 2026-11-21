package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class zm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ zm(tn tnVar, int i7) {
        this.a = i7;
        this.b = tnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.F.setTranslationY(0.0f);
                break;
            case 1:
                this.b.F.setTranslationY(0.0f);
                break;
            default:
                tn tnVar = this.b;
                tnVar.g1 = false;
                tnVar.F.setTranslationY(0.0f);
                tnVar.f0();
                break;
        }
    }
}
