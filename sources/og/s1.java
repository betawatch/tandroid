package og;

import v7.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s1 extends t1 {
    public final k1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ u1 i;

    public s1(u1 u1Var, k1 k1Var, boolean z10, boolean z11) {
        this.i = u1Var;
        this.b = false;
        this.f = k1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // og.t1
    public final void a() {
        k1 k1Var = this.f;
        if (k1Var != null) {
            float f7 = (this.g * k1Var.d) + k1Var.b;
            float f10 = (this.h * k1Var.e) + k1Var.c;
            u1 u1Var = this.i;
            u1Var.c(f7, f10, true);
            float[] fArr = u1Var.p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override // og.t1
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        k1 k1Var = this.f;
        float f11 = ((-this.g) * k1Var.d) + k1Var.b;
        float f12 = ((-this.h) * k1Var.e) + k1Var.c;
        u1 u1Var = this.i;
        u1Var.c(f7, f10, false);
        u1Var.c(f11, f12, true);
        float[] fArr = u1Var.p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - k1Var.h;
        double cos = Math.cos(atan2) * a7.a(f7, f10, f13, f14);
        double sin = Math.sin(atan2) * a7.a(f7, f10, f13, f14);
        k1Var.d = ((float) Math.abs(cos)) / 2.0f;
        k1Var.e = ((float) Math.abs(sin)) / 2.0f;
        k1Var.b = (f7 + f13) / 2.0f;
        k1Var.c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < u1Var.m.size(); i10++) {
            ((t1) u1Var.m.get(i10)).a();
        }
    }
}
