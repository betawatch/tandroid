package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ z9 d;

    public y9(z9 z9Var) {
        this.d = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        z9 z9Var = this.d;
        Paint paint = z9Var.w;
        if (z9Var.f == null) {
            z9Var.f = new Bitmap[2];
            z9Var.i = new Canvas[2];
        }
        int i7 = (int) (this.b / 15.0f);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = (int) ((i10 == 0 ? z9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = z9Var.f[i10];
            if (bitmap2 != null && ((bitmap2.getHeight() != i11 || z9Var.f[i10].getWidth() != i7) && (bitmap = z9Var.f[i10]) != null)) {
                bitmap.recycle();
                z9Var.f[i10] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = z9Var.f;
            if (bitmapArr[i10] == null) {
                try {
                    bitmapArr[i10] = Bitmap.createBitmap(i7, i11, Bitmap.Config.ARGB_8888);
                    z9Var.i[i10] = new Canvas(z9Var.f[i10]);
                    z9Var.i[i10].scale(i7 / z9Var.e[i10].getWidth(), i11 / z9Var.e[i10].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i10 == 1) {
                z9Var.f[i10].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, z9Var.y));
            } else {
                z9Var.f[i10].eraseColor(0);
            }
            paint.setAlpha(org.telegram.messenger.ks.e4);
            Utilities.stackBlurBitmap(z9Var.e[i10], 15);
            Canvas canvas = z9Var.i[i10];
            if (canvas != null) {
                canvas.drawBitmap(z9Var.e[i10], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i10++;
            }
        }
        org.telegram.messenger.g0.g3(new ng(this, 12));
    }
}
