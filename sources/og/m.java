package og;

import android.graphics.Matrix;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final /* synthetic */ o l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public m(o oVar, int i7, int i10) {
        this.l = oVar;
        this.a = i7;
        this.b = i10;
    }

    public static float a(m mVar) {
        return (mVar.h + mVar.g) % 180.0f != 0.0f ? mVar.b : mVar.a;
    }

    public static float b(m mVar) {
        return (mVar.h + mVar.g) % 180.0f != 0.0f ? mVar.a : mVar.b;
    }

    public static boolean c(m mVar) {
        return Math.abs(mVar.c) > 1.0E-5f || Math.abs(mVar.d) > 1.0E-5f || Math.abs(mVar.e - mVar.f) > 1.0E-5f || Math.abs(mVar.i) > 1.0E-5f || Math.abs(mVar.h) > 1.0E-5f;
    }

    public static void d(m mVar, float f10) {
        Matrix matrix = mVar.k;
        matrix.reset();
        mVar.c = 0.0f;
        mVar.d = 0.0f;
        mVar.i = 0.0f;
        mVar.h = f10;
        mVar.h();
        float f11 = mVar.f;
        mVar.e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(m mVar, float f10) {
        mVar.i += f10;
        mVar.k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(m mVar, float f10, float f11) {
        mVar.c += f10;
        mVar.d += f11;
        mVar.k.postTranslate(f10, f11);
    }

    public static void g(m mVar, float f10, float f11, float f12) {
        mVar.e *= f10;
        mVar.k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10 = this.h;
        float f11 = this.g;
        float f12 = (f10 + f11) % 180.0f != 0.0f ? this.b : this.a;
        float f13 = (f10 + f11) % 180.0f != 0.0f ? this.a : this.b;
        o oVar = this.l;
        if (oVar.y) {
            this.f = oVar.a.getCropWidth() / f12;
        } else {
            this.f = Math.max(oVar.a.getCropWidth() / f12, oVar.a.getCropHeight() / f13);
        }
    }
}
