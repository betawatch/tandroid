package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class co0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ co0(PhotoViewer photoViewer, View view, int i7) {
        this.a = i7;
        this.c = photoViewer;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                photoViewer.A3 = false;
                this.b.setOutlineProvider(null);
                ImageView imageView = photoViewer.w3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                oq0 oq0Var = photoViewer.E2;
                if (oq0Var != null) {
                    oq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.A3 = false;
                photoViewer2.h4.run();
                org.telegram.messenger.g0.i3(new qn0(2, this, this.b), 100L);
                break;
        }
    }
}
