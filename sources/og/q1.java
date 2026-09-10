package og;

import v7.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q1 extends t1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ u1 g;

    public /* synthetic */ q1(u1 u1Var, int i10) {
        this.f = i10;
        this.g = u1Var;
    }

    @Override // og.t1
    public final void a() {
        switch (this.f) {
            case 0:
                u1 u1Var = this.g;
                k1 k1Var = u1Var.h;
                double atan2 = Math.atan2(k1Var.c - k1Var.j, k1Var.b - k1Var.i) + 3.141592653589793d;
                k1 k1Var2 = u1Var.h;
                double d = k1Var2.k / 5.5f;
                float cos = k1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = u1Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                k1 k1Var3 = this.g.h;
                float f7 = k1Var3.b + k1Var3.d;
                float f10 = k1Var3.c;
                this.d = f7;
                this.e = f10;
                break;
            case 2:
                u1 u1Var2 = this.g;
                k1 k1Var4 = u1Var2.h;
                float min = Math.min(k1Var4.d, k1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + u1Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + u1Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                k1 k1Var5 = this.g.h;
                float f11 = k1Var5.b;
                float abs = k1Var5.c - Math.abs(k1Var5.e);
                this.d = f11;
                this.e = abs;
                break;
            case 4:
                k1 k1Var6 = this.g.h;
                float f12 = k1Var6.i;
                float f13 = k1Var6.j;
                k1Var6.i = f12;
                k1Var6.j = f13;
                this.d = f12;
                this.e = f13;
                break;
            default:
                k1 k1Var7 = this.g.h;
                this.d = k1Var7.b;
                this.e = k1Var7.c;
                break;
        }
    }

    @Override // og.t1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                u1 u1Var = this.g;
                k1 k1Var = u1Var.h;
                double atan2 = Math.atan2(k1Var.c - k1Var.j, k1Var.b - k1Var.i) + 1.5707963267948966d;
                k1 k1Var2 = u1Var.h;
                float a2 = (a7.a(k1Var2.b, k1Var2.c, k1Var2.i, k1Var2.j) * 5.5f) / 2.0f;
                k1 k1Var3 = u1Var.h;
                float f11 = k1Var3.b;
                float f12 = k1Var3.c;
                u1Var.getClass();
                k1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f7;
                this.e = f10;
                k1 k1Var4 = this.g.h;
                float a10 = a7.a(k1Var4.b, k1Var4.c, f7, f10);
                k1Var4.e = a10;
                k1Var4.d = a10;
                break;
            case 2:
                u1 u1Var2 = this.g;
                k1 k1Var5 = u1Var2.h;
                float a11 = a7.a(k1Var5.b, k1Var5.c, f7, f10);
                k1Var5.e = a11;
                k1Var5.d = a11;
                u1Var2.h.h = (float) ((((float) Math.atan2(r0.c - f10, f7 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                u1 u1Var3 = this.g;
                u1Var3.h.h = (float) ((((float) Math.atan2(r1.c - f10, f7 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < u1Var3.m.size(); i10++) {
                    t1 t1Var = (t1) u1Var3.m.get(i10);
                    if (t1Var instanceof s1) {
                        t1Var.a();
                    }
                }
                break;
            case 4:
                k1 k1Var6 = this.g.h;
                k1Var6.i = f7;
                k1Var6.j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = k1Var6.c;
                float f14 = k1Var6.e;
                float f15 = f13 - f14;
                if (f10 > f15 && f10 < f13 + f14) {
                    float f16 = k1Var6.b;
                    if (f7 <= f16) {
                        float f17 = f16 - k1Var6.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + k1Var6.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = k1Var6.b;
                float f21 = k1Var6.d;
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
                k1Var6.i = f19;
                k1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    u1 u1Var4 = this.g;
                    if (i11 >= u1Var4.m.size()) {
                        k1 k1Var7 = u1Var4.h;
                        k1Var7.b = f7;
                        k1Var7.c = f10;
                        this.d = f7;
                        this.e = f10;
                        break;
                    } else {
                        t1 t1Var2 = (t1) u1Var4.m.get(i11);
                        if (t1Var2 != this) {
                            t1Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(u1 u1Var, int i10, boolean z10) {
        super(0);
        this.f = i10;
        this.g = u1Var;
    }
}
