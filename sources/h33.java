// default package

import android.graphics.Matrix;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h33 {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final /* synthetic */ j33 l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0.0f;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public h33(j33 j33Var, int i, int i2) {
        this.l = j33Var;
        this.a = i;
        this.b = i2;
    }

    public final float a() {
        return (this.h + this.g) % 180.0f != 0.0f ? this.a : this.b;
    }

    public final float b() {
        return (this.h + this.g) % 180.0f != 0.0f ? this.b : this.a;
    }

    public final boolean c() {
        return Math.abs(this.c) > 1.0E-5f || Math.abs(this.d) > 1.0E-5f || Math.abs(this.e - this.f) > 1.0E-5f || Math.abs(this.i) > 1.0E-5f || Math.abs(this.h) > 1.0E-5f;
    }

    public final void d(float f) {
        Matrix matrix = this.k;
        matrix.reset();
        this.c = 0.0f;
        this.d = 0.0f;
        this.i = 0.0f;
        this.h = f;
        h();
        float f2 = this.f;
        this.e = f2;
        matrix.postScale(f2, f2);
    }

    public final void e(float f) {
        this.i += f;
        this.k.postRotate(f, 0.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.e *= f;
        this.k.postScale(f, f, f2, f3);
    }

    public final void g(float f, float f2) {
        this.c += f;
        this.d += f2;
        this.k.postTranslate(f, f2);
    }

    public final void h() {
        float f = this.h;
        float f2 = this.g;
        float f3 = (f + f2) % 180.0f != 0.0f ? this.b : this.a;
        float f4 = (f + f2) % 180.0f != 0.0f ? this.a : this.b;
        j33 j33Var = this.l;
        if (j33Var.y) {
            this.f = j33Var.a.getCropWidth() / f3;
        } else {
            this.f = Math.max(j33Var.a.getCropWidth() / f3, j33Var.a.getCropHeight() / f4);
        }
    }
}
