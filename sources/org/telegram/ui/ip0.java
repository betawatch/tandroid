package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ip0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public ip0(PhotoViewer photoViewer, int i3) {
        this.b = photoViewer;
        this.a = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i3;
        PhotoViewer photoViewer = this.b;
        photoViewer.r6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
        if (ad0Var != null) {
            ad0Var.setVisibility(4);
        }
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i10 = photoViewer.d2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.h7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.v3();
        }
        Bitmap n4 = photoViewer.D4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.j6 = photoViewer.Z5;
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.l6 = photoViewer.c6;
            photoViewer.g6 = 0.0f;
        }
        if (n4 != null) {
            float q10 = photoViewer.D4.q();
            float o10 = photoViewer.D4.o();
            float min2 = Math.min(photoViewer.m1(2) / q10, photoViewer.j1(2, false) / o10);
            if (photoViewer.d2 == 1) {
                photoViewer.e6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.n1(false);
            } else {
                photoViewer.e6 = (-org.telegram.messenger.g0.L(93.0f)) + (!photoViewer.s ? org.telegram.messenger.g0.m / 2 : 0);
                org.telegram.messenger.re reVar = photoViewer.Y4.c;
                min = (reVar == null || !((i3 = reVar.k) == 90 || i3 == 270)) ? Math.min(photoViewer.m1(photoViewer.v4) / q10, photoViewer.k1() / o10) : Math.min(photoViewer.m1(photoViewer.v4) / o10, photoViewer.k1() / q10);
            }
            photoViewer.f6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.d6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.o6 = System.currentTimeMillis();
            photoViewer.S6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.q6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.k6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.q6.setDuration(200L);
        photoViewer.q6.addListener(new y20(this, 12));
        photoViewer.q6.start();
    }
}
