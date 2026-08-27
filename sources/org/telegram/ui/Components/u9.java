package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? v9Var.s : this.c) / 15.0f);
            Bitmap bitmap2 = v9Var.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || v9Var.f[i11].getWidth() != i10) && (bitmap = v9Var.f[i11]) != null)) {
                bitmap.recycle();
                v9Var.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = v9Var.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    v9Var.i[i11] = new Canvas(v9Var.f[i11]);
                    v9Var.i[i11].scale(i10 / v9Var.e[i11].getWidth(), i12 / v9Var.e[i11].getHeight());
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (i11 == 1) {
                v9Var.f[i11].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, v9Var.y));
            } else {
                v9Var.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(v9Var.e[i11], 15);
            Canvas canvas = v9Var.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(v9Var.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new bg(this, 12));
    }
}
