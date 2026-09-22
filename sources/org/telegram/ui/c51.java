package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ c51(SecretMediaViewer secretMediaViewer, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.b;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.a0.scrollTo(0, 0);
                    break;
                }
                break;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.b;
                Runnable runnable2 = secretMediaViewer3.o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.o0 = null;
                    break;
                }
                break;
            default:
                SecretMediaViewer secretMediaViewer4 = this.b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                break;
        }
    }
}
