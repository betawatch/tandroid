package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ga implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ ha d;

    public ga(ha haVar) {
        this.d = haVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        ha haVar = this.d;
        Paint paint = haVar.w;
        if (haVar.f == null) {
            haVar.f = new Bitmap[2];
            haVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? haVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = haVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || haVar.f[i11].getWidth() != i10) && (bitmap = haVar.f[i11]) != null)) {
                bitmap.recycle();
                haVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = haVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    haVar.i[i11] = new Canvas(haVar.f[i11]);
                    haVar.i[i11].scale(i10 / haVar.e[i11].getWidth(), i12 / haVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                haVar.f[i11].eraseColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, haVar.y));
            } else {
                haVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(haVar.e[i11], 15);
            Canvas canvas = haVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(haVar.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new qg(this, 12));
    }
}
