package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ar0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public ar0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        xr0 xr0Var = photoViewer.X4;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.n0.setVisibility(8);
        photoViewer.e1.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.o1.setVisibility(8);
        photoViewer.o1.setAlpha(0.0f);
        photoViewer.o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i10 = photoViewer.c2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        if (photoViewer.c2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.r1) {
            photoViewer.C1.b(n10, photoViewer.C4.U, photoViewer.c2 != 1, false, photoViewer.D1, photoViewer.r1 ? (org.telegram.ui.Components.k61) photoViewer.B2 : null, xr0Var.c);
            photoViewer.C1.a();
            int q6 = photoViewer.C4.q();
            int o10 = photoViewer.C4.o();
            org.telegram.messenger.ye yeVar = xr0Var.c;
            if (yeVar != null) {
                int i11 = yeVar.k;
                if (i11 == 90 || i11 == 270) {
                    o10 = q6;
                    q6 = o10;
                }
                q6 = (int) (q6 * yeVar.e);
                o10 = (int) (o10 * yeVar.f);
            }
            float f7 = q6;
            float f10 = o10;
            float min = Math.min(photoViewer.m1(photoViewer.u4) / f7, photoViewer.k1() / f10);
            float min2 = Math.min(photoViewer.m1(1) / f7, photoViewer.j1(1, false) / f10);
            if (photoViewer.c2 == 1) {
                float min3 = Math.min(photoViewer.m1(1), photoViewer.j1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.s2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.d6 = (-org.telegram.messenger.i0.L(56.0f)) + (!photoViewer.s ? org.telegram.messenger.i0.m / 2 : 0);
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, (Property<org.telegram.ui.Cells.u0, Float>) View.TRANSLATION_Y, org.telegram.messenger.i0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.i6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.be0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new org.telegram.ui.Components.voip.h2(this, 22));
        photoViewer.p6.start();
    }
}
