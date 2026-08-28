package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ dr0(PhotoViewer photoViewer, View view, int i9) {
        this.a = i9;
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
                st0 st0Var = photoViewer.A2;
                if (st0Var != null) {
                    st0Var.setOutlineProvider(null);
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
                AndroidUtilities.runOnUIThread(new cf0(27, this, this.b), 100L);
                break;
        }
    }
}
