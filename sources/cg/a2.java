package cg;

import k7.n6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a2 extends d2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e2 g;

    public /* synthetic */ a2(e2 e2Var, int i10) {
        this.f = i10;
        this.g = e2Var;
    }

    @Override // cg.d2
    public final void a() {
        switch (this.f) {
            case 0:
                e2 e2Var = this.g;
                s1 s1Var = e2Var.h;
                double atan2 = Math.atan2(s1Var.c - s1Var.j, s1Var.b - s1Var.i) + 3.141592653589793d;
                s1 s1Var2 = e2Var.h;
                double d = s1Var2.k / 5.5f;
                float cos = s1Var2.b + ((float) (Math.cos(atan2) * d));
                float sin = e2Var.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                s1 s1Var3 = this.g.h;
                float f10 = s1Var3.b + s1Var3.d;
                float f11 = s1Var3.c;
                this.d = f10;
                this.e = f11;
                break;
            case 2:
                e2 e2Var2 = this.g;
                s1 s1Var4 = e2Var2.h;
                float min = Math.min(s1Var4.d, s1Var4.e);
                float cos2 = (((float) Math.cos(-0.3141592653589793d)) * min) + e2Var2.h.b;
                float sin2 = (((float) Math.sin(-0.3141592653589793d)) * min) + e2Var2.h.c;
                this.d = cos2;
                this.e = sin2;
                break;
            case 3:
                s1 s1Var5 = this.g.h;
                float f12 = s1Var5.b;
                float abs = s1Var5.c - Math.abs(s1Var5.e);
                this.d = f12;
                this.e = abs;
                break;
            case 4:
                s1 s1Var6 = this.g.h;
                float f13 = s1Var6.i;
                float f14 = s1Var6.j;
                s1Var6.i = f13;
                s1Var6.j = f14;
                this.d = f13;
                this.e = f14;
                break;
            default:
                s1 s1Var7 = this.g.h;
                this.d = s1Var7.b;
                this.e = s1Var7.c;
                break;
        }
    }

    @Override // cg.d2
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                e2 e2Var = this.g;
                s1 s1Var = e2Var.h;
                double atan2 = Math.atan2(s1Var.c - s1Var.j, s1Var.b - s1Var.i) + 1.5707963267948966d;
                s1 s1Var2 = e2Var.h;
                float a2 = (n6.a(s1Var2.b, s1Var2.c, s1Var2.i, s1Var2.j) * 5.5f) / 2.0f;
                s1 s1Var3 = e2Var.h;
                float f12 = s1Var3.b;
                float f13 = s1Var3.c;
                e2Var.getClass();
                s1Var3.k = Math.min(a2, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                break;
            case 1:
                this.d = f10;
                this.e = f11;
                s1 s1Var4 = this.g.h;
                float a10 = n6.a(s1Var4.b, s1Var4.c, f10, f11);
                s1Var4.e = a10;
                s1Var4.d = a10;
                break;
            case 2:
                e2 e2Var2 = this.g;
                s1 s1Var5 = e2Var2.h;
                float a11 = n6.a(s1Var5.b, s1Var5.c, f10, f11);
                s1Var5.e = a11;
                s1Var5.d = a11;
                e2Var2.h.h = (float) ((((float) Math.atan2(r0.c - f11, f10 - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                break;
            case 3:
                e2 e2Var3 = this.g;
                e2Var3.h.h = (float) ((((float) Math.atan2(r1.c - f11, f10 - r1.b)) - 1.5707963267948966d) + r1.h);
                for (int i10 = 0; i10 < e2Var3.m.size(); i10++) {
                    d2 d2Var = (d2) e2Var3.m.get(i10);
                    if (d2Var instanceof c2) {
                        d2Var.a();
                    }
                }
                break;
            case 4:
                s1 s1Var6 = this.g.h;
                s1Var6.i = f10;
                s1Var6.j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = s1Var6.c;
                float f15 = s1Var6.e;
                float f16 = f14 - f15;
                if (f11 > f16 && f11 < f14 + f15) {
                    float f17 = s1Var6.b;
                    if (f10 <= f17) {
                        float f18 = f17 - s1Var6.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + s1Var6.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = s1Var6.b;
                float f22 = s1Var6.d;
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
                s1Var6.i = f20;
                s1Var6.j = this.e;
                break;
            default:
                int i11 = 0;
                while (true) {
                    e2 e2Var4 = this.g;
                    if (i11 >= e2Var4.m.size()) {
                        s1 s1Var7 = e2Var4.h;
                        s1Var7.b = f10;
                        s1Var7.c = f11;
                        this.d = f10;
                        this.e = f11;
                        break;
                    } else {
                        d2 d2Var2 = (d2) e2Var4.m.get(i11);
                        if (d2Var2 != this) {
                            d2Var2.a();
                        }
                        i11++;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(e2 e2Var, int i10, boolean z4) {
        super(0);
        this.f = i10;
        this.g = e2Var;
    }
}
