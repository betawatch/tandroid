package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, r0.m {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ ln0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.a.t2(z9, i7, i10, false, false, false);
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.a;
        cn0 cn0Var = photoViewer.u4;
        Rect rect = photoViewer.s2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = k1Var.a.f(647).d;
        int i10 = I0.a;
        int i11 = I0.b;
        int i12 = I0.c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.m4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.j4[0][2] = photoViewer.h0.getTranslationX();
            }
            vq0 vq0Var = photoViewer.g0;
            if (vq0Var != null) {
                vq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.j0;
        if (view2 != null) {
            photoViewer.k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.e0.setPadding(i10, 0, i12, 0);
        if (photoViewer.F != null) {
            org.telegram.messenger.g0.r(cn0Var);
            if (photoViewer.e && photoViewer.m4 == 0) {
                org.telegram.messenger.g0.i3(cn0Var, 200L);
            }
        }
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        uq0 uq0Var;
        int i7;
        Bitmap n10;
        int i10;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.B4 && z9 && !z10) {
            if (!photoViewer.r1 && ((photoViewer.t4 == 1 || (i10 = photoViewer.c2) == 1 || i10 == 11) && photoViewer.C1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
                int i11 = imageReceiver.U;
                int i12 = photoViewer.c2;
                fd0Var.b(n10, i11, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.D1, null, null);
            }
            if (photoViewer.x4.getVisibility() == 0) {
                photoViewer.e0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver != photoViewer.B4 || !z9 || (uq0Var = photoViewer.d) == null || !uq0Var.K() || photoViewer.j5 || (i7 = photoViewer.c2) == 1 || i7 == 11) {
            return;
        }
        if (photoViewer.S5) {
            photoViewer.K2();
        } else {
            photoViewer.T5 = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.a.b3(0);
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
