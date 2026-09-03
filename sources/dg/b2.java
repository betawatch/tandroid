package dg;

import k7.o6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b2 extends c2 {
    public final r1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ d2 i;

    public b2(d2 d2Var, r1 r1Var, boolean z4, boolean z10) {
        this.i = d2Var;
        this.b = false;
        this.f = r1Var;
        this.g = z4 ? -1.0f : 1.0f;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override // dg.c2
    public final void a() {
        r1 r1Var = this.f;
        if (r1Var != null) {
            float f10 = (this.g * r1Var.d) + r1Var.b;
            float f11 = (this.h * r1Var.e) + r1Var.c;
            d2 d2Var = this.i;
            d2Var.c(f10, f11, true);
            float[] fArr = d2Var.p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override // dg.c2
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        r1 r1Var = this.f;
        float f12 = ((-this.g) * r1Var.d) + r1Var.b;
        float f13 = ((-this.h) * r1Var.e) + r1Var.c;
        d2 d2Var = this.i;
        d2Var.c(f10, f11, false);
        d2Var.c(f12, f13, true);
        float[] fArr = d2Var.p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - r1Var.h;
        double cos = Math.cos(atan2) * o6.a(f10, f11, f14, f15);
        double sin = Math.sin(atan2) * o6.a(f10, f11, f14, f15);
        r1Var.d = ((float) Math.abs(cos)) / 2.0f;
        r1Var.e = ((float) Math.abs(sin)) / 2.0f;
        r1Var.b = (f10 + f14) / 2.0f;
        r1Var.c = (f11 + f15) / 2.0f;
        for (int i10 = 0; i10 < d2Var.m.size(); i10++) {
            ((c2) d2Var.m.get(i10)).a();
        }
    }
}
