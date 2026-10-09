package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ha implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ ia d;

    public ha(ia iaVar) {
        this.d = iaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        ia iaVar = this.d;
        Paint paint = iaVar.w;
        if (iaVar.f == null) {
            iaVar.f = new Bitmap[2];
            iaVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? iaVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = iaVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || iaVar.f[i11].getWidth() != i10) && (bitmap = iaVar.f[i11]) != null)) {
                bitmap.recycle();
                iaVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = iaVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    iaVar.i[i11] = new Canvas(iaVar.f[i11]);
                    iaVar.i[i11].scale(i10 / iaVar.e[i11].getWidth(), i12 / iaVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                iaVar.f[i11].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, iaVar.y));
            } else {
                iaVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(iaVar.e[i11], 15);
            Canvas canvas = iaVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(iaVar.e[i11], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i11++;
            }
        }
        AndroidUtilities.runOnUIThread(new rg(this, 12));
    }
}
