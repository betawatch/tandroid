package cg;

import k7.n6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c2 extends d2 {
    public final s1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ e2 i;

    public c2(e2 e2Var, s1 s1Var, boolean z4, boolean z10) {
        this.i = e2Var;
        this.b = false;
        this.f = s1Var;
        this.g = z4 ? -1.0f : 1.0f;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override // cg.d2
    public final void a() {
        s1 s1Var = this.f;
        if (s1Var != null) {
            float f10 = (this.g * s1Var.d) + s1Var.b;
            float f11 = (this.h * s1Var.e) + s1Var.c;
            e2 e2Var = this.i;
            e2Var.c(f10, f11, true);
            float[] fArr = e2Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // cg.d2
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        s1 s1Var = this.f;
        float f12 = ((-this.g) * s1Var.d) + s1Var.b;
        float f13 = ((-this.h) * s1Var.e) + s1Var.c;
        e2 e2Var = this.i;
        e2Var.c(f10, f11, false);
        e2Var.c(f12, f13, true);
        float[] fArr = e2Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - s1Var.h;
        double cos = Math.cos(atan2) * n6.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * n6.a(f10, f11, f14, f15);
        s1Var.d = ((float) Math.abs(cos)) / 2.0f;
        s1Var.e = ((float) Math.abs(sin)) / 2.0f;
        s1Var.b = (f10 + f14) / 2.0f;
        s1Var.c = (f11 + f15) / 2.0f;
        for (int i10 = 0; i10 < e2Var.m.size(); i10++) {
            ((d2) e2Var.m.get(i10)).a();
        }
    }
}
