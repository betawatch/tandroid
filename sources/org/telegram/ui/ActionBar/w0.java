package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = b1Var.F;
                b1Var.W = false;
                b1Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                b1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = b1Var.n;
                if (matrix == null) {
                    b1Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                b1Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = b1Var.n;
                int[] iArr = b1Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                b1Var.h.setLocalMatrix(b1Var.n);
                paint.setShader(b1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                b1Var.invalidate();
                break;
            default:
                c2 c2Var = (c2) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (c2Var.H0 == null) {
                        c2Var.H0 = new Paint(1);
                    }
                    c2Var.E0 = bitmap2;
                    Bitmap bitmap3 = c2Var.E0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    c2Var.G0 = bitmapShader;
                    c2Var.H0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    c2Var.F0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = c2Var.F0;
                    int[] iArr2 = c2Var.z0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    c2Var.G0.setLocalMatrix(c2Var.F0);
                    c2Var.c1.invalidate();
                    break;
                } else {
                    c2Var.getClass();
                    break;
                }
        }
    }
}
