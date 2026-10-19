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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ju0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ hu0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public lt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, ju0 ju0Var, float f10, hu0 hu0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f7;
        this.d = ju0Var;
        this.e = f10;
        this.f = hu0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        float r22;
        float c10;
        float c11;
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
            c10 = ((f13 - (layoutParams.height * r22)) / 2.0f) + f12;
            int measuredWidth2 = photoViewer.g0.getMeasuredWidth();
            c11 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.width, r22, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float min2 = Math.min(photoViewer.g0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            r22 = photoViewer.c2 == 11 ? photoViewer.r2(true) * min2 : min2;
            c10 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.height, r22, AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            c11 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.width, r22, photoViewer.g0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
        }
        ju0 ju0Var = this.d;
        int abs = (int) Math.abs(this.c - ju0Var.a.getImageX());
        float imageY = ju0Var.a.getImageY();
        float f14 = this.e;
        int abs2 = (int) Math.abs(f14 - imageY);
        if (ju0Var.a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i12 = 2;
        ju0Var.d.getLocationInWindow(iArr);
        float f15 = ju0Var.c + f14;
        int i13 = (int) ((iArr[1] - f15) + ju0Var.j);
        if (i13 < 0) {
            i13 = i10;
        }
        int height = (int) (((f15 + layoutParams.height) - (ju0Var.d.getHeight() + r10)) + ju0Var.i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i13, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.h0.getScaleX();
        fArr[i10][1] = photoViewer.h0.getScaleY();
        fArr[i10][2] = photoViewer.h0.getTranslationX();
        fArr[i10][3] = photoViewer.h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f16 = abs;
        float f17 = ju0Var.k;
        fArr2[4] = f16 * f17;
        fArr2[5] = max * f17;
        float f18 = max2 * f17;
        char c12 = 6;
        fArr2[6] = f18;
        int[] radius = photoViewer.h0.getRadius();
        int i14 = i10;
        while (i14 < 4) {
            char c13 = c12;
            fArr[i10][i14 + 7] = radius != null ? radius[i14] : 0.0f;
            i14++;
            c12 = c13;
        }
        float[] fArr3 = fArr[i10];
        float f19 = ju0Var.k;
        fArr3[11] = abs2 * f19;
        fArr3[12] = f16 * f19;
        float[] fArr4 = fArr[1];
        fArr4[i10] = r22;
        fArr4[1] = r22;
        fArr4[2] = c11;
        fArr4[3] = c10;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c12] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (int i15 = i10; i15 < clippingImageViewArr.length; i15++) {
            clippingImageViewArr[i15].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i10);
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.j0.setAlpha(0.0f);
        org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(this, clippingImageViewArr, this.h, this.n, this.f, 23);
        photoViewer.p4 = g30Var;
        if (photoViewer.l2) {
            g30Var.run();
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
            ArrayList arrayList = new ArrayList((photoViewer.c2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i16 = 0;
            while (i16 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i12];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i16], org.telegram.ui.Components.t6.f, fArr5);
                if (i16 == 0) {
                    ofFloat.addUpdateListener(new e3(this, 23));
                }
                arrayList.add(ofFloat);
                i16++;
                i12 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.h0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.t6.d, 0, 255));
            bu0 bu0Var = photoViewer.e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(bu0Var, (Property<bu0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.nf0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new zb0(this, 13));
            photoViewer.e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new xg0(27, this, animatorSet));
        }
        backgroundDrawable.d = new xg0(28, this, ju0Var);
        qn qnVar = photoViewer.l4;
        if (qnVar == null || qnVar.getFragmentView() == null) {
            return true;
        }
        qn qnVar2 = photoViewer.l4;
        qnVar2.T7();
        UndoView undoView = qnVar2.y3;
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
