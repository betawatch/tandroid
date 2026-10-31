package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ur implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ur(int i10, int i11, int i12, Bitmap[] bitmapArr, q20 q20Var) {
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = bitmapArr;
        this.f = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((hs) this.e).B0(this.b, this.c, this.d, (long[]) this.f);
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                q20 q20Var = (q20) this.f;
                Bitmap createBitmap = Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f7 = this.d;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                    if (bitmapArr[i10] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i10].getWidth(), createBitmap.getHeight() / bitmapArr[i10].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i10].getWidth()) / 2.0f, (-bitmapArr[i10].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i10], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        i0.z2(bitmapArr[i10]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                i0.g3(new vh.d1(4, q20Var, createBitmap));
                break;
        }
    }

    public /* synthetic */ ur(hs hsVar, int i10, int i11, int i12, long[] jArr) {
        this.e = hsVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = jArr;
    }
}
