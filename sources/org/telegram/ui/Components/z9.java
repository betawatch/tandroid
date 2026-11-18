package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z9 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final /* synthetic */ aa d;

    public z9(aa aaVar) {
        this.d = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        aa aaVar = this.d;
        Paint paint = aaVar.w;
        if (aaVar.f == null) {
            aaVar.f = new Bitmap[2];
            aaVar.i = new Canvas[2];
        }
        int i7 = (int) (this.b / 15.0f);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = (int) ((i10 == 0 ? aaVar.s : this.c) / 15.0f);
            Bitmap bitmap2 = aaVar.f[i10];
            if (bitmap2 != null && ((bitmap2.getHeight() != i11 || aaVar.f[i10].getWidth() != i7) && (bitmap = aaVar.f[i10]) != null)) {
                bitmap.recycle();
                aaVar.f[i10] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = aaVar.f;
            if (bitmapArr[i10] == null) {
                try {
                    bitmapArr[i10] = Bitmap.createBitmap(i7, i11, Bitmap.Config.ARGB_8888);
                    aaVar.i[i10] = new Canvas(aaVar.f[i10]);
                    aaVar.i[i10].scale(i7 / aaVar.e[i10].getWidth(), i11 / aaVar.e[i10].getHeight());
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            if (i10 == 1) {
                aaVar.f[i10].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, aaVar.y));
            } else {
                aaVar.f[i10].eraseColor(0);
            }
            paint.setAlpha(org.telegram.messenger.ks.e4);
            Utilities.stackBlurBitmap(aaVar.e[i10], 15);
            Canvas canvas = aaVar.i[i10];
            if (canvas != null) {
                canvas.drawBitmap(aaVar.e[i10], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            } else {
                i10++;
            }
        }
        org.telegram.messenger.g0.g3(new lg(this, 12));
    }
}
