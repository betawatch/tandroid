package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ x9 d;

    public w9(x9 x9Var) {
        this.d = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        x9 x9Var = this.d;
        Paint paint = x9Var.w;
        if (x9Var.f == null) {
            x9Var.f = new Bitmap[2];
            x9Var.i = new Canvas[2];
        }
        int i9 = (int) (this.b / 15.0f);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = (int) ((i10 == 0 ? x9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = x9Var.f[i10];
            if (bitmap2 != null && ((bitmap2.getHeight() != i11 || x9Var.f[i10].getWidth() != i9) && (bitmap = x9Var.f[i10]) != null)) {
                bitmap.recycle();
                x9Var.f[i10] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = x9Var.f;
            if (bitmapArr[i10] == null) {
                try {
                    bitmapArr[i10] = Bitmap.createBitmap(i9, i11, Bitmap.Config.ARGB_8888);
                    x9Var.i[i10] = new Canvas(x9Var.f[i10]);
                    x9Var.i[i10].scale(i9 / x9Var.e[i10].getWidth(), i11 / x9Var.e[i10].getHeight());
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (i10 == 1) {
                x9Var.f[i10].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, x9Var.y));
            } else {
                x9Var.f[i10].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(x9Var.e[i10], 15);
            Canvas canvas = x9Var.i[i10];
            if (canvas != null) {
                canvas.drawBitmap(x9Var.e[i10], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i10++;
            }
        }
        AndroidUtilities.runOnUIThread(new fg(this, 12));
    }
}
