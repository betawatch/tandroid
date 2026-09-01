package dg;

import k7.o6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z1 extends c2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d2 g;

    public /* synthetic */ z1(d2 d2Var, int i10) {
        this.f = i10;
        this.g = d2Var;
    }

    @Override // dg.c2
    public final void a() {
        switch (this.f) {
            case 0:
                d2 d2Var = this.g;
                r1 r1Var = d2Var.h;
                double atan2 = Math.atan2(r1Var.c - r1Var.j, r1Var.b - r1Var.i) + 3.141592653589793d;
                r1 r1Var2 = d2Var.h;
                double d = r1Var2.k / 5.5f;
                float cos = r1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = d2Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                r1 r1Var3 = this.g.h;
                float f10 = r1Var3.b + r1Var3.d;
                float f11 = r1Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                d2 d2Var2 = this.g;
                r1 r1Var4 = d2Var2.h;
                float min = Math.min(r1Var4.d, r1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + d2Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + d2Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                r1 r1Var5 = this.g.h;
                float f12 = r1Var5.b;
                float abs = r1Var5.c - Math.abs(r1Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                r1 r1Var6 = this.g.h;
                float f13 = r1Var6.i;
                float f14 = r1Var6.j;
                r1Var6.i = f13;
                r1Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                r1 r1Var7 = this.g.h;
                this.d = r1Var7.b;
                this.e = r1Var7.c;
                break;
        }
    }

    @Override // dg.c2
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                d2 d2Var = this.g;
                r1 r1Var = d2Var.h;
                double atan2 = Math.atan2(r1Var.c - r1Var.j, r1Var.b - r1Var.i) + 1.5707963267948966d;
                r1 r1Var2 = d2Var.h;
                float a2 = (o6.a(r1Var2.b, r1Var2.c, r1Var2.i, r1Var2.j) * 5.5f) / 2.0f;
                r1 r1Var3 = d2Var.h;
                float f12 = r1Var3.b;
                float f13 = r1Var3.c;
                d2Var.getClass();
                r1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                r1 r1Var4 = this.g.h;
                float a10 = o6.a(r1Var4.b, r1Var4.c, f10, f11);
                r1Var4.e = a10;
                r1Var4.d = a10;
                break;
            case 2:
                d2 d2Var2 = this.g;
                r1 r1Var5 = d2Var2.h;
                float a11 = o6.a(r1Var5.b, r1Var5.c, f10, f11);
                r1Var5.e = a11;
                r1Var5.d = a11;
                d2Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                d2 d2Var3 = this.g;
                d2Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < d2Var3.m.size(); i10++) {
                    c2 c2Var = (c2) d2Var3.m.get(i10);
                    if (c2Var instanceof b2) {
                        c2Var.a();
                    }
                }
                break;
            case 4:
                r1 r1Var6 = this.g.h;
                r1Var6.i = f10;
                r1Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = r1Var6.c;
                float f15 = r1Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = r1Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - r1Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + r1Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = r1Var6.b;
                float f22 = r1Var6.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && f11 > f16) {
                        this.e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.e = f23;
                        }
                    }
                }
                r1Var6.i = f20;
                r1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    d2 d2Var4 = this.g;
                    if (i11 >= d2Var4.m.size()) {
                        r1 r1Var7 = d2Var4.h;
                        r1Var7.b = f10;
                        r1Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        c2 c2Var2 = (c2) d2Var4.m.get(i11);
                        if (c2Var2 != this) {
                            c2Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(d2 d2Var, int i10, boolean z4) {
        super(0);
        this.f = i10;
        this.g = d2Var;
    }
}
