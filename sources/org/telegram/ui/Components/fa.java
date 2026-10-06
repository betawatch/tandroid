package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fa implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ ga d;

    public fa(ga gaVar) {
        this.d = gaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        ga gaVar = this.d;
        Paint paint = gaVar.w;
        if (gaVar.f == null) {
            gaVar.f = new Bitmap[2];
            gaVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? gaVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = gaVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || gaVar.f[i11].getWidth() != i10) && (bitmap = gaVar.f[i11]) != null)) {
                bitmap.recycle();
                gaVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = gaVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    gaVar.i[i11] = new Canvas(gaVar.f[i11]);
                    gaVar.i[i11].scale(i10 / gaVar.e[i11].getWidth(), i12 / gaVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                gaVar.f[i11].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, gaVar.y));
            } else {
                gaVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(gaVar.e[i11], 15);
            Canvas canvas = gaVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(gaVar.e[i11], 0.0f, 0.0f, paint);
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
