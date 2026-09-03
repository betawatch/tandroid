package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? x9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = x9Var.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || x9Var.f[i11].getWidth() != i10) && (bitmap = x9Var.f[i11]) != null)) {
                bitmap.recycle();
                x9Var.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = x9Var.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    x9Var.i[i11] = new Canvas(x9Var.f[i11]);
                    x9Var.i[i11].scale(i10 / x9Var.e[i11].getWidth(), i12 / x9Var.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                x9Var.f[i11].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, x9Var.y));
            } else {
                x9Var.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(x9Var.e[i11], 15);
            Canvas canvas = x9Var.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(x9Var.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new fg(this, 12));
    }
}
