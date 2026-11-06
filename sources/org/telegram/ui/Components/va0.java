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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class va0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final ta0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final h6.m a = new h6.m(new k2(19));
    public final a8.wa b = new a8.wa(17, (byte) 0);
    public final ai.n1 c = new ai.n1(3);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public va0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new ta0();
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
        ai.n1 n1Var = this.c;
        ua0 ua0Var = (ua0) n1Var.c;
        ua0Var.b.set(matrix);
        BitmapShader bitmapShader = ua0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        ua0 ua0Var2 = (ua0) n1Var.d;
        ua0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = ua0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        ta0 ta0Var = this.d;
        if (ta0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = ta0Var.g;
        a(matrix, fArr);
        ta0Var.e.a(fArr);
        ta0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        ai.n1 n1Var = this.c;
        float[] fArr = (float[]) n1Var.h;
        a(matrix, fArr);
        ua0 ua0Var = (ua0) n1Var.e;
        ua0Var.b.set(matrix);
        BitmapShader bitmapShader = ua0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z9 = false;
        ua0Var.a(b(fArr[0]) && b(fArr[1]));
        ta0 ta0Var = this.d;
        if (ta0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = ta0Var.g;
        a(matrix, fArr2);
        ua0 ua0Var2 = ta0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z9 = true;
        }
        ua0Var2.a(z9);
        ta0Var.e.b(fArr2);
        ta0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11, boolean z9) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.n(bitmap2);
        if (i11 >= 0) {
            int o4 = i0.a.o(i7, ((Color.alpha(i7) * i10) * i11) / 25500);
            a8.wa waVar = this.b;
            ih.a aVar = (ih.a) waVar.c;
            if (aVar.a(bitmap) || o4 != waVar.b || ((Bitmap) waVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) waVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) waVar.d).getHeight() != bitmap.getHeight()) {
                    waVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) waVar.d, o4);
                aVar.b(bitmap);
                waVar.b = o4;
            }
            bitmap3 = (Bitmap) waVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        ta0 ta0Var = this.d;
        if (ta0Var != null && z9 && Build.VERSION.SDK_INT >= 33) {
            return ta0Var.a(bitmap, bitmap4, bitmap6, i10, i11);
        }
        ai.n1 n1Var = this.c;
        lm lmVar = (lm) n1Var.f;
        lm lmVar2 = (lm) n1Var.g;
        ua0 ua0Var = (ua0) n1Var.d;
        Paint paint = (Paint) n1Var.b;
        ua0 ua0Var2 = (ua0) n1Var.c;
        boolean b10 = ua0Var2.b(bitmap);
        ua0 ua0Var3 = (ua0) n1Var.e;
        boolean b11 = b10 | ua0Var3.b(bitmap4);
        if (i11 >= 0) {
            if ((ua0Var.b(bitmap6) | b11) || n1Var.a != 1) {
                n1Var.a = 1;
                paint.setShader(new ComposeShader(ua0Var2.d, new ComposeShader(ua0Var.d, ua0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((lmVar2.R(i0.a.o(-1, ((-i11) * i10) / 100)) | b11 | lmVar.R(-16777216)) || n1Var.a != 2) {
            n1Var.a = 2;
            paint.setShader(new ComposeShader((bg.l) lmVar.b, new ComposeShader(new ComposeShader(ua0Var2.d, ua0Var3.d, PorterDuff.Mode.DST_IN), (bg.l) lmVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
