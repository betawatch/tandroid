package kg;

import android.graphics.Matrix;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final /* synthetic */ p l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public n(p pVar, int i10, int i11) {
        this.l = pVar;
        this.a = i10;
        this.b = i11;
    }

    public static float a(n nVar) {
        return (nVar.h + nVar.g) % 180.0f != 0.0f ? nVar.b : nVar.a;
    }

    public static float b(n nVar) {
        return (nVar.h + nVar.g) % 180.0f != 0.0f ? nVar.a : nVar.b;
    }

    public static boolean c(n nVar) {
        return Math.abs(nVar.c) > 1.0E-5f || Math.abs(nVar.d) > 1.0E-5f || Math.abs(nVar.e - nVar.f) > 1.0E-5f || Math.abs(nVar.i) > 1.0E-5f || Math.abs(nVar.h) > 1.0E-5f;
    }

    public static void d(n nVar, float f7) {
        Matrix matrix = nVar.k;
        matrix.reset();
        nVar.c = 0.0f;
        nVar.d = 0.0f;
        nVar.i = 0.0f;
        nVar.h = f7;
        nVar.h();
        float f10 = nVar.f;
        nVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(n nVar, float f7) {
        nVar.i += f7;
        nVar.k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(n nVar, float f7, float f10) {
        nVar.c += f7;
        nVar.d += f10;
        nVar.k.postTranslate(f7, f10);
    }

    public static void g(n nVar, float f7, float f10, float f11) {
        nVar.e *= f7;
        nVar.k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7 = this.h;
        float f10 = this.g;
        float f11 = (f7 + f10) % 180.0f != 0.0f ? this.b : this.a;
        float f12 = (f7 + f10) % 180.0f != 0.0f ? this.a : this.b;
        p pVar = this.l;
        if (pVar.x) {
            this.f = pVar.a.getCropWidth() / f11;
        } else {
            this.f = Math.max(pVar.a.getCropWidth() / f11, pVar.a.getCropHeight() / f12);
        }
    }
}
