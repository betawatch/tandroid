package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ bs0(PhotoViewer photoViewer, View view, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                photoViewer.B3 = false;
                this.b.setOutlineProvider(null);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pu0 pu0Var = photoViewer.E2;
                if (pu0Var != null) {
                    pu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.B3 = false;
                photoViewer2.i4.run();
                AndroidUtilities.runOnUIThread(new wj0(18, this, this.b), 100L);
                break;
        }
    }
}
