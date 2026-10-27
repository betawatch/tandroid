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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ad0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final yc0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final a8.h0 a = new a8.h0(new f2(27));
    public final a8.ng b = new a8.ng(16, (byte) 0);
    public final ai.v1 c = new ai.v1(2);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public ad0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new yc0();
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
        ai.v1 v1Var = this.c;
        zc0 zc0Var = (zc0) v1Var.e;
        zc0Var.b.set(matrix);
        BitmapShader bitmapShader = zc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        zc0 zc0Var2 = (zc0) v1Var.f;
        zc0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = zc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        yc0 yc0Var = this.d;
        if (yc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = yc0Var.g;
        a(matrix, fArr);
        yc0Var.e.a(fArr);
        yc0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        ai.v1 v1Var = this.c;
        float[] fArr = (float[]) v1Var.h;
        a(matrix, fArr);
        zc0 zc0Var = (zc0) v1Var.g;
        zc0Var.b.set(matrix);
        BitmapShader bitmapShader = zc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        zc0Var.a(b(fArr[0]) && b(fArr[1]));
        yc0 yc0Var = this.d;
        if (yc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = yc0Var.g;
        a(matrix, fArr2);
        zc0 zc0Var2 = yc0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        zc0Var2.a(z10);
        yc0Var.e.b(fArr2);
        yc0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.o(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.a.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a8.ng ngVar = this.b;
            ih.a aVar = (ih.a) ngVar.c;
            if (aVar.a(bitmap) || o10 != ngVar.b || ((Bitmap) ngVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) ngVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) ngVar.d).getHeight() != bitmap.getHeight()) {
                    ngVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) ngVar.d, o10);
                aVar.b(bitmap);
                ngVar.b = o10;
            }
            bitmap3 = (Bitmap) ngVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        yc0 yc0Var = this.d;
        if (yc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return yc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        ai.v1 v1Var = this.c;
        rt rtVar = (rt) v1Var.a;
        rt rtVar2 = (rt) v1Var.b;
        zc0 zc0Var = (zc0) v1Var.f;
        Paint paint = (Paint) v1Var.d;
        zc0 zc0Var2 = (zc0) v1Var.e;
        boolean b10 = zc0Var2.b(bitmap);
        zc0 zc0Var3 = (zc0) v1Var.g;
        boolean b11 = b10 | zc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((zc0Var.b(bitmap6) | b11) || v1Var.c != 1) {
                v1Var.c = 1;
                paint.setShader(new ComposeShader(zc0Var2.d, new ComposeShader(zc0Var.d, zc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((rtVar2.a(i0.a.o(-1, ((-i12) * i11) / 100)) | b11 | rtVar.a(-16777216)) || v1Var.c != 2) {
            v1Var.c = 2;
            paint.setShader(new ComposeShader((ag.o) rtVar.b, new ComposeShader(new ComposeShader(zc0Var2.d, zc0Var3.d, PorterDuff.Mode.DST_IN), (ag.o) rtVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
