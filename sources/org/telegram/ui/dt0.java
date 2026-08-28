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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClippingImageView[] a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ float c;
    public final /* synthetic */ bu0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ zt0 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ PhotoViewer r;

    public dt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, bu0 bu0Var, float f11, zt0 zt0Var, ArrayList arrayList, Integer num) {
        this.r = photoViewer;
        this.a = clippingImageViewArr;
        this.b = layoutParams;
        this.c = f10;
        this.d = bu0Var;
        this.e = f11;
        this.f = zt0Var;
        this.h = arrayList;
        this.n = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        char c10;
        float r22;
        float d;
        float d9;
        boolean z10;
        PhotoViewer photoViewer = this.r;
        Rect rect = photoViewer.o2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.H0;
        float[][] fArr = photoViewer.g4;
        ClippingImageView[] clippingImageViewArr = this.a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.c0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i9 = photoViewer.Y1;
        ViewGroup.LayoutParams layoutParams = this.b;
        if (i9 == 1) {
            float f10 = !photoViewer.s ? AndroidUtilities.statusBarHeight : 0;
            float measuredHeight = (photoViewer.y1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f10;
            c10 = 0;
            float min = Math.min(photoViewer.y1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.y1.getMeasuredWidth() / 2.0f;
            float f11 = (measuredHeight / 2.0f) + f10;
            float f12 = min / 2.0f;
            float f13 = f11 - f12;
            float f14 = (f11 + f12) - f13;
            r22 = Math.max(((measuredWidth + f12) - (measuredWidth - f12)) / layoutParams.width, f14 / layoutParams.height);
            d = ((f14 - (layoutParams.height * r22)) / 2.0f) + f13;
            int measuredWidth2 = photoViewer.c0.getMeasuredWidth();
            d9 = e2.c.d(layoutParams.width, r22, (measuredWidth2 - r10) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float min2 = Math.min(photoViewer.c0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            r22 = photoViewer.Y1 == 11 ? photoViewer.r2(true) * min2 : min2;
            d = e2.c.d(layoutParams.height, r22, AndroidUtilities.displaySize.y + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            d9 = e2.c.d(layoutParams.width, r22, photoViewer.c0.getMeasuredWidth(), 2.0f);
            photoViewer.X5 = 0.0f;
            photoViewer.b6 = 0.0f;
        }
        bu0 bu0Var = this.d;
        int abs = (int) Math.abs(this.c - bu0Var.a.getImageX());
        float imageY = bu0Var.a.getImageY();
        float f15 = this.e;
        int abs2 = (int) Math.abs(f15 - imageY);
        if (bu0Var.a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        bu0Var.d.getLocationInWindow(iArr);
        float f16 = bu0Var.c + f15;
        int i10 = (int) ((iArr[1] - f16) + bu0Var.j);
        if (i10 < 0) {
            i10 = 0;
        }
        int height = (int) (((f16 + layoutParams.height) - (bu0Var.d.getHeight() + r9)) + bu0Var.i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i10, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.d0.getScaleX();
        fArr[c10][1] = photoViewer.d0.getScaleY();
        fArr[c10][2] = photoViewer.d0.getTranslationX();
        fArr[c10][3] = photoViewer.d0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f17 = abs;
        float f18 = bu0Var.k;
        fArr2[4] = f17 * f18;
        fArr2[5] = max * f18;
        fArr2[6] = max2 * f18;
        int[] radius = photoViewer.d0.getRadius();
        for (int i11 = 0; i11 < 4; i11++) {
            fArr[c10][i11 + 7] = radius != null ? radius[i11] : 0.0f;
        }
        float[] fArr3 = fArr[c10];
        float f19 = bu0Var.k;
        fArr3[11] = abs2 * f19;
        fArr3[12] = f17 * f19;
        float[] fArr4 = fArr[1];
        fArr4[c10] = r22;
        fArr4[1] = r22;
        fArr4[2] = d9;
        fArr4[3] = d;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
            clippingImageView2.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.a0.setAlpha(0.0f);
        photoViewer.f0.setAlpha(0.0f);
        hr hrVar = new hr(this, clippingImageViewArr, this.h, this.n, this.f);
        photoViewer.l4 = hrVar;
        if (photoViewer.h2) {
            hrVar.run();
            photoViewer.l4 = null;
            photoViewer.a0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.Y1 == 1) {
                photoViewer.y1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.Y1 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            for (int i12 = 0; i12 < clippingImageViewArr.length; i12++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i12], org.telegram.ui.Components.m6.f, 0.0f, 1.0f);
                if (i12 == 0) {
                    ofFloat.addUpdateListener(new f3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.d0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255));
            tt0 tt0Var = photoViewer.a0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(tt0Var, (Property<tt0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.Y1 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.y1, (Property<org.telegram.ui.Components.be0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new bc0(this, 13));
            photoViewer.a0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.k4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new ys0(1, this, animatorSet));
        }
        backgroundDrawable.d = new ys0(2, this, bu0Var);
        qn qnVar = photoViewer.h4;
        if (qnVar == null || qnVar.getFragmentView() == null) {
            return true;
        }
        qn qnVar2 = photoViewer.h4;
        qnVar2.Q7();
        UndoView undoView = qnVar2.u3;
        if (undoView != null) {
            z10 = true;
            undoView.e(1, false);
        } else {
            z10 = true;
        }
        photoViewer.h4.getFragmentView().invalidate();
        return z10;
    }
}
