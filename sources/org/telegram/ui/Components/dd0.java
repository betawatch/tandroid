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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class dd0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final bd0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final androidx.biometric.e a = new androidx.biometric.e(new e2(24));
    public final a5.a b = new a5.a(14, (byte) 0);
    public final q10 c = new q10(1);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public dd0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new bd0();
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
        cd0 cd0Var = (cd0) q10Var.c;
        cd0Var.b.set(matrix);
        BitmapShader bitmapShader = cd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        cd0 cd0Var2 = (cd0) q10Var.d;
        cd0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = cd0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        bd0 bd0Var = this.d;
        if (bd0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = bd0Var.g;
        a(matrix, fArr);
        bd0Var.e.a(fArr);
        bd0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        q10 q10Var = this.c;
        float[] fArr = (float[]) q10Var.h;
        a(matrix, fArr);
        cd0 cd0Var = (cd0) q10Var.e;
        cd0Var.b.set(matrix);
        BitmapShader bitmapShader = cd0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        cd0Var.a(b(fArr[0]) && b(fArr[1]));
        bd0 bd0Var = this.d;
        if (bd0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = bd0Var.g;
        a(matrix, fArr2);
        cd0 cd0Var2 = bd0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        cd0Var2.a(z10);
        bd0Var.e.b(fArr2);
        bd0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.m(bitmap2);
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
        bd0 bd0Var = this.d;
        if (bd0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return bd0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        q10 q10Var = this.c;
        pt ptVar = (pt) q10Var.f;
        pt ptVar2 = (pt) q10Var.g;
        cd0 cd0Var = (cd0) q10Var.d;
        Paint paint = (Paint) q10Var.b;
        cd0 cd0Var2 = (cd0) q10Var.c;
        boolean b10 = cd0Var2.b(bitmap);
        cd0 cd0Var3 = (cd0) q10Var.e;
        boolean b11 = b10 | cd0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((cd0Var.b(bitmap6) | b11) || q10Var.a != 1) {
                q10Var.a = 1;
                paint.setShader(new ComposeShader(cd0Var2.d, new ComposeShader(cd0Var.d, cd0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ptVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | ptVar.a(-16777216)) || q10Var.a != 2) {
            q10Var.a = 2;
            paint.setShader(new ComposeShader((zf.i) ptVar.b, new ComposeShader(new ComposeShader(cd0Var2.d, cd0Var3.d, PorterDuff.Mode.DST_IN), (zf.i) ptVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
