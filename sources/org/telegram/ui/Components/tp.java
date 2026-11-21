package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class tp {
    public float g;
    public float k;
    public final Path a = new Path();
    public final float[] b = new float[4];
    public final float[] c = new float[4];
    public final Matrix d = new Matrix();
    public final float h = 1.0f;
    public final Random i = new Random();
    public final int f = 6;
    public final float e = (float) (Math.tan(3.141592653589793d / 12) * 1.3333333333333333d);
    public final float[] j = new float[6];

    public tp() {
        for (int i7 = 0; i7 < this.f; i7++) {
            this.j[i7] = (this.i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        tp tpVar = this;
        float f12 = tpVar.g;
        float f13 = (f12 - 0.0f) - 0.0f;
        float f14 = f12 + 0.0f + 0.0f;
        float max = Math.max(f13, f14);
        float f15 = tpVar.e;
        float f16 = max * f15 * tpVar.h;
        Path path = tpVar.a;
        path.reset();
        int i7 = 0;
        while (true) {
            int i10 = tpVar.f;
            if (i7 >= i10) {
                canvas.save();
                canvas.rotate(0.0f, f10, f11);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = tpVar.d;
            matrix.reset();
            float f17 = 360.0f / i10;
            matrix.setRotate(i7 * f17, f10, f11);
            float f18 = i7 % 2 == 0 ? f13 : f14;
            float f19 = tpVar.k;
            float[] fArr = tpVar.j;
            float f20 = (fArr[i7] * f19) + f18;
            float[] fArr2 = tpVar.b;
            fArr2[0] = f10;
            float f21 = f11 - f20;
            fArr2[1] = f21;
            float f22 = f14;
            fArr2[2] = com.google.android.gms.internal.vision.e2.x(f19, fArr[i7], f15, f10 + f16);
            fArr2[3] = f21;
            matrix.mapPoints(fArr2);
            int i11 = i7 + 1;
            int i12 = i11 >= i10 ? 0 : i11;
            float f23 = i12 % 2 == 0 ? f13 : f22;
            float f24 = tpVar.k;
            float f25 = (fArr[i12] * f24) + f23;
            float[] fArr3 = tpVar.c;
            fArr3[0] = f10;
            float f26 = f11 - f25;
            fArr3[1] = f26;
            float f27 = f13;
            fArr3[2] = com.google.android.gms.internal.vision.e2.x(f24, fArr[i12], f15, f10 - f16);
            fArr3[3] = f26;
            matrix.reset();
            matrix.setRotate(f17 * i12, f10, f11);
            matrix.mapPoints(fArr3);
            if (i7 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i7 = i11;
            f14 = f22;
            f13 = f27;
            tpVar = this;
        }
    }
}
