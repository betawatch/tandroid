package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ oq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.a.w2(z10, i9, i10, false, false, false);
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.a;
        gq0 gq0Var = photoViewer.r4;
        Rect rect = photoViewer.o2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i9 = defaultWindowInsets.a;
        int i10 = defaultWindowInsets.b;
        int i11 = defaultWindowInsets.c;
        rect.set(i9, i10, i11, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i12 = photoViewer.j4;
            if (i12 == 1 || i12 == 3) {
                ClippingImageView clippingImageView = photoViewer.d0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.g4[0][2] = photoViewer.d0.getTranslationX();
            }
            au0 au0Var = photoViewer.c0;
            if (au0Var != null) {
                au0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f0;
        if (view2 != null) {
            photoViewer.g0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i13 = photoViewer.g0;
            marginLayoutParams.height = i13;
            marginLayoutParams.bottomMargin = (-i13) / 2;
            photoViewer.f0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.a0.setPadding(defaultWindowInsets.a, 0, i11, 0);
        if (photoViewer.B != null) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            if (photoViewer.e && photoViewer.j4 == 0) {
                AndroidUtilities.runOnUIThread(gq0Var, 200L);
            }
        }
        return r0.m1.b;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        zt0 zt0Var;
        int i9;
        Bitmap bitmap;
        int i10;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.y4 && z10 && !z11) {
            if (!photoViewer.n1 && ((photoViewer.q4 == 1 || (i10 = photoViewer.Y1) == 1 || i10 == 11) && photoViewer.y1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.be0 be0Var = photoViewer.y1;
                int orientation = imageReceiver.getOrientation();
                int i11 = photoViewer.Y1;
                be0Var.b(bitmap, orientation, (i11 == 1 || i11 == 11) ? false : true, true, photoViewer.z1, null, null);
            }
            if (photoViewer.u4.getVisibility() == 0) {
                photoViewer.a0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver != photoViewer.y4 || !z10 || (zt0Var = photoViewer.d) == null || !zt0Var.J() || photoViewer.g5 || (i9 = photoViewer.Y1) == 1 || i9 == 11) {
            return;
        }
        if (photoViewer.P5) {
            photoViewer.N2();
        } else {
            photoViewer.Q5 = true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.a.e3(0);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }
}
