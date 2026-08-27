package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ fr0(PhotoViewer photoViewer, View view, int i10) {
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
                tt0 tt0Var = photoViewer.A2;
                if (tt0Var != null) {
                    tt0Var.setOutlineProvider(null);
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
                AndroidUtilities.runOnUIThread(new ff0(27, this, this.b), 100L);
                break;
        }
    }
}
