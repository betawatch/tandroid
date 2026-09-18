package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ca implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ da d;

    public ca(da daVar) {
        this.d = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        da daVar = this.d;
        Paint paint = daVar.w;
        if (daVar.f == null) {
            daVar.f = new Bitmap[2];
            daVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? daVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = daVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || daVar.f[i11].getWidth() != i10) && (bitmap = daVar.f[i11]) != null)) {
                bitmap.recycle();
                daVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = daVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    daVar.i[i11] = new Canvas(daVar.f[i11]);
                    daVar.i[i11].scale(i10 / daVar.e[i11].getWidth(), i12 / daVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                daVar.f[i11].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, daVar.y));
            } else {
                daVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(daVar.e[i11], 15);
            Canvas canvas = daVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(daVar.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new ng(this, 12));
    }
}
