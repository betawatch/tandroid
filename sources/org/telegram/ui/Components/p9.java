package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ q9 d;

    public p9(q9 q9Var) {
        this.d = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        q9 q9Var = this.d;
        Paint paint = q9Var.w;
        if (q9Var.f == null) {
            q9Var.f = new Bitmap[2];
            q9Var.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? q9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = q9Var.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || q9Var.f[i11].getWidth() != i10) && (bitmap = q9Var.f[i11]) != null)) {
                bitmap.recycle();
                q9Var.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = q9Var.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    q9Var.i[i11] = new Canvas(q9Var.f[i11]);
                    q9Var.i[i11].scale(i10 / q9Var.e[i11].getWidth(), i12 / q9Var.e[i11].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
            }
            if (i11 == 1) {
                q9Var.f[i11].eraseColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, q9Var.y));
            } else {
                q9Var.f[i11].eraseColor(0);
            }
            paint.setAlpha(org.telegram.messenger.zs.e4);
            Utilities.stackBlurBitmap(q9Var.e[i11], 15);
            Canvas canvas = q9Var.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(q9Var.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        org.telegram.messenger.i0.g3(new tf(this, 13));
    }
}
