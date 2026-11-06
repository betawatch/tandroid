package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ jz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.a = i7;
        this.b = secretMediaViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.b;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    break;
                }
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.Y.scrollTo(0, 0);
                    break;
                }
                break;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.b;
                Runnable runnable2 = secretMediaViewer3.m0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.m0 = null;
                    break;
                }
                break;
            default:
                SecretMediaViewer secretMediaViewer4 = this.b;
                secretMediaViewer4.I0 = null;
                secretMediaViewer4.e.invalidate();
                break;
        }
    }
}
