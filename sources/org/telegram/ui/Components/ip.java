package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ip {
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

    public ip() {
        for (int i9 = 0; i9 < this.f; i9++) {
            this.j[i9] = (this.i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        ip ipVar = this;
        float f12 = ipVar.g;
        float f13 = (f12 - 0.0f) - 0.0f;
        float f14 = f12 + 0.0f + 0.0f;
        float max = Math.max(f13, f14);
        float f15 = ipVar.e;
        float f16 = max * f15 * ipVar.h;
        Path path = ipVar.a;
        path.reset();
        int i9 = 0;
        while (true) {
            int i10 = ipVar.f;
            if (i9 >= i10) {
                canvas.save();
                canvas.rotate(0.0f, f10, f11);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = ipVar.d;
            matrix.reset();
            float f17 = 360.0f / i10;
            matrix.setRotate(i9 * f17, f10, f11);
            float f18 = i9 % 2 == 0 ? f13 : f14;
            float f19 = ipVar.k;
            float[] fArr = ipVar.j;
            float f20 = (fArr[i9] * f19) + f18;
            float[] fArr2 = ipVar.b;
            fArr2[0] = f10;
            float f21 = f11 - f20;
            fArr2[1] = f21;
            float f22 = f14;
            fArr2[2] = e2.c.x(f19, fArr[i9], f15, f10 + f16);
            fArr2[3] = f21;
            matrix.mapPoints(fArr2);
            int i11 = i9 + 1;
            int i12 = i11 >= i10 ? 0 : i11;
            float f23 = i12 % 2 == 0 ? f13 : f22;
            float f24 = ipVar.k;
            float f25 = (fArr[i12] * f24) + f23;
            float[] fArr3 = ipVar.c;
            fArr3[0] = f10;
            float f26 = f11 - f25;
            fArr3[1] = f26;
            float f27 = f13;
            fArr3[2] = e2.c.x(f24, fArr[i12], f15, f10 - f16);
            fArr3[3] = f26;
            matrix.reset();
            matrix.setRotate(f17 * i12, f10, f11);
            matrix.mapPoints(fArr3);
            if (i9 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i9 = i11;
            f14 = f22;
            f13 = f27;
            ipVar = this;
        }
    }
}
