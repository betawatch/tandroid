package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ w9 d;

    public v9(w9 w9Var) {
        this.d = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        w9 w9Var = this.d;
        Paint paint = w9Var.w;
        if (w9Var.f == null) {
            w9Var.f = new Bitmap[2];
            w9Var.i = new Canvas[2];
        }
        int i7 = (int) (this.b / 15.0f);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = (int) ((i10 == 0 ? w9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = w9Var.f[i10];
            if (bitmap2 != null && ((bitmap2.getHeight() != i11 || w9Var.f[i10].getWidth() != i7) && (bitmap = w9Var.f[i10]) != null)) {
                bitmap.recycle();
                w9Var.f[i10] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = w9Var.f;
            if (bitmapArr[i10] == null) {
                try {
                    bitmapArr[i10] = Bitmap.createBitmap(i7, i11, Bitmap.Config.ARGB_8888);
                    w9Var.i[i10] = new Canvas(w9Var.f[i10]);
                    w9Var.i[i10].scale(i7 / w9Var.e[i10].getWidth(), i11 / w9Var.e[i10].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i10 == 1) {
                w9Var.f[i10].eraseColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, w9Var.y));
            } else {
                w9Var.f[i10].eraseColor(0);
            }
            paint.setAlpha(org.telegram.messenger.qs.e4);
            Utilities.stackBlurBitmap(w9Var.e[i10], 15);
            Canvas canvas = w9Var.i[i10];
            if (canvas != null) {
                canvas.drawBitmap(w9Var.e[i10], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i10++;
            }
        }
        org.telegram.messenger.g0.h3(new xf(this, 12));
    }
}
