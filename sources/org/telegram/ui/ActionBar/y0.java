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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = d1Var.F;
                d1Var.W = false;
                d1Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                d1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = d1Var.n;
                if (matrix == null) {
                    d1Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                d1Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = d1Var.n;
                int[] iArr = d1Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                d1Var.h.setLocalMatrix(d1Var.n);
                paint.setShader(d1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d1Var.invalidate();
                break;
            default:
                e2 e2Var = (e2) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (e2Var.H0 == null) {
                        e2Var.H0 = new Paint(1);
                    }
                    e2Var.E0 = bitmap2;
                    Bitmap bitmap3 = e2Var.E0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    e2Var.G0 = bitmapShader;
                    e2Var.H0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    e2Var.F0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = e2Var.F0;
                    int[] iArr2 = e2Var.z0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    e2Var.G0.setLocalMatrix(e2Var.F0);
                    e2Var.c1.invalidate();
                    break;
                } else {
                    e2Var.getClass();
                    break;
                }
        }
    }
}
