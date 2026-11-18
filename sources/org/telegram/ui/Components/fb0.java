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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fb0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final db0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final h6.m a = new h6.m(new k2(24));
    public final a8.xa b = new a8.xa(17, (byte) 0);
    public final ci.b1 c = new ci.b1(3);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public fb0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new db0();
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
        ci.b1 b1Var = this.c;
        eb0 eb0Var = (eb0) b1Var.c;
        eb0Var.b.set(matrix);
        BitmapShader bitmapShader = eb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        eb0 eb0Var2 = (eb0) b1Var.d;
        eb0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = eb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        db0 db0Var = this.d;
        if (db0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = db0Var.g;
        a(matrix, fArr);
        db0Var.e.a(fArr);
        db0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        ci.b1 b1Var = this.c;
        float[] fArr = (float[]) b1Var.h;
        a(matrix, fArr);
        eb0 eb0Var = (eb0) b1Var.e;
        eb0Var.b.set(matrix);
        BitmapShader bitmapShader = eb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        eb0Var.a(b(fArr[0]) && b(fArr[1]));
        db0 db0Var = this.d;
        if (db0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = db0Var.g;
        a(matrix, fArr2);
        eb0 eb0Var2 = db0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        eb0Var2.a(z10);
        db0Var.e.b(fArr2);
        db0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.r(bitmap2);
        if (i11 >= 0) {
            int o4 = i0.a.o(i7, ((Color.alpha(i7) * i10) * i11) / 25500);
            a8.xa xaVar = this.b;
            ih.a aVar = (ih.a) xaVar.c;
            if (aVar.a(bitmap) || o4 != xaVar.b || ((Bitmap) xaVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) xaVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) xaVar.d).getHeight() != bitmap.getHeight()) {
                    xaVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) xaVar.d, o4);
                aVar.b(bitmap);
                xaVar.b = o4;
            }
            bitmap3 = (Bitmap) xaVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        db0 db0Var = this.d;
        if (db0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return db0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        ci.b1 b1Var = this.c;
        an anVar = (an) b1Var.f;
        an anVar2 = (an) b1Var.g;
        eb0 eb0Var = (eb0) b1Var.d;
        Paint paint = (Paint) b1Var.b;
        eb0 eb0Var2 = (eb0) b1Var.c;
        boolean b10 = eb0Var2.b(bitmap);
        eb0 eb0Var3 = (eb0) b1Var.e;
        boolean b11 = b10 | eb0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((eb0Var.b(bitmap6) | b11) || b1Var.a != 1) {
                b1Var.a = 1;
                paint.setShader(new ComposeShader(eb0Var2.d, new ComposeShader(eb0Var.d, eb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((anVar2.R(i0.a.o(-1, ((-i11) * i10) / 100)) | b11 | anVar.R(-16777216)) || b1Var.a != 2) {
            b1Var.a = 2;
            paint.setShader(new ComposeShader((bg.l) anVar.b, new ComposeShader(new ComposeShader(eb0Var2.d, eb0Var3.d, PorterDuff.Mode.DST_IN), (bg.l) anVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
