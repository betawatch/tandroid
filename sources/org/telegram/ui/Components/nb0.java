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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nb0 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final lb0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final q5.d a = new q5.d(new au(2));
    public final a5.a b = new a5.a(15, (byte) 0);
    public final org.telegram.messenger.k9 c = new org.telegram.messenger.k9(2);
    public final Matrix i = new Matrix();
    public final RectF j = new RectF();

    public nb0() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new lb0();
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
        org.telegram.messenger.k9 k9Var = this.c;
        mb0 mb0Var = (mb0) k9Var.d;
        mb0Var.b.set(matrix);
        BitmapShader bitmapShader = mb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        mb0 mb0Var2 = (mb0) k9Var.e;
        mb0Var2.b.set(matrix);
        BitmapShader bitmapShader2 = mb0Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        lb0 lb0Var = this.d;
        if (lb0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = lb0Var.g;
        a(matrix, fArr);
        lb0Var.e.a(fArr);
        lb0Var.f.a(fArr);
    }

    public final void d(Matrix matrix) {
        org.telegram.messenger.k9 k9Var = this.c;
        float[] fArr = (float[]) k9Var.b;
        a(matrix, fArr);
        mb0 mb0Var = (mb0) k9Var.f;
        mb0Var.b.set(matrix);
        BitmapShader bitmapShader = mb0Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z10 = false;
        mb0Var.a(b(fArr[0]) && b(fArr[1]));
        lb0 lb0Var = this.d;
        if (lb0Var == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr2 = lb0Var.g;
        a(matrix, fArr2);
        mb0 mb0Var2 = lb0Var.d;
        if (b(fArr2[0]) && b(fArr2[1])) {
            z10 = true;
        }
        mb0Var2.a(z10);
        lb0Var.e.b(fArr2);
        lb0Var.f.b(fArr2);
    }

    public final Paint e(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.k(bitmap2);
        if (i12 >= 0) {
            int o10 = i0.b.o(i10, ((Color.alpha(i10) * i11) * i12) / 25500);
            a5.a aVar = this.b;
            yg.a aVar2 = (yg.a) aVar.c;
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
        lb0 lb0Var = this.d;
        if (lb0Var != null && z10 && Build.VERSION.SDK_INT >= 33) {
            return lb0Var.a(bitmap, bitmap4, bitmap6, i11, i12);
        }
        org.telegram.messenger.k9 k9Var = this.c;
        tm tmVar = (tm) k9Var.g;
        tm tmVar2 = (tm) k9Var.h;
        mb0 mb0Var = (mb0) k9Var.e;
        Paint paint = (Paint) k9Var.c;
        mb0 mb0Var2 = (mb0) k9Var.d;
        boolean b10 = mb0Var2.b(bitmap);
        mb0 mb0Var3 = (mb0) k9Var.f;
        boolean b11 = b10 | mb0Var3.b(bitmap4);
        if (i12 >= 0) {
            if ((mb0Var.b(bitmap6) | b11) || k9Var.a != 1) {
                k9Var.a = 1;
                paint.setShader(new ComposeShader(mb0Var2.d, new ComposeShader(mb0Var.d, mb0Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((tmVar2.R(i0.b.o(-1, ((-i12) * i11) / 100)) | b11 | tmVar.R(-16777216)) || k9Var.a != 2) {
            k9Var.a = 2;
            paint.setShader(new ComposeShader((rf.h) tmVar.b, new ComposeShader(new ComposeShader(mb0Var2.d, mb0Var3.d, PorterDuff.Mode.DST_IN), (rf.h) tmVar2.b, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
