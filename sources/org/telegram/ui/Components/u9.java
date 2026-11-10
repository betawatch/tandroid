package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ v9 d;

    public u9(v9 v9Var) {
        this.d = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        v9 v9Var = this.d;
        Paint paint = v9Var.w;
        if (v9Var.f == null) {
            v9Var.f = new Bitmap[2];
            v9Var.i = new Canvas[2];
        }
        int i7 = (int) (this.b / 15.0f);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = (int) ((i10 == 0 ? v9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = v9Var.f[i10];
            if (bitmap2 != null && ((bitmap2.getHeight() != i11 || v9Var.f[i10].getWidth() != i7) && (bitmap = v9Var.f[i10]) != null)) {
                bitmap.recycle();
                v9Var.f[i10] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = v9Var.f;
            if (bitmapArr[i10] == null) {
                try {
                    bitmapArr[i10] = Bitmap.createBitmap(i7, i11, Bitmap.Config.ARGB_8888);
                    v9Var.i[i10] = new Canvas(v9Var.f[i10]);
                    v9Var.i[i10].scale(i7 / v9Var.e[i10].getWidth(), i11 / v9Var.e[i10].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i10 == 1) {
                v9Var.f[i10].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, v9Var.y));
            } else {
                v9Var.f[i10].eraseColor(0);
            }
            paint.setAlpha(org.telegram.messenger.qs.e4);
            Utilities.stackBlurBitmap(v9Var.e[i10], 15);
            Canvas canvas = v9Var.i[i10];
            if (canvas != null) {
                canvas.drawBitmap(v9Var.e[i10], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i10++;
            }
        }
        org.telegram.messenger.g0.h3(new wf(this, 12));
    }
}
