package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public hp0(PhotoViewer photoViewer, int i3) {
        this.b = photoViewer;
        this.a = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        dq0 dq0Var = photoViewer.Y4;
        photoViewer.r6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i3 = photoViewer.d2;
        if (i3 == 0 || i3 == 4 || ((i3 == 2 || i3 == 5) && photoViewer.h7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.v3();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.j6 = photoViewer.Z5;
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.l6 = photoViewer.c6;
            photoViewer.g6 = 0.0f;
        }
        Bitmap n4 = photoViewer.D4.n();
        if (n4 != null || photoViewer.s1) {
            photoViewer.D1.b(n4, photoViewer.D4.V, photoViewer.d2 != 1, false, photoViewer.E1, photoViewer.s1 ? (org.telegram.ui.Components.b51) photoViewer.C2 : null, dq0Var.c);
            photoViewer.D1.a();
            int q10 = photoViewer.D4.q();
            int o10 = photoViewer.D4.o();
            org.telegram.messenger.re reVar = dq0Var.c;
            if (reVar != null) {
                int i10 = reVar.k;
                if (i10 == 90 || i10 == 270) {
                    o10 = q10;
                    q10 = o10;
                }
                q10 = (int) (q10 * reVar.e);
                o10 = (int) (o10 * reVar.f);
            }
            float f10 = q10;
            float f11 = o10;
            float min = Math.min(photoViewer.m1(photoViewer.v4) / f10, photoViewer.k1() / f11);
            float min2 = Math.min(photoViewer.m1(1) / f10, photoViewer.j1(1, false) / f11);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.m1(1), photoViewer.j1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.d6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.e6 = (-org.telegram.messenger.g0.L(56.0f)) + (!photoViewer.s ? org.telegram.messenger.g0.m / 2 : 0);
            photoViewer.o6 = System.currentTimeMillis();
            photoViewer.S6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.q6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.k6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, (Property<org.telegram.ui.Components.ad0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.q6.setDuration(200L);
        photoViewer.q6.addListener(new y20(this, 11));
        photoViewer.q6.start();
    }
}
