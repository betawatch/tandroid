// default package

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class nj8 {
    public final ylb a;
    public LinearGradient d;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public boolean m;
    public boolean n;
    public float b = 0.5f;
    public float c = 0.5f;
    public final Matrix e = new Matrix();
    public final Paint f = new Paint(1);
    public final int[] l = new int[5];
    public float o = 1.0f;
    public float p = 1.5f;
    public float q = 0.0f;
    public final int k = -1;

    public nj8(int i, int i2, int i3, int i4, ylb ylbVar) {
        this.a = ylbVar;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    public final void a() {
        LinearGradient linearGradient;
        int b = b(this.g);
        int b2 = b(this.h);
        int i = this.i;
        int b3 = i < 0 ? 0 : b(i);
        int i2 = this.j;
        int b4 = i2 < 0 ? 0 : b(i2);
        int i3 = this.k;
        int b5 = i3 < 0 ? 0 : b(i3);
        LinearGradient linearGradient2 = this.d;
        int[] iArr = this.l;
        if (linearGradient2 != null && iArr[0] == b && iArr[1] == b2 && iArr[2] == b3 && iArr[3] == b4 && iArr[4] == b5) {
            return;
        }
        iArr[0] = b;
        iArr[1] = b2;
        iArr[2] = b3;
        iArr[3] = b4;
        iArr[4] = b5;
        if (b3 == 0) {
            linearGradient = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.d = linearGradient;
        } else if (b4 == 0) {
            LinearGradient linearGradient3 = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            this.d = linearGradient3;
            linearGradient = linearGradient3;
        } else if (b5 == 0) {
            LinearGradient linearGradient4 = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
            this.d = linearGradient4;
            linearGradient = linearGradient4;
        } else {
            LinearGradient linearGradient5 = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
            this.d = linearGradient5;
            linearGradient = linearGradient5;
        }
        linearGradient.setLocalMatrix(this.e);
        this.f.setShader(this.d);
    }

    public final int b(int i) {
        int c = c(i);
        if (!this.n) {
            return c;
        }
        return Color.argb(Color.alpha(c), Color.red(c) - 15, Color.green(c) - 15, Color.blue(c) - 15);
    }

    public int c(int i) {
        return cmb.v0(i, this.a);
    }

    public final void d(int i, float f, int i2, int i3, float f2, int i4) {
        a();
        boolean z = this.m;
        Matrix matrix = this.e;
        int i5 = i4 - i2;
        if (z) {
            matrix.reset();
            matrix.postScale((i3 - i) / 100.0f, i5 / 100.0f, this.b * 100.0f, this.c * 100.0f);
            matrix.postTranslate(f, f2);
            this.d.setLocalMatrix(matrix);
            return;
        }
        a();
        matrix.reset();
        matrix.postScale((i3 - i) / 100.0f, (i5 << 1) / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f, (-r9) + f2);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
