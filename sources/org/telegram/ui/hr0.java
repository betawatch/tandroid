package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ hr0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.a.z2(z10, i10, i11, false, false, false);
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.a;
        zq0 zq0Var = photoViewer.v4;
        Rect rect = photoViewer.s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = k1Var.a.f(647).d;
        int i11 = defaultWindowInsets.a;
        int i12 = defaultWindowInsets.b;
        int i13 = defaultWindowInsets.c;
        rect.set(i11, i12, i13, i10);
        if (!rect2.equals(rect)) {
            int i14 = photoViewer.n4;
            if (i14 == 1 || i14 == 3) {
                ClippingImageView clippingImageView = photoViewer.h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.k4[0][2] = photoViewer.h0.getTranslationX();
            }
            ru0 ru0Var = photoViewer.g0;
            if (ru0Var != null) {
                ru0Var.requestLayout();
            }
        }
        View view2 = photoViewer.j0;
        if (view2 != null) {
            photoViewer.k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i15 = photoViewer.k0;
            marginLayoutParams.height = i15;
            marginLayoutParams.bottomMargin = (-i15) / 2;
            photoViewer.j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.e0.setPadding(defaultWindowInsets.a, 0, i13, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(zq0Var);
            if (photoViewer.e && photoViewer.n4 == 0) {
                AndroidUtilities.runOnUIThread(zq0Var, 200L);
            }
        }
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qu0 qu0Var;
        int i10;
        Bitmap bitmap;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.r1 && ((photoViewer.u4 == 1 || (i11 = photoViewer.c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.pf0 pf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.c2;
                pf0Var.b(bitmap, orientation, (i12 == 1 || i12 == 11) ? false : true, true, photoViewer.D1, null, null);
            }
            if (photoViewer.y4.getVisibility() == 0) {
                photoViewer.e0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver != photoViewer.C4 || !z10 || (qu0Var = photoViewer.d) == null || !qu0Var.K() || photoViewer.k5 || (i10 = photoViewer.c2) == 1 || i10 == 11) {
            return;
        }
        if (photoViewer.T5) {
            photoViewer.Q2();
        } else {
            photoViewer.U5 = true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.a.h3(0);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }
}
