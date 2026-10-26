package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ia implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ ja d;

    public ia(ja jaVar) {
        this.d = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        ja jaVar = this.d;
        Paint paint = jaVar.w;
        if (jaVar.f == null) {
            jaVar.f = new Bitmap[2];
            jaVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? jaVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = jaVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || jaVar.f[i11].getWidth() != i10) && (bitmap = jaVar.f[i11]) != null)) {
                bitmap.recycle();
                jaVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = jaVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    jaVar.i[i11] = new Canvas(jaVar.f[i11]);
                    jaVar.i[i11].scale(i10 / jaVar.e[i11].getWidth(), i12 / jaVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                jaVar.f[i11].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, jaVar.y));
            } else {
                jaVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(jaVar.e[i11], 15);
            Canvas canvas = jaVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(jaVar.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new pg(this, 13));
    }
}
