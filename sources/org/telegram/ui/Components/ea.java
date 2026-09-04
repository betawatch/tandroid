package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ea implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ fa d;

    public ea(fa faVar) {
        this.d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        fa faVar = this.d;
        Paint paint = faVar.w;
        if (faVar.f == null) {
            faVar.f = new Bitmap[2];
            faVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? faVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = faVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || faVar.f[i11].getWidth() != i10) && (bitmap = faVar.f[i11]) != null)) {
                bitmap.recycle();
                faVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = faVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    faVar.i[i11] = new Canvas(faVar.f[i11]);
                    faVar.i[i11].scale(i10 / faVar.e[i11].getWidth(), i12 / faVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                faVar.f[i11].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, faVar.y));
            } else {
                faVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(faVar.e[i11], 15);
            Canvas canvas = faVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(faVar.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new pg(this, 12));
    }
}
