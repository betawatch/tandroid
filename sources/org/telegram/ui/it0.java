package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class it0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.b;
        eu0 eu0Var = photoViewer.U4;
        photoViewer.n6 = null;
        photoViewer.M0.setVisibility(8);
        photoViewer.P0.setVisibility(8);
        photoViewer.k0.setVisibility(8);
        photoViewer.b1.setVisibility(8);
        photoViewer.c1.setVisibility(8);
        photoViewer.d1.setVisibility(8);
        photoViewer.l1.setVisibility(8);
        photoViewer.l1.setAlpha(0.0f);
        photoViewer.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.L0.setRotationX(0.0f);
        photoViewer.l1.setEnabled(false);
        photoViewer.H = false;
        if (photoViewer.f2) {
            photoViewer.N1.setVisibility(4);
        }
        int i10 = photoViewer.Z1;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.d7.size() > 1)) {
            photoViewer.K0.setVisibility(8);
            photoViewer.L0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Z1 == 11) {
            photoViewer.f6 = photoViewer.V5;
            photoViewer.e6 = photoViewer.U5;
            photoViewer.g6 = photoViewer.X5;
            photoViewer.h6 = photoViewer.Y5;
            photoViewer.c6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.z4.getBitmap();
        if (bitmap != null || photoViewer.o1) {
            photoViewer.z1.b(bitmap, photoViewer.z4.getOrientation(), photoViewer.Z1 != 1, false, photoViewer.A1, photoViewer.o1 ? (org.telegram.ui.Components.w61) photoViewer.y2 : null, eu0Var.c);
            photoViewer.z1.a();
            int bitmapWidth = photoViewer.z4.getBitmapWidth();
            int bitmapHeight = photoViewer.z4.getBitmapHeight();
            MediaController.CropState cropState = eu0Var.c;
            if (cropState != null) {
                int i11 = cropState.transformRotation;
                if (i11 == 90 || i11 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f10 = bitmapWidth;
            float f11 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.r4) / f10, photoViewer.i1() / f11);
            float min2 = Math.min(photoViewer.k1(1) / f10, photoViewer.h1(1, false) / f11);
            if (photoViewer.Z1 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.b6 = min2 / min;
            Rect rect = photoViewer.p2;
            photoViewer.Z5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.a6 = (-AndroidUtilities.dp(56.0f)) + (!photoViewer.s ? AndroidUtilities.statusBarHeight / 2 : 0);
            photoViewer.k6 = System.currentTimeMillis();
            photoViewer.O6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.R0, (Property<org.telegram.ui.Components.yf0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.n6.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.z1, (Property<org.telegram.ui.Components.ze0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.m6.setDuration(200L);
        photoViewer.m6.addListener(new ss0(this, 1));
        photoViewer.m6.start();
    }
}
