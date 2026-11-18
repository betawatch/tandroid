package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ lz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.a = i7;
        this.b = secretMediaViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.b;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.b;
                AnimatorSet animatorSet = secretMediaViewer2.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.G.setVisibility(8);
                    secretMediaViewer2.H = null;
                    secretMediaViewer2.Z.scrollTo(0, 0);
                    break;
                }
                break;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.b;
                Runnable runnable2 = secretMediaViewer3.n0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.n0 = null;
                    break;
                }
                break;
            default:
                SecretMediaViewer secretMediaViewer4 = this.b;
                secretMediaViewer4.J0 = null;
                secretMediaViewer4.e.invalidate();
                break;
        }
    }
}
