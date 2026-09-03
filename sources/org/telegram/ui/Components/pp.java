package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pp {
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

    public pp() {
        for (int i10 = 0; i10 < this.f; i10++) {
            this.j[i10] = (this.i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        pp ppVar = this;
        float f12 = ppVar.g;
        float f13 = (f12 - 0.0f) - 0.0f;
        float f14 = f12 + 0.0f + 0.0f;
        float max = Math.max(f13, f14);
        float f15 = ppVar.e;
        float f16 = max * f15 * ppVar.h;
        Path path = ppVar.a;
        path.reset();
        int i10 = 0;
        while (true) {
            int i11 = ppVar.f;
            if (i10 >= i11) {
                canvas.save();
                canvas.rotate(0.0f, f10, f11);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = ppVar.d;
            matrix.reset();
            float f17 = 360.0f / i11;
            matrix.setRotate(i10 * f17, f10, f11);
            float f18 = i10 % 2 == 0 ? f13 : f14;
            float f19 = ppVar.k;
            float[] fArr = ppVar.j;
            float f20 = (fArr[i10] * f19) + f18;
            float[] fArr2 = ppVar.b;
            fArr2[0] = f10;
            float f21 = f11 - f20;
            fArr2[1] = f21;
            float f22 = f14;
            fArr2[2] = e2.c.u(f19, fArr[i10], f15, f10 + f16);
            fArr2[3] = f21;
            matrix.mapPoints(fArr2);
            int i12 = i10 + 1;
            int i13 = i12 >= i11 ? 0 : i12;
            float f23 = i13 % 2 == 0 ? f13 : f22;
            float f24 = ppVar.k;
            float f25 = (fArr[i13] * f24) + f23;
            float[] fArr3 = ppVar.c;
            fArr3[0] = f10;
            float f26 = f11 - f25;
            fArr3[1] = f26;
            float f27 = f13;
            fArr3[2] = e2.c.u(f24, fArr[i13], f15, f10 - f16);
            fArr3[3] = f26;
            matrix.reset();
            matrix.setRotate(f17 * i13, f10, f11);
            matrix.mapPoints(fArr3);
            if (i10 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i10 = i12;
            f14 = f22;
            f13 = f27;
            ppVar = this;
        }
    }
}
