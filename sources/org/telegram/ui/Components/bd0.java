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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bd0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final zc0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final androidx.biometric.e a = new androidx.biometric.e(new k2(18));
    public final a5.a b = new a5.a(14, (byte) 0);
    public final q10 c = new q10(1);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public bd0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new zc0();
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

    public static boolean b(float f7) {
        return Math.abs(f7 - 1.0f) <= 1.0E-4f;
    }

    public final void c(RectF rectF) {
        float f7 = this.e;
        float f10 = this.f;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f7, f10);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        q10 q10Var = this.c;
        ad0 ad0Var = (ad0) q10Var.c;
        ad0Var.b.set(matrix);
        BitmapShader bitmapShader = ad0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        ad0 ad0Var2 = (ad0) q10Var.d;
        ad0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = ad0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        zc0 zc0Var = this.d;
        if (zc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = zc0Var.g;
        a(matrix, fArr);
        zc0Var.e.a(fArr);
        zc0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        q10 q10Var = this.c;
        float[] fArr = (float[]) q10Var.h;
        a(matrix, fArr);
        ad0 ad0Var = (ad0) q10Var.e;
        ad0Var.b.set(matrix);
        BitmapShader bitmapShader = ad0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        ad0Var.a(b(fArr[0]) && b(fArr[1]));
        zc0 zc0Var = this.d;
        if (zc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = zc0Var.g;
        a(matrix, fArr2);
        ad0 ad0Var2 = zc0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        ad0Var2.a(z10);
        zc0Var.e.b(fArr2);
        zc0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.o(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.a.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.b;
            hh.a aVar2 = (hh.a) aVar.c;
            if (aVar2.a(bitmap) || o10 != aVar.b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, o10);
                aVar2.b(bitmap);
                aVar.b = o10;
            }
            bitmap3 = (Bitmap) aVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        zc0 zc0Var = this.d;
        if (zc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return zc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        q10 q10Var = this.c;
        pt ptVar = (pt) q10Var.f;
        pt ptVar2 = (pt) q10Var.g;
        ad0 ad0Var = (ad0) q10Var.d;
        Paint paint = (Paint) q10Var.b;
        ad0 ad0Var2 = (ad0) q10Var.c;
        boolean b10 = ad0Var2.b(bitmap);
        ad0 ad0Var3 = (ad0) q10Var.e;
        boolean b11 = b10 | ad0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((ad0Var.b(bitmap6) | b11) || q10Var.a != 1) {
                q10Var.a = 1;
                paint.setShader(new ComposeShader(ad0Var2.d, new ComposeShader(ad0Var.d, ad0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ptVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | ptVar.a(-16777216)) || q10Var.a != 2) {
            q10Var.a = 2;
            paint.setShader(new ComposeShader((zf.i) ptVar.b, new ComposeShader(new ComposeShader(ad0Var2.d, ad0Var3.d, PorterDuff.Mode.DST_IN), (zf.i) ptVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
