package ag;

import i7.z5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g2 extends h2 {
    public final w1 f;
    public final float g;
    public final float h;
    public final /* synthetic */ i2 i;

    public g2(i2 i2Var, w1 w1Var, boolean z10, boolean z11) {
        this.i = i2Var;
        this.b = false;
        this.f = w1Var;
        this.g = z10 ? -1.0f : 1.0f;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override // ag.h2
    public final void a() {
        w1 w1Var = this.f;
        if (w1Var != null) {
            float f9 = (this.g * w1Var.d) + w1Var.b;
            float f10 = (this.h * w1Var.e) + w1Var.c;
            i2 i2Var = this.i;
            i2Var.c(f9, f10, true);
            float[] fArr = i2Var.p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override // ag.h2
    public final void b(float f9, float f10) {
        this.d = f9;
        this.e = f10;
        w1 w1Var = this.f;
        float f11 = ((-this.g) * w1Var.d) + w1Var.b;
        float f12 = ((-this.h) * w1Var.e) + w1Var.c;
        i2 i2Var = this.i;
        i2Var.c(f9, f10, false);
        i2Var.c(f11, f12, true);
        float[] fArr = i2Var.p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f9 - f13)) - w1Var.h;
        double cos = Math.cos(atan2) * z5.a(f9, f10, f13, f14);
        double sin = Math.sin(atan2) * z5.a(f9, f10, f13, f14);
        w1Var.d = ((float) Math.abs(cos)) / 2.0f;
        w1Var.e = ((float) Math.abs(sin)) / 2.0f;
        w1Var.b = (f9 + f13) / 2.0f;
        w1Var.c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < i2Var.m.size(); i10++) {
            ((h2) i2Var.m.get(i10)).a();
        }
    }
}
