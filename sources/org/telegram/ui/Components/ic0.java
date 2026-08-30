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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ic0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final gc0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final s5.m a = new s5.m(new k2(17));
    public final b4.e0 b = new b4.e0(17, (byte) 0);
    public final i10 c = new i10();
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public ic0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new gc0();
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
        i10 i10Var = this.c;
        hc0 hc0Var = (hc0) i10Var.c;
        hc0Var.b.set(matrix);
        BitmapShader bitmapShader = hc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        hc0 hc0Var2 = (hc0) i10Var.d;
        hc0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = hc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        gc0 gc0Var = this.d;
        if (gc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = gc0Var.g;
        a(matrix, fArr);
        gc0Var.e.a(fArr);
        gc0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        i10 i10Var = this.c;
        float[] fArr = (float[]) i10Var.h;
        a(matrix, fArr);
        hc0 hc0Var = (hc0) i10Var.e;
        hc0Var.b.set(matrix);
        BitmapShader bitmapShader = hc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z4 = false;
        hc0Var.a(b(fArr[0]) && b(fArr[1]));
        gc0 gc0Var = this.d;
        if (gc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = gc0Var.g;
        a(matrix, fArr2);
        hc0 hc0Var2 = gc0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z4 = true;
        }
        hc0Var2.a(z4);
        gc0Var.e.b(fArr2);
        gc0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z4) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.i(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            b4.e0 e0Var = this.b;
            tg.a aVar = (tg.a) e0Var.c;
            if (aVar.a(bitmap) || k10 != e0Var.b || ((Bitmap) e0Var.d) == null) {
                Bitmap bitmap5 = (Bitmap) e0Var.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) e0Var.d).getHeight() != bitmap.getHeight()) {
                    e0Var.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) e0Var.d, k10);
                aVar.b(bitmap);
                e0Var.b = k10;
            }
            bitmap3 = (Bitmap) e0Var.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        gc0 gc0Var = this.d;
        if (gc0Var != null && z4 && Build.VERSION.SDK_INT >= 33) {
            return gc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        i10 i10Var = this.c;
        dt dtVar = (dt) i10Var.f;
        dt dtVar2 = (dt) i10Var.g;
        hc0 hc0Var = (hc0) i10Var.d;
        Paint paint = (Paint) i10Var.b;
        hc0 hc0Var2 = (hc0) i10Var.c;
        boolean b10 = hc0Var2.b(bitmap);
        hc0 hc0Var3 = (hc0) i10Var.e;
        boolean b11 = b10 | hc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((hc0Var.b(bitmap6) | b11) || i10Var.a != 1) {
                i10Var.a = 1;
                paint.setShader(new ComposeShader(hc0Var2.d, new ComposeShader(hc0Var.d, hc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((dtVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | dtVar.a(-16777216)) || i10Var.a != 2) {
            i10Var.a = 2;
            paint.setShader(new ComposeShader((lf.k) dtVar.b, new ComposeShader(new ComposeShader(hc0Var2.d, hc0Var3.d, PorterDuff.Mode.DST_IN), (lf.k) dtVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
