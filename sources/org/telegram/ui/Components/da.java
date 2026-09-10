package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class da implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ ea d;

    public da(ea eaVar) {
        this.d = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        ea eaVar = this.d;
        Paint paint = eaVar.w;
        if (eaVar.f == null) {
            eaVar.f = new Bitmap[2];
            eaVar.i = new Canvas[2];
        }
        int i10 = (int) (this.b / 15.0f);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = (int) ((i11 == 0 ? eaVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = eaVar.f[i11];
            if (bitmap2 != null && ((bitmap2.getHeight() != i12 || eaVar.f[i11].getWidth() != i10) && (bitmap = eaVar.f[i11]) != null)) {
                bitmap.recycle();
                eaVar.f[i11] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = eaVar.f;
            if (bitmapArr[i11] == null) {
                try {
                    bitmapArr[i11] = Bitmap.createBitmap(i10, i12, Bitmap.Config.ARGB_8888);
                    eaVar.i[i11] = new Canvas(eaVar.f[i11]);
                    eaVar.i[i11].scale(i10 / eaVar.e[i11].getWidth(), i12 / eaVar.e[i11].getHeight());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (i11 == 1) {
                eaVar.f[i11].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, eaVar.y));
            } else {
                eaVar.f[i11].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(eaVar.e[i11], 15);
            Canvas canvas = eaVar.i[i11];
            if (canvas != null) {
                canvas.drawBitmap(eaVar.e[i11], 0.0f, 0.0f, paint);
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
