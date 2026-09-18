package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class sp {
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

    public sp() {
        for (int i10 = 0; i10 < this.f; i10++) {
            this.j[i10] = (this.i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        sp spVar = this;
        float f11 = spVar.g;
        float f12 = (f11 - 0.0f) - 0.0f;
        float f13 = f11 + 0.0f + 0.0f;
        float max = Math.max(f12, f13);
        float f14 = spVar.e;
        float f15 = max * f14 * spVar.h;
        Path path = spVar.a;
        path.reset();
        int i10 = 0;
        while (true) {
            int i11 = spVar.f;
            if (i10 >= i11) {
                canvas.save();
                canvas.rotate(0.0f, f7, f10);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = spVar.d;
            matrix.reset();
            float f16 = 360.0f / i11;
            matrix.setRotate(i10 * f16, f7, f10);
            float f17 = i10 % 2 == 0 ? f12 : f13;
            float f18 = spVar.k;
            float[] fArr = spVar.j;
            float f19 = (fArr[i10] * f18) + f17;
            float[] fArr2 = spVar.b;
            fArr2[0] = f7;
            float f20 = f10 - f19;
            fArr2[1] = f20;
            float f21 = f13;
            fArr2[2] = com.google.android.gms.internal.vision.e2.x(f18, fArr[i10], f14, f7 + f15);
            fArr2[3] = f20;
            matrix.mapPoints(fArr2);
            int i12 = i10 + 1;
            int i13 = i12 >= i11 ? 0 : i12;
            float f22 = i13 % 2 == 0 ? f12 : f21;
            float f23 = spVar.k;
            float f24 = (fArr[i13] * f23) + f22;
            float[] fArr3 = spVar.c;
            fArr3[0] = f7;
            float f25 = f10 - f24;
            fArr3[1] = f25;
            float f26 = f12;
            fArr3[2] = com.google.android.gms.internal.vision.e2.x(f23, fArr[i13], f14, f7 - f15);
            fArr3[3] = f25;
            matrix.reset();
            matrix.setRotate(f16 * i13, f7, f10);
            matrix.mapPoints(fArr3);
            if (i10 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i10 = i12;
            f13 = f21;
            f12 = f26;
            spVar = this;
        }
    }
}
