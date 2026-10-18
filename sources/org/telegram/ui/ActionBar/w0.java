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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                b1Var.U = false;
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
                b2 b2Var = (b2) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (b2Var.F0 == null) {
                        b2Var.F0 = new Paint(1);
                    }
                    b2Var.C0 = bitmap2;
                    Bitmap bitmap3 = b2Var.C0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    b2Var.E0 = bitmapShader;
                    b2Var.F0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    b2Var.D0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = b2Var.D0;
                    int[] iArr2 = b2Var.x0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    b2Var.E0.setLocalMatrix(b2Var.D0);
                    b2Var.a1.invalidate();
                    break;
                } else {
                    b2Var.getClass();
                    break;
                }
        }
    }
}
