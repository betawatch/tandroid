package mg;

import android.graphics.Matrix;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class o {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final /* synthetic */ q l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public o(q qVar, int i10, int i11) {
        this.l = qVar;
        this.a = i10;
        this.b = i11;
    }

    public static float a(o oVar) {
        return (oVar.h + oVar.g) % 180.0f != 0.0f ? oVar.b : oVar.a;
    }

    public static float b(o oVar) {
        return (oVar.h + oVar.g) % 180.0f != 0.0f ? oVar.a : oVar.b;
    }

    public static boolean c(o oVar) {
        return Math.abs(oVar.c) > 1.0E-5f || Math.abs(oVar.d) > 1.0E-5f || Math.abs(oVar.e - oVar.f) > 1.0E-5f || Math.abs(oVar.i) > 1.0E-5f || Math.abs(oVar.h) > 1.0E-5f;
    }

    public static void d(o oVar, float f7) {
        Matrix matrix = oVar.k;
        matrix.reset();
        oVar.c = 0.0f;
        oVar.d = 0.0f;
        oVar.i = 0.0f;
        oVar.h = f7;
        oVar.h();
        float f10 = oVar.f;
        oVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(o oVar, float f7) {
        oVar.i += f7;
        oVar.k.postRotate(f7, 0.0f, 0.0f);
    }

    public static void f(o oVar, float f7, float f10) {
        oVar.c += f7;
        oVar.d += f10;
        oVar.k.postTranslate(f7, f10);
    }

    public static void g(o oVar, float f7, float f10, float f11) {
        oVar.e *= f7;
        oVar.k.postScale(f7, f7, f10, f11);
    }

    public final void h() {
        float f7 = this.h;
        float f10 = this.g;
        float f11 = (f7 + f10) % 180.0f != 0.0f ? this.b : this.a;
        float f12 = (f7 + f10) % 180.0f != 0.0f ? this.a : this.b;
        q qVar = this.l;
        if (qVar.x) {
            this.f = qVar.a.getCropWidth() / f11;
        } else {
            this.f = Math.max(qVar.a.getCropWidth() / f11, qVar.a.getCropHeight() / f12);
        }
    }
}
