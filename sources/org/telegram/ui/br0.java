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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class br0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public br0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i10;
        PhotoViewer photoViewer = this.b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.e1.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        photoViewer.o1.setVisibility(8);
        photoViewer.o1.setAlpha(0.0f);
        photoViewer.o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.c2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        if (n10 != null) {
            float q6 = photoViewer.C4.q();
            float o10 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.m1(2) / q6, photoViewer.j1(2, false) / o10);
            if (photoViewer.c2 == 1) {
                photoViewer.d6 = -org.telegram.messenger.i0.L(36.0f);
                min = photoViewer.n1(false);
            } else {
                photoViewer.d6 = (-org.telegram.messenger.i0.L(93.0f)) + (!photoViewer.s ? org.telegram.messenger.i0.m / 2 : 0);
                org.telegram.messenger.ye yeVar = photoViewer.X4.c;
                min = (yeVar == null || !((i10 = yeVar.k) == 90 || i10 == 270)) ? Math.min(photoViewer.m1(photoViewer.u4) / q6, photoViewer.k1() / o10) : Math.min(photoViewer.m1(photoViewer.u4) / o10, photoViewer.k1() / q6);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.s2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.i6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.i0.L(186.0f), 0.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new org.telegram.ui.Components.voip.h2(this, 23));
        photoViewer.p6.start();
    }
}
