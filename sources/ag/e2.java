package ag;

import i7.z5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e2 extends h2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ i2 g;

    public /* synthetic */ e2(i2 i2Var, int i10) {
        this.f = i10;
        this.g = i2Var;
    }

    @Override // ag.h2
    public final void a() {
        switch (this.f) {
            case 0:
                i2 i2Var = this.g;
                w1 w1Var = i2Var.h;
                double atan2 = Math.atan2(w1Var.c - w1Var.j, w1Var.b - w1Var.i) + 3.141592653589793d;
                w1 w1Var2 = i2Var.h;
                double d = w1Var2.k / 5.5f;
                float cos = w1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = i2Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                w1 w1Var3 = this.g.h;
                float f9 = w1Var3.b + w1Var3.d;
                float f10 = w1Var3.c;
                this.d = f9;
                this.e = f10;
                break;
            case 2:
                i2 i2Var2 = this.g;
                w1 w1Var4 = i2Var2.h;
                float min = Math.min(w1Var4.d, w1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + i2Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + i2Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                w1 w1Var5 = this.g.h;
                float f11 = w1Var5.b;
                float abs = w1Var5.c - Math.abs(w1Var5.e);
                this.d = f11;
                this.e = abs;
                break;
            case 4:
                w1 w1Var6 = this.g.h;
                float f12 = w1Var6.i;
                float f13 = w1Var6.j;
                w1Var6.i = f12;
                w1Var6.j = f13;
                this.d = f12;
                this.e = f13;
                break;
            default:
                w1 w1Var7 = this.g.h;
                this.d = w1Var7.b;
                this.e = w1Var7.c;
                break;
        }
    }

    @Override // ag.h2
    public final void b(float f9, float f10) {
        switch (this.f) {
            case 0:
                i2 i2Var = this.g;
                w1 w1Var = i2Var.h;
                double atan2 = Math.atan2(w1Var.c - w1Var.j, w1Var.b - w1Var.i) + 1.5707963267948966d;
                w1 w1Var2 = i2Var.h;
                float a2 = (z5.a(w1Var2.b, w1Var2.c, w1Var2.i, w1Var2.j) * 5.5f) / 2.0f;
                w1 w1Var3 = i2Var.h;
                float f11 = w1Var3.b;
                float f12 = w1Var3.c;
                i2Var.getClass();
                w1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f9))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f9;
                this.e = f10;
                w1 w1Var4 = this.g.h;
                float a10 = z5.a(w1Var4.b, w1Var4.c, f9, f10);
                w1Var4.e = a10;
                w1Var4.d = a10;
                break;
            case 2:
                i2 i2Var2 = this.g;
                w1 w1Var5 = i2Var2.h;
                float a11 = z5.a(w1Var5.b, w1Var5.c, f9, f10);
                w1Var5.e = a11;
                w1Var5.d = a11;
                i2Var2.h.h = (float) ((((float) Math.atan2(r0.c - f10, f9 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                i2 i2Var3 = this.g;
                i2Var3.h.h = (float) ((((float) Math.atan2(r1.c - f10, f9 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < i2Var3.m.size(); i10++) {
                    h2 h2Var = (h2) i2Var3.m.get(i10);
                    if (h2Var instanceof g2) {
                        h2Var.a();
                    }
                }
                break;
            case 4:
                w1 w1Var6 = this.g.h;
                w1Var6.i = f9;
                w1Var6.j = f10;
                this.d = f9;
                this.e = f10;
                float f13 = w1Var6.c;
                float f14 = w1Var6.e;
                float f15 = f13 - f14;
                if (f10 > f15 && f10 < f13 + f14) {
                    float f16 = w1Var6.b;
                    if (f9 <= f16) {
                        float f17 = f16 - w1Var6.d;
                        if (f9 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f9 > f13) {
                        float f18 = f16 + w1Var6.d;
                        if (f9 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = w1Var6.b;
                float f21 = w1Var6.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && f10 > f15) {
                        this.e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.e = f22;
                        }
                    }
                }
                w1Var6.i = f19;
                w1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    i2 i2Var4 = this.g;
                    if (i11 >= i2Var4.m.size()) {
                        w1 w1Var7 = i2Var4.h;
                        w1Var7.b = f9;
                        w1Var7.c = f10;
                        this.d = f9;
                        this.e = f10;
                        break;
                    } else {
                        h2 h2Var2 = (h2) i2Var4.m.get(i11);
                        if (h2Var2 != this) {
                            h2Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(i2 i2Var, int i10, boolean z10) {
        super(0);
        this.f = i10;
        this.g = i2Var;
    }
}
