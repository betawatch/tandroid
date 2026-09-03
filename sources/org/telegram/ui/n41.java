package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ n41(SecretMediaViewer secretMediaViewer, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.b;
                Runnable runnable = secretMediaViewer.l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.l0 = null;
                    break;
                }
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.b;
                AnimatorSet animatorSet = secretMediaViewer2.D;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.C.setVisibility(8);
                    secretMediaViewer2.D = null;
                    secretMediaViewer2.X.scrollTo(0, 0);
                    break;
                }
                break;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.b;
                Runnable runnable2 = secretMediaViewer3.l0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.l0 = null;
                    break;
                }
                break;
            default:
                SecretMediaViewer secretMediaViewer4 = this.b;
                secretMediaViewer4.H0 = null;
                secretMediaViewer4.e.invalidate();
                break;
        }
    }
}
