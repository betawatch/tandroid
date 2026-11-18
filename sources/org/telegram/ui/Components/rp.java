package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rp {
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

    public rp() {
        for (int i7 = 0; i7 < this.f; i7++) {
            this.j[i7] = (this.i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        rp rpVar = this;
        float f12 = rpVar.g;
        float f13 = (f12 - 0.0f) - 0.0f;
        float f14 = f12 + 0.0f + 0.0f;
        float max = Math.max(f13, f14);
        float f15 = rpVar.e;
        float f16 = max * f15 * rpVar.h;
        Path path = rpVar.a;
        path.reset();
        int i7 = 0;
        while (true) {
            int i10 = rpVar.f;
            if (i7 >= i10) {
                canvas.save();
                canvas.rotate(0.0f, f10, f11);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = rpVar.d;
            matrix.reset();
            float f17 = 360.0f / i10;
            matrix.setRotate(i7 * f17, f10, f11);
            float f18 = i7 % 2 == 0 ? f13 : f14;
            float f19 = rpVar.k;
            float[] fArr = rpVar.j;
            float f20 = (fArr[i7] * f19) + f18;
            float[] fArr2 = rpVar.b;
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
            float f24 = rpVar.k;
            float f25 = (fArr[i12] * f24) + f23;
            float[] fArr3 = rpVar.c;
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
            rpVar = this;
        }
    }
}
