package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ba implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ ca d;

    public ba(ca caVar) {
        this.d = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        ca caVar = this.d;
        Paint paint = caVar.w;
        if (caVar.f == null) {
            caVar.f = new Bitmap[2];
            caVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? caVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = caVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || caVar.f[i11].getWidth() != i10) && (bitmap = caVar.f[i11]) != null)) {
                bitmap.recycle();
                caVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = caVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    caVar.i[i11] = new Canvas(caVar.f[i11]);
                    caVar.i[i11].scale(i10 / caVar.e[i11].getWidth(), i12 / caVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                caVar.f[i11].eraseColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, caVar.y));
            } else {
                caVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(caVar.e[i11], 15);
            Canvas canvas = caVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(caVar.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new ig(this, 12));
    }
}
