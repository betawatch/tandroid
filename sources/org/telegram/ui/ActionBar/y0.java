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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                d1Var.U = false;
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
                d2 d2Var = (d2) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (d2Var.F0 == null) {
                        d2Var.F0 = new Paint(1);
                    }
                    d2Var.C0 = bitmap2;
                    Bitmap bitmap3 = d2Var.C0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    d2Var.E0 = bitmapShader;
                    d2Var.F0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    d2Var.D0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = d2Var.D0;
                    int[] iArr2 = d2Var.x0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    d2Var.E0.setLocalMatrix(d2Var.D0);
                    d2Var.a1.invalidate();
                    break;
                } else {
                    d2Var.getClass();
                    break;
                }
        }
    }
}
