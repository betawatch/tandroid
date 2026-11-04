package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qa0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final oa0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final android.support.v4.media.session.a0 a = new android.support.v4.media.session.a0(new a3(16));
    public final b8.kg b = new b8.kg(18, (byte) 0);
    public final bi.c1 c = new bi.c1(3);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public qa0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new oa0();
        } else {
            this.d = null;
        }
    }

    public static void a(Matrix matrix, float[] fArr) {
        Matrix matrix2 = l;
        matrix.invert(matrix2);
        float[] fArr2 = k;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        matrix2.mapPoints(fArr2);
        fArr[0] = fArr2[2] - fArr2[0];
        fArr[1] = fArr2[3] - fArr2[1];
        fArr[2] = fArr2[0];
        fArr[3] = fArr2[1];
    }

    public static boolean b(float f10) {
        return Math.abs(f10 - 1.0f) <= 1.0E-4f;
    }

    public final void c(RectF rectF) {
        float f10 = this.e;
        float f11 = this.f;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f10, f11);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        bi.c1 c1Var = this.c;
        pa0 pa0Var = (pa0) c1Var.c;
        pa0Var.b.set(matrix);
        BitmapShader bitmapShader = pa0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        pa0 pa0Var2 = (pa0) c1Var.d;
        pa0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = pa0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        oa0 oa0Var = this.d;
        if (oa0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = oa0Var.g;
        a(matrix, fArr);
        oa0Var.e.a(fArr);
        oa0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        bi.c1 c1Var = this.c;
        float[] fArr = (float[]) c1Var.h;
        a(matrix, fArr);
        pa0 pa0Var = (pa0) c1Var.e;
        pa0Var.b.set(matrix);
        BitmapShader bitmapShader = pa0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        pa0Var.a(b(fArr[0]) && b(fArr[1]));
        oa0 oa0Var = this.d;
        if (oa0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = oa0Var.g;
        a(matrix, fArr2);
        pa0 pa0Var2 = oa0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        pa0Var2.a(z10);
        oa0Var.e.b(fArr2);
        oa0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i3, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.j(bitmap2);
        if (i11 >= 0) {
            int o10 = i0.a.o(i3, ((Color.alpha(i3) * i10) * i11) / 25500);
            b8.kg kgVar = this.b;
            jh.a aVar = (jh.a) kgVar.c;
            if (aVar.a(bitmap) || o10 != kgVar.b || ((Bitmap) kgVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) kgVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) kgVar.d).getHeight() != bitmap.getHeight()) {
                    kgVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) kgVar.d, o10);
                aVar.b(bitmap);
                kgVar.b = o10;
            }
            bitmap3 = (Bitmap) kgVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        oa0 oa0Var = this.d;
        if (oa0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return oa0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        bi.c1 c1Var = this.c;
        km kmVar = (km) c1Var.f;
        km kmVar2 = (km) c1Var.g;
        pa0 pa0Var = (pa0) c1Var.d;
        Paint paint = (Paint) c1Var.b;
        pa0 pa0Var2 = (pa0) c1Var.c;
        boolean b10 = pa0Var2.b(bitmap);
        pa0 pa0Var3 = (pa0) c1Var.e;
        boolean b11 = b10 | pa0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((pa0Var.b(bitmap6) | b11) || c1Var.a != 1) {
                c1Var.a = 1;
                paint.setShader(new ComposeShader(pa0Var2.d, new ComposeShader(pa0Var.d, pa0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((kmVar2.R(i0.a.o(-1, ((-i11) * i10) / 100)) | b11 | kmVar.R(-16777216)) || c1Var.a != 2) {
            c1Var.a = 2;
            paint.setShader(new ComposeShader((cg.k) kmVar.b, new ComposeShader(new ComposeShader(pa0Var2.d, pa0Var3.d, PorterDuff.Mode.DST_IN), (cg.k) kmVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
