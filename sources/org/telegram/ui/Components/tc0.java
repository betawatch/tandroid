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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class tc0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final rc0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final aa.a a = new aa.a(new ru(3));
    public final a5.a b = new a5.a(13, (byte) 0);
    public final l10 c = new l10();
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public tc0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new rc0();
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
        l10 l10Var = this.c;
        sc0 sc0Var = (sc0) l10Var.c;
        sc0Var.b.set(matrix);
        BitmapShader bitmapShader = sc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        sc0 sc0Var2 = (sc0) l10Var.d;
        sc0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = sc0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        rc0 rc0Var = this.d;
        if (rc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = rc0Var.g;
        a(matrix, fArr);
        rc0Var.e.a(fArr);
        rc0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        l10 l10Var = this.c;
        float[] fArr = (float[]) l10Var.h;
        a(matrix, fArr);
        sc0 sc0Var = (sc0) l10Var.e;
        sc0Var.b.set(matrix);
        BitmapShader bitmapShader = sc0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        sc0Var.a(b(fArr[0]) && b(fArr[1]));
        rc0 rc0Var = this.d;
        if (rc0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = rc0Var.g;
        a(matrix, fArr2);
        sc0 sc0Var2 = rc0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        sc0Var2.a(z10);
        rc0Var.e.b(fArr2);
        rc0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.l(bitmap2);
        if (i12 >= 0) {
            int k10 = i0.a.k(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.b;
            gh.a aVar2 = (gh.a) aVar.c;
            if (aVar2.a(bitmap) || k10 != aVar.b || ((Bitmap) aVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) aVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) aVar.d).getHeight() != bitmap.getHeight()) {
                    aVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) aVar.d, k10);
                aVar2.b(bitmap);
                aVar.b = k10;
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
        rc0 rc0Var = this.d;
        if (rc0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return rc0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        l10 l10Var = this.c;
        kt ktVar = (kt) l10Var.f;
        kt ktVar2 = (kt) l10Var.g;
        sc0 sc0Var = (sc0) l10Var.d;
        Paint paint = (Paint) l10Var.b;
        sc0 sc0Var2 = (sc0) l10Var.c;
        boolean b10 = sc0Var2.b(bitmap);
        sc0 sc0Var3 = (sc0) l10Var.e;
        boolean b11 = b10 | sc0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((sc0Var.b(bitmap6) | b11) || l10Var.a != 1) {
                l10Var.a = 1;
                paint.setShader(new ComposeShader(sc0Var2.d, new ComposeShader(sc0Var.d, sc0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((ktVar2.a(i0.a.k(-1, ((-i12) * i11) / 100)) | b11 | ktVar.a(-16777216)) || l10Var.a != 2) {
            l10Var.a = 2;
            paint.setShader(new ComposeShader((yf.i) ktVar.b, new ComposeShader(new ComposeShader(sc0Var2.d, sc0Var3.d, PorterDuff.Mode.DST_IN), (yf.i) ktVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
