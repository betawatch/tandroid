package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gu0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ev0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ cv0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public gu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, ev0 ev0Var, float f10, cv0 cv0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f7;
        this.d = ev0Var;
        this.e = f10;
        this.f = cv0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        float r22;
        float u10;
        float u11;
        boolean z10;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.k4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i11 = photoViewer.c2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i11 == 1) {
            float f7 = !photoViewer.s ? AndroidUtilities.statusBarHeight : 0;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f7;
            i10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f10 = (measuredHeight / 2.0f) + f7;
            float f11 = min / 2.0f;
            float f12 = f10 - f11;
            float f13 = (f10 + f11) - f12;
            r22 = Math.max(((measuredWidth + f11) - (measuredWidth - f11)) / layoutParams.width, f13 / layoutParams.height);
            u10 = ((f13 - (layoutParams.height * r22)) / 2.0f) + f12;
            int measuredWidth2 = photoViewer.g0.getMeasuredWidth();
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, r22, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float min2 = Math.min(photoViewer.g0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            r22 = photoViewer.c2 == 11 ? photoViewer.r2(true) * min2 : min2;
            u10 = com.google.android.gms.internal.vision.e2.u(layoutParams.height, r22, AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, r22, photoViewer.g0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
        }
        ev0 ev0Var = this.d;
        int abs = (int) Math.abs(this.c - ev0Var.a.getImageX());
        float imageY = ev0Var.a.getImageY();
        float f14 = this.e;
        int abs2 = (int) Math.abs(f14 - imageY);
        if (ev0Var.a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i12 = 2;
        ev0Var.d.getLocationInWindow(iArr);
        float f15 = ev0Var.c + f14;
        int i13 = (int) ((iArr[1] - f15) + ev0Var.j);
        if (i13 < 0) {
            i13 = i10;
        }
        int height = (int) (((f15 + layoutParams.height) - (ev0Var.d.getHeight() + r10)) + ev0Var.i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i13, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.h0.getScaleX();
        fArr[i10][1] = photoViewer.h0.getScaleY();
        fArr[i10][2] = photoViewer.h0.getTranslationX();
        int i14 = 3;
        fArr[i10][3] = photoViewer.h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f16 = abs;
        float f17 = ev0Var.k;
        int i15 = 4;
        fArr2[4] = f16 * f17;
        fArr2[5] = max * f17;
        float f18 = max2 * f17;
        char c10 = 6;
        fArr2[6] = f18;
        int[] radius = photoViewer.h0.getRadius();
        int i16 = i10;
        while (i16 < 4) {
            char c11 = c10;
            fArr[i10][i16 + 7] = radius != null ? radius[i16] : 0.0f;
            i16++;
            c10 = c11;
        }
        float[] fArr3 = fArr[i10];
        float f19 = ev0Var.k;
        fArr3[11] = abs2 * f19;
        fArr3[12] = f16 * f19;
        float[] fArr4 = fArr[1];
        fArr4[i10] = r22;
        fArr4[1] = r22;
        fArr4[2] = u11;
        fArr4[3] = u10;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c10] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (int i17 = i10; i17 < clippingImageViewArr.length; i17++) {
            clippingImageViewArr[i17].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i10);
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.j0.setAlpha(0.0f);
        g90 g90Var = new g90(this, clippingImageViewArr, this.h, this.n, this.f, 15);
        photoViewer.p4 = g90Var;
        if (photoViewer.l2) {
            g90Var.run();
            photoViewer.p4 = null;
            photoViewer.e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.c2 == 1 ? 3 : 2) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i18 = 0;
            while (i18 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i12];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i18], org.telegram.ui.Components.u6.f, fArr5);
                if (i18 == 0) {
                    ofFloat.addUpdateListener(new c3(this, 23));
                }
                arrayList.add(ofFloat);
                i18++;
                i12 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.h0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.u6.d, 0, 255));
            wu0 wu0Var = photoViewer.e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(wu0Var, (Property<wu0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.vf0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ep0(this, 8));
            photoViewer.e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new rt0(i14, this, animatorSet));
        }
        backgroundDrawable.d = new rt0(i15, this, ev0Var);
        zn znVar = photoViewer.l4;
        if (znVar == null || znVar.getFragmentView() == null) {
            return true;
        }
        zn znVar2 = photoViewer.l4;
        znVar2.T7();
        UndoView undoView = znVar2.y3;
        if (undoView != null) {
            z10 = true;
            undoView.e(1, false);
        } else {
            z10 = true;
        }
        photoViewer.l4.getFragmentView().invalidate();
        return z10;
    }
}
