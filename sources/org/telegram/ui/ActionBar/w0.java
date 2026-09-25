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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                a2 a2Var = (a2) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (a2Var.F0 == null) {
                        a2Var.F0 = new Paint(1);
                    }
                    a2Var.C0 = bitmap2;
                    Bitmap bitmap3 = a2Var.C0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    a2Var.E0 = bitmapShader;
                    a2Var.F0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    a2Var.D0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = a2Var.D0;
                    int[] iArr2 = a2Var.x0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    a2Var.E0.setLocalMatrix(a2Var.D0);
                    a2Var.a1.invalidate();
                    break;
                } else {
                    a2Var.getClass();
                    break;
                }
        }
    }
}
