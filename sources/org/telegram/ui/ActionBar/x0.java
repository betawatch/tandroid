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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = c1Var.B;
                c1Var.Q = false;
                c1Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                c1Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = c1Var.n;
                if (matrix == null) {
                    c1Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                c1Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = c1Var.n;
                int[] iArr = c1Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                c1Var.h.setLocalMatrix(c1Var.n);
                paint.setShader(c1Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                c1Var.invalidate();
                break;
            default:
                b2 b2Var = (b2) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (b2Var.B0 == null) {
                        b2Var.B0 = new Paint(1);
                    }
                    b2Var.y0 = bitmap2;
                    Bitmap bitmap3 = b2Var.y0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    b2Var.A0 = bitmapShader;
                    b2Var.B0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    b2Var.z0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = b2Var.z0;
                    int[] iArr2 = b2Var.t0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    b2Var.A0.setLocalMatrix(b2Var.z0);
                    b2Var.W0.invalidate();
                    break;
                } else {
                    b2Var.getClass();
                    break;
                }
        }
    }
}
