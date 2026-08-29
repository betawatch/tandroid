package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ dr0(PhotoViewer photoViewer, View view, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                photoViewer.x3 = false;
                this.b.setOutlineProvider(null);
                ImageView imageView = photoViewer.t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qt0 qt0Var = photoViewer.A2;
                if (qt0Var != null) {
                    qt0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.y2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.x3 = false;
                photoViewer2.e4.run();
                AndroidUtilities.runOnUIThread(new lf0(24, this, this.b), 100L);
                break;
        }
    }
}
