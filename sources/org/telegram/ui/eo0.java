package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class eo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ eo0(PhotoViewer photoViewer, View view, int i7) {
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
                qq0 qq0Var = photoViewer.E2;
                if (qq0Var != null) {
                    qq0Var.setOutlineProvider(null);
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
                org.telegram.messenger.g0.i3(new sn0(2, this, this.b), 100L);
                break;
        }
    }
}
