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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public jt0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float min;
        int i10;
        PhotoViewer photoViewer = this.b;
        photoViewer.n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.k0.setVisibility(8);
        photoViewer.C.setVisibility(8);
        photoViewer.b1.setVisibility(8);
        photoViewer.c1.setVisibility(8);
        photoViewer.d1.setVisibility(8);
        org.telegram.ui.Components.ze0 ze0Var = photoViewer.z1;
        if (ze0Var != null) {
            ze0Var.setVisibility(4);
        }
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i11 = photoViewer.Z1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (photoViewer.Z1 == 11) {
            photoViewer.f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.g6 = photoViewer.X5;
            photoViewer.h6 = photoViewer.Y5;
            photoViewer.c6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.z4.getBitmapWidth();
            float bitmapHeight = photoViewer.z4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Z1 == 1) {
                photoViewer.a6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                photoViewer.a6 = (-AndroidUtilities.dp(93.0f)) + (!photoViewer.s ? AndroidUtilities.statusBarHeight / 2 : 0);
                MediaController.CropState cropState = photoViewer.U4.c;
                min = (cropState == null || !((i10 = cropState.transformRotation) == 90 || i10 == 270)) ? Math.min(photoViewer.k1(photoViewer.r4) / bitmapWidth, photoViewer.i1() / bitmapHeight) : Math.min(photoViewer.k1(photoViewer.r4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
            }
            photoViewer.b6 = min2 / min;
            Rect rect = photoViewer.p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.F1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.m6.setDuration(200L);
        photoViewer.m6.addListener(new ss0(this, 2));
        photoViewer.m6.start();
    }
}
