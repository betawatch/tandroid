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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ob0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final mb0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final j4.c a = new j4.c(new g2(18));
    public final a6.a b = new a6.a(18, (byte) 0);
    public final t00 c = new t00();
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public ob0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new mb0();
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
        t00 t00Var = this.c;
        nb0 nb0Var = (nb0) t00Var.c;
        nb0Var.b.set(matrix);
        BitmapShader bitmapShader = nb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        nb0 nb0Var2 = (nb0) t00Var.d;
        nb0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = nb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        mb0 mb0Var = this.d;
        if (mb0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = mb0Var.g;
        a(matrix, fArr);
        mb0Var.e.a(fArr);
        mb0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        t00 t00Var = this.c;
        float[] fArr = (float[]) t00Var.h;
        a(matrix, fArr);
        nb0 nb0Var = (nb0) t00Var.e;
        nb0Var.b.set(matrix);
        BitmapShader bitmapShader = nb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        nb0Var.a(b(fArr[0]) && b(fArr[1]));
        mb0 mb0Var = this.d;
        if (mb0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = mb0Var.g;
        a(matrix, fArr2);
        nb0 nb0Var2 = mb0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        nb0Var2.a(z10);
        mb0Var.e.b(fArr2);
        mb0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i9, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.r(bitmap2);
        if (i11 >= 0) {
            int k10 = i0.a.k(i9, ((Color.alpha(i9) * i10) * i11) / 25500);
            a6.a aVar = this.b;
            og.a aVar2 = (og.a) aVar.b;
            if (aVar2.a(bitmap) || k10 != aVar.c || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.c = k10;
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
        mb0 mb0Var = this.d;
        if (mb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return mb0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        t00 t00Var = this.c;
        us usVar = (us) t00Var.f;
        us usVar2 = (us) t00Var.g;
        nb0 nb0Var = (nb0) t00Var.d;
        Paint paint = (Paint) t00Var.b;
        nb0 nb0Var2 = (nb0) t00Var.c;
        boolean b10 = nb0Var2.b(bitmap);
        nb0 nb0Var3 = (nb0) t00Var.e;
        boolean b11 = b10 | nb0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((nb0Var.b(bitmap6) | b11) || t00Var.a != 1) {
                t00Var.a = 1;
                paint.setShader(new ComposeShader(nb0Var2.d, new ComposeShader(nb0Var.d, nb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((usVar2.a(i0.a.k(-1, ((-i11) * i10) / 100)) | b11 | usVar.a(-16777216)) || t00Var.a != 2) {
            t00Var.a = 2;
            paint.setShader(new ComposeShader((ff.l) usVar.b, new ComposeShader(new ComposeShader(nb0Var2.d, nb0Var3.d, PorterDuff.Mode.DST_IN), (ff.l) usVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
