package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ec, r0.m {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ gn0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.V8;
        this.a.z2(z10, i3, i10, false, false, false);
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.a;
        xm0 xm0Var = photoViewer.w4;
        Rect rect = photoViewer.t2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = k1Var.a.f(647).d;
        int i10 = I0.a;
        int i11 = I0.b;
        int i12 = I0.c;
        rect.set(i10, i11, i12, i3);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.o4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.l4[0][2] = photoViewer.i0.getTranslationX();
            }
            lq0 lq0Var = photoViewer.h0;
            if (lq0Var != null) {
                lq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.k0;
        if (view2 != null) {
            photoViewer.l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(xm0Var);
            if (photoViewer.e && photoViewer.o4 == 0) {
                org.telegram.messenger.g0.i3(xm0Var, 200L);
            }
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        Drawable[] drawableArr = PhotoViewer.V8;
        this.a.h3(0);
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kq0 kq0Var;
        int i3;
        Bitmap n4;
        int i10;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.D4 && z10 && !z11) {
            if (!photoViewer.s1 && ((photoViewer.v4 == 1 || (i10 = photoViewer.d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n4 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
                int i11 = imageReceiver.V;
                int i12 = photoViewer.d2;
                ad0Var.b(n4, i11, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.E1, null, null);
            }
            if (photoViewer.z4.getVisibility() == 0) {
                photoViewer.f0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver != photoViewer.D4 || !z10 || (kq0Var = photoViewer.d) == null || !kq0Var.K() || photoViewer.l5 || (i3 = photoViewer.d2) == 1 || i3 == 11) {
            return;
        }
        if (photoViewer.U5) {
            photoViewer.Q2();
        } else {
            photoViewer.V5 = true;
        }
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
