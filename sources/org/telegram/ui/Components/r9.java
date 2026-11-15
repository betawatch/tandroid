package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ s9 d;

    public r9(s9 s9Var) {
        this.d = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        s9 s9Var = this.d;
        Paint paint = s9Var.w;
        if (s9Var.f == null) {
            s9Var.f = new Bitmap[2];
            s9Var.i = new Canvas[2];
        }
        int i7 = (int) (this.b / 15.0f);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = (int) ((i10 == 0 ? s9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = s9Var.f[i10];
            if (bitmap2 != null && ((bitmap2.getHeight() != i11 || s9Var.f[i10].getWidth() != i7) && (bitmap = s9Var.f[i10]) != null)) {
                bitmap.recycle();
                s9Var.f[i10] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = s9Var.f;
            if (bitmapArr[i10] == null) {
                try {
                    bitmapArr[i10] = Bitmap.createBitmap(i7, i11, Bitmap.Config.ARGB_8888);
                    s9Var.i[i10] = new Canvas(s9Var.f[i10]);
                    s9Var.i[i10].scale(i7 / s9Var.e[i10].getWidth(), i11 / s9Var.e[i10].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i10 == 1) {
                s9Var.f[i10].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, s9Var.y));
            } else {
                s9Var.f[i10].eraseColor(0);
            }
            paint.setAlpha(org.telegram.messenger.ns.e4);
            Utilities.stackBlurBitmap(s9Var.e[i10], 15);
            Canvas canvas = s9Var.i[i10];
            if (canvas != null) {
                canvas.drawBitmap(s9Var.e[i10], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i10++;
            }
        }
        org.telegram.messenger.g0.h3(new dg(this, 12));
    }
}
