package di;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ i5(o5 o5Var, int i7) {
        this.a = i7;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                o5 o5Var = this.b;
                z5 z5Var = o5Var.a;
                if (!o5Var.u) {
                    o5Var.v = false;
                    if (o5Var.o) {
                        o5Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - o5Var.m) / 1000.0f, 0.25f);
                        float f10 = o5Var.n + min;
                        o5Var.n = f10;
                        float f11 = o5Var.j.f(f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, o5Var.t), min);
                        float f12 = o5Var.k.f(o5Var.n > org.telegram.messenger.g0.T1(0.1f, 1.0f, o5Var.t), min);
                        float f13 = o5Var.i.f(o5Var.j.b(0.5f), min);
                        float f14 = o5Var.h.f(o5Var.j.b(0.5f) && o5Var.i.b(0.5f), min);
                        o5Var.m = currentTimeMillis;
                        if (o5Var.j.c() && o5Var.i.c() && o5Var.h.c() && !o5Var.p) {
                            o5Var.p = true;
                            org.telegram.messenger.g0.g3(new i5(o5Var, 2));
                        }
                        if (o5Var.j.c() && o5Var.i.c() && o5Var.h.b(0.25f) && !o5Var.q) {
                            o5Var.q = true;
                            org.telegram.messenger.g0.g3(new i5(o5Var, 3));
                        }
                        t5 t5Var = o5Var.b;
                        if (t5Var != null) {
                            k5 k5Var = o5Var.h;
                            j5 j5Var = k5Var.b;
                            float f15 = k5Var.e - f14;
                            float f16 = f15 - 1.0f;
                            j5 j5Var2 = k5Var.i;
                            boolean z10 = j5Var == j5Var2;
                            j5 j5Var3 = k5Var.c;
                            boolean z11 = j5Var3 == j5Var2;
                            j5 j5Var4 = k5Var.d;
                            t5Var.a(j5Var, f16, z10, j5Var3, f15, z11, j5Var4, f15 + 1.0f, j5Var4 == j5Var2);
                        }
                        t5 t5Var2 = o5Var.c;
                        if (t5Var2 != null) {
                            k5 k5Var2 = o5Var.i;
                            j5 j5Var5 = k5Var2.b;
                            float f17 = k5Var2.e - f13;
                            float f18 = f17 - 1.0f;
                            j5 j5Var6 = k5Var2.i;
                            boolean z12 = j5Var5 == j5Var6;
                            j5 j5Var7 = k5Var2.c;
                            boolean z13 = j5Var7 == j5Var6;
                            j5 j5Var8 = k5Var2.d;
                            t5Var2.a(j5Var5, f18, z12, j5Var7, f17, z13, j5Var8, f17 + 1.0f, j5Var8 == j5Var6);
                        }
                        t5 t5Var3 = o5Var.d;
                        if (t5Var3 != null) {
                            k5 k5Var3 = o5Var.k;
                            j5 j5Var9 = k5Var3.b;
                            float f19 = k5Var3.e - f12;
                            float f20 = f19 - 1.0f;
                            j5 j5Var10 = k5Var3.i;
                            boolean z14 = j5Var9 == j5Var10;
                            j5 j5Var11 = k5Var3.c;
                            boolean z15 = j5Var11 == j5Var10;
                            j5 j5Var12 = k5Var3.d;
                            t5Var3.a(j5Var9, f20, z14, j5Var11, f19, z15, j5Var12, f19 + 1.0f, j5Var12 == j5Var10);
                        }
                        z5Var.g(0, ((n5) o5Var.i.c).c, true);
                        r5 r5Var = z5Var.c;
                        k5 k5Var4 = o5Var.h;
                        j5 j5Var13 = k5Var4.b;
                        m5 m5Var = (m5) j5Var13;
                        float f21 = k5Var4.e - f14;
                        float f22 = f21 - 1.0f;
                        j5 j5Var14 = k5Var4.i;
                        boolean z16 = j5Var13 == j5Var14;
                        j5 j5Var15 = k5Var4.c;
                        m5 m5Var2 = (m5) j5Var15;
                        boolean z17 = j5Var15 == j5Var14;
                        j5 j5Var16 = k5Var4.d;
                        m5 m5Var3 = (m5) j5Var16;
                        float f23 = f21 + 1.0f;
                        boolean z18 = j5Var16 == j5Var14;
                        k5 k5Var5 = o5Var.j;
                        l5 l5Var = (l5) k5Var5.b;
                        float f24 = k5Var5.e - f11;
                        l5 l5Var2 = (l5) k5Var5.c;
                        l5 l5Var3 = (l5) k5Var5.d;
                        r5Var.a = m5Var;
                        r5Var.b = m5Var2;
                        r5Var.c = m5Var3;
                        r5Var.d = f22;
                        r5Var.e = f21;
                        r5Var.f = f23;
                        r5Var.h = z16;
                        r5Var.n = z17;
                        r5Var.r = z18;
                        r5Var.s = l5Var;
                        r5Var.w = l5Var2;
                        r5Var.x = l5Var3;
                        r5Var.y = f24 - 1.0f;
                        r5Var.E = f24;
                        r5Var.F = f24 + 1.0f;
                        r5Var.invalidate();
                        o5Var.u = false;
                        o5Var.b();
                        break;
                    }
                }
                break;
            case 2:
                o5 o5Var2 = this.b;
                o5Var2.o = false;
                o5Var2.a.c.c();
                k1 k1Var = o5Var2.r;
                if (k1Var != null) {
                    k1Var.run();
                    break;
                }
                break;
            default:
                k1 k1Var2 = this.b.s;
                if (k1Var2 != null) {
                    k1Var2.run();
                    break;
                }
                break;
        }
    }
}
