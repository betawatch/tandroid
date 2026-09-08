package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ gs0(PhotoViewer photoViewer, View view, int i10) {
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
                tu0 tu0Var = photoViewer.E2;
                if (tu0Var != null) {
                    tu0Var.setOutlineProvider(null);
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
                AndroidUtilities.runOnUIThread(new ej0(21, this, this.b), 100L);
                break;
        }
    }
}
