package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jr0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ gs0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ es0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public jr0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, gs0 gs0Var, float f10, es0 es0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f7;
        this.d = gs0Var;
        this.e = f10;
        this.f = es0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        float g10;
        float f7;
        float f10;
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
            float f11 = !photoViewer.s ? org.telegram.messenger.i0.m : 0;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - org.telegram.messenger.i0.L(64.0f)) - f11;
            i10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.i0.L(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f12 = (measuredHeight / 2.0f) + f11;
            float f13 = min / 2.0f;
            float f14 = f12 - f13;
            float f15 = (f12 + f13) - f14;
            f7 = Math.max(((measuredWidth + f13) - (measuredWidth - f13)) / layoutParams.width, f15 / layoutParams.height);
            g10 = ((f15 - (layoutParams.height * f7)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.g0.getMeasuredWidth();
            f10 = c3.i0.g(layoutParams.width, f7, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.g0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.i0.q;
            float min2 = Math.min(measuredWidth3, (point.y + (!photoViewer.s ? org.telegram.messenger.i0.m : 0)) / layoutParams.height);
            if (photoViewer.c2 == 11) {
                min2 = photoViewer.u2(true) * min2;
            }
            g10 = c3.i0.g(layoutParams.height, min2, point.y + (!photoViewer.s ? org.telegram.messenger.i0.m : 0), 2.0f);
            float g11 = c3.i0.g(layoutParams.width, min2, photoViewer.g0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
            f7 = min2;
            f10 = g11;
        }
        gs0 gs0Var = this.d;
        int abs = (int) Math.abs(this.c - gs0Var.a.K0);
        float f16 = gs0Var.a.L0;
        float f17 = this.e;
        int abs2 = (int) Math.abs(f17 - f16);
        if (gs0Var.a.R0) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i12 = 2;
        gs0Var.d.getLocationInWindow(iArr);
        float f18 = gs0Var.c + f17;
        int i13 = (int) ((iArr[1] - f18) + gs0Var.j);
        if (i13 < 0) {
            i13 = i10;
        }
        int height = (int) (((f18 + layoutParams.height) - (gs0Var.d.getHeight() + r10)) + gs0Var.i);
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
        float f19 = abs;
        float f20 = gs0Var.k;
        fArr2[4] = f19 * f20;
        fArr2[5] = max * f20;
        float f21 = max2 * f20;
        char c10 = 6;
        fArr2[6] = f21;
        int[] radius = photoViewer.h0.getRadius();
        int i14 = i10;
        while (i14 < 4) {
            char c11 = c10;
            fArr[i10][i14 + 7] = radius != null ? radius[i14] : 0.0f;
            i14++;
            c10 = c11;
        }
        float[] fArr3 = fArr[i10];
        float f22 = gs0Var.k;
        fArr3[11] = abs2 * f22;
        fArr3[12] = f19 * f22;
        float[] fArr4 = fArr[1];
        fArr4[i10] = f7;
        fArr4[1] = f7;
        fArr4[2] = f10;
        fArr4[3] = g10;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c10] = 0.0f;
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
        m90 m90Var = new m90(this, clippingImageViewArr, this.h, this.n, this.f, 12);
        photoViewer.p4 = m90Var;
        if (photoViewer.l2) {
            m90Var.run();
            photoViewer.p4 = null;
            photoViewer.e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(org.telegram.messenger.zs.e4);
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i16], org.telegram.ui.Components.i6.f, fArr5);
                if (i16 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i16++;
                i12 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.h0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.i6.d, 0, org.telegram.messenger.zs.e4));
            as0 as0Var = photoViewer.e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(as0Var, (Property<as0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.be0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new org.telegram.ui.Components.voip.h2(this, 27));
            photoViewer.e0.setLayerType(2, null);
            photoViewer.B2(false);
            photoViewer.o4 = System.currentTimeMillis();
            org.telegram.messenger.i0.g3(new uf0(28, this, animatorSet));
        }
        backgroundDrawable.d = new uf0(29, this, gs0Var);
        un unVar = photoViewer.l4;
        if (unVar == null || unVar.getFragmentView() == null) {
            return true;
        }
        un unVar2 = photoViewer.l4;
        unVar2.Y7();
        UndoView undoView = unVar2.M3;
        if (undoView != null) {
            z10 = true;
            undoView.d(1, false);
        } else {
            z10 = true;
        }
        photoViewer.l4.getFragmentView().invalidate();
        return z10;
    }
}
