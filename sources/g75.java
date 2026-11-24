// default package

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g75 {
    public float c;
    public float d;
    public float e;
    public float f;
    public Shader g;
    public final byte i;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public g75(int i) {
        this.i = i;
    }

    public final void a() {
        byte b = this.i;
        if (h75.h1(b)) {
            this.a = ls6.d(Utilities.b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.b = 1.0f;
        } else if (b == 1) {
            SecureRandom secureRandom = Utilities.b;
            this.a = ls6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.b = ls6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = b00.A(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i, int i2, int i3, long j, float f) {
        if (this.g == null) {
            return;
        }
        float f2 = this.e;
        if (f2 == 0.0f || this.f >= f2) {
            this.e = Utilities.b.nextInt(kk7.d3) + 1500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                a();
            }
            this.c = this.a;
            this.d = this.b;
            a();
        }
        float f3 = j;
        float f4 = 1.0f;
        float f5 = (f3 * 0.02f * f) + (f3 * 1.0f) + this.f;
        this.f = f5;
        float f6 = this.e;
        if (f5 > f6) {
            this.f = f6;
            f5 = f6;
        }
        float interpolation = s33.g.getInterpolation(f5 / f6);
        float f7 = i3;
        float f8 = this.c;
        float f9 = (((((this.a - f8) * interpolation) + f8) * f7) + i2) - 200.0f;
        float f10 = this.d;
        float f11 = (((((this.b - f10) * interpolation) + f10) * f7) + i) - 200.0f;
        byte b = this.i;
        if (!h75.h1(b)) {
            f4 = b == 1 ? 4.0f : 2.5f;
        }
        float L = (gl.L(122.0f) / 400.0f) * f4;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f9, f11);
        matrix.postScale(L, L, f9 + 200.0f, f11 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }
}
