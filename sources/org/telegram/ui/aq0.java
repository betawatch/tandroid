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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class aq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wq0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ uq0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public aq0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, wq0 wq0Var, float f11, uq0 uq0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f10;
        this.d = wq0Var;
        this.e = f11;
        this.f = uq0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i7;
        float w10;
        float f10;
        float f11;
        boolean z10;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.k4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i10 = photoViewer.d2;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i10 == 1) {
            float f12 = !photoViewer.s ? org.telegram.messenger.g0.m : 0;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - f12;
            i7 = 0;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.g0.L(16.0f) * 2);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f13 = (measuredHeight / 2.0f) + f12;
            float f14 = min / 2.0f;
            float f15 = f13 - f14;
            float f16 = (f13 + f14) - f15;
            f10 = Math.max(((measuredWidth + f14) - (measuredWidth - f14)) / layoutParams.width, f16 / layoutParams.height);
            w10 = ((f16 - (layoutParams.height * f10)) / 2.0f) + f15;
            int measuredWidth2 = photoViewer.h0.getMeasuredWidth();
            f11 = com.google.android.gms.internal.vision.e2.w(layoutParams.width, f10, (measuredWidth2 - r11) - rect.right, 2.0f) + rect.left;
        } else {
            i7 = 0;
            float measuredWidth3 = photoViewer.h0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.q;
            float min2 = Math.min(measuredWidth3, (point.y + (!photoViewer.s ? org.telegram.messenger.g0.m : 0)) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.p2(true) * min2;
            }
            w10 = com.google.android.gms.internal.vision.e2.w(layoutParams.height, min2, point.y + (!photoViewer.s ? org.telegram.messenger.g0.m : 0), 2.0f);
            float w11 = com.google.android.gms.internal.vision.e2.w(layoutParams.width, min2, photoViewer.h0.getMeasuredWidth(), 2.0f);
            photoViewer.b6 = 0.0f;
            photoViewer.f6 = 0.0f;
            f10 = min2;
            f11 = w11;
        }
        wq0 wq0Var = this.d;
        int abs = (int) Math.abs(this.c - wq0Var.a.L0);
        float f17 = wq0Var.a.M0;
        float f18 = this.e;
        int abs2 = (int) Math.abs(f18 - f17);
        if (wq0Var.a.S0) {
            abs = i7;
        }
        int[] iArr = new int[2];
        int i11 = 2;
        wq0Var.d.getLocationInWindow(iArr);
        float f19 = wq0Var.c + f18;
        int i12 = (int) ((iArr[1] - f19) + wq0Var.j);
        if (i12 < 0) {
            i12 = i7;
        }
        int height = (int) (((f19 + layoutParams.height) - (wq0Var.d.getHeight() + r10)) + wq0Var.i);
        if (height < 0) {
            height = i7;
        }
        int max = Math.max(i12, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i7][i7] = photoViewer.i0.getScaleX();
        fArr[i7][1] = photoViewer.i0.getScaleY();
        fArr[i7][2] = photoViewer.i0.getTranslationX();
        fArr[i7][3] = photoViewer.i0.getTranslationY();
        float[] fArr2 = fArr[i7];
        float f20 = abs;
        float f21 = wq0Var.k;
        fArr2[4] = f20 * f21;
        fArr2[5] = max * f21;
        float f22 = max2 * f21;
        char c10 = 6;
        fArr2[6] = f22;
        int[] radius = photoViewer.i0.getRadius();
        int i13 = i7;
        while (i13 < 4) {
            char c11 = c10;
            fArr[i7][i13 + 7] = radius != null ? radius[i13] : 0.0f;
            i13++;
            c10 = c11;
        }
        float[] fArr3 = fArr[i7];
        float f23 = wq0Var.k;
        fArr3[11] = abs2 * f23;
        fArr3[12] = f20 * f23;
        float[] fArr4 = fArr[1];
        fArr4[i7] = f10;
        fArr4[1] = f10;
        fArr4[2] = f11;
        fArr4[3] = w10;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[c10] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (int i14 = i7; i14 < clippingImageViewArr.length; i14++) {
            clippingImageViewArr[i14].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i7);
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.k0.setAlpha(0.0f);
        wn wnVar = new wn(this, clippingImageViewArr, this.h, this.n, this.f, 27);
        photoViewer.p4 = wnVar;
        if (photoViewer.m2) {
            wnVar.run();
            photoViewer.p4 = null;
            photoViewer.f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(org.telegram.messenger.ls.e4);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.d2 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            int i15 = 0;
            while (i15 < clippingImageViewArr.length) {
                float[] fArr5 = new float[i11];
                // fill-array-data instruction
                fArr5[0] = 0.0f;
                fArr5[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i15], org.telegram.ui.Components.r6.f, fArr5);
                if (i15 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i15++;
                i11 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.i0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.r6.d, 0, org.telegram.messenger.ls.e4));
            qq0 qq0Var = photoViewer.f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(qq0Var, (Property<qq0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<org.telegram.ui.Components.rd0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ay(this, 17));
            photoViewer.f0.setLayerType(2, null);
            photoViewer.w2(false);
            photoViewer.o4 = System.currentTimeMillis();
            org.telegram.messenger.g0.g3(new fe0(28, this, animatorSet));
        }
        backgroundDrawable.d = new fe0(29, this, wq0Var);
        bn bnVar = photoViewer.l4;
        if (bnVar == null || bnVar.getFragmentView() == null) {
            return true;
        }
        bn bnVar2 = photoViewer.l4;
        bnVar2.h8();
        UndoView undoView = bnVar2.N3;
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
