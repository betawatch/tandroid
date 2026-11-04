package ci;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ o5(u5 u5Var, int i3) {
        this.a = i3;
        this.b = u5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                u5 u5Var = this.b;
                f6 f6Var = u5Var.a;
                if (!u5Var.u) {
                    u5Var.v = false;
                    if (u5Var.o) {
                        u5Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - u5Var.m) / 1000.0f, 0.25f);
                        float f10 = u5Var.n + min;
                        u5Var.n = f10;
                        float f11 = u5Var.j.f(f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, u5Var.t), min);
                        float f12 = u5Var.k.f(u5Var.n > org.telegram.messenger.g0.T1(0.1f, 1.0f, u5Var.t), min);
                        float f13 = u5Var.i.f(u5Var.j.b(0.5f), min);
                        float f14 = u5Var.h.f(u5Var.j.b(0.5f) && u5Var.i.b(0.5f), min);
                        u5Var.m = currentTimeMillis;
                        if (u5Var.j.c() && u5Var.i.c() && u5Var.h.c() && !u5Var.p) {
                            u5Var.p = true;
                            org.telegram.messenger.g0.h3(new o5(u5Var, 2));
                        }
                        if (u5Var.j.c() && u5Var.i.c() && u5Var.h.b(0.25f) && !u5Var.q) {
                            u5Var.q = true;
                            org.telegram.messenger.g0.h3(new o5(u5Var, 3));
                        }
                        z5 z5Var = u5Var.b;
                        if (z5Var != null) {
                            q5 q5Var = u5Var.h;
                            p5 p5Var = q5Var.b;
                            float f15 = q5Var.e - f14;
                            float f16 = f15 - 1.0f;
                            p5 p5Var2 = q5Var.i;
                            boolean z10 = p5Var == p5Var2;
                            p5 p5Var3 = q5Var.c;
                            boolean z11 = p5Var3 == p5Var2;
                            p5 p5Var4 = q5Var.d;
                            z5Var.a(p5Var, f16, z10, p5Var3, f15, z11, p5Var4, f15 + 1.0f, p5Var4 == p5Var2);
                        }
                        z5 z5Var2 = u5Var.c;
                        if (z5Var2 != null) {
                            q5 q5Var2 = u5Var.i;
                            p5 p5Var5 = q5Var2.b;
                            float f17 = q5Var2.e - f13;
                            float f18 = f17 - 1.0f;
                            p5 p5Var6 = q5Var2.i;
                            boolean z12 = p5Var5 == p5Var6;
                            p5 p5Var7 = q5Var2.c;
                            boolean z13 = p5Var7 == p5Var6;
                            p5 p5Var8 = q5Var2.d;
                            z5Var2.a(p5Var5, f18, z12, p5Var7, f17, z13, p5Var8, f17 + 1.0f, p5Var8 == p5Var6);
                        }
                        z5 z5Var3 = u5Var.d;
                        if (z5Var3 != null) {
                            q5 q5Var3 = u5Var.k;
                            p5 p5Var9 = q5Var3.b;
                            float f19 = q5Var3.e - f12;
                            float f20 = f19 - 1.0f;
                            p5 p5Var10 = q5Var3.i;
                            boolean z14 = p5Var9 == p5Var10;
                            p5 p5Var11 = q5Var3.c;
                            boolean z15 = p5Var11 == p5Var10;
                            p5 p5Var12 = q5Var3.d;
                            z5Var3.a(p5Var9, f20, z14, p5Var11, f19, z15, p5Var12, f19 + 1.0f, p5Var12 == p5Var10);
                        }
                        f6Var.g(0, ((t5) u5Var.i.c).c, true);
                        x5 x5Var = f6Var.c;
                        q5 q5Var4 = u5Var.h;
                        p5 p5Var13 = q5Var4.b;
                        s5 s5Var = (s5) p5Var13;
                        float f21 = q5Var4.e - f14;
                        float f22 = f21 - 1.0f;
                        p5 p5Var14 = q5Var4.i;
                        boolean z16 = p5Var13 == p5Var14;
                        p5 p5Var15 = q5Var4.c;
                        s5 s5Var2 = (s5) p5Var15;
                        boolean z17 = p5Var15 == p5Var14;
                        p5 p5Var16 = q5Var4.d;
                        s5 s5Var3 = (s5) p5Var16;
                        float f23 = f21 + 1.0f;
                        boolean z18 = p5Var16 == p5Var14;
                        q5 q5Var5 = u5Var.j;
                        r5 r5Var = (r5) q5Var5.b;
                        float f24 = q5Var5.e - f11;
                        r5 r5Var2 = (r5) q5Var5.c;
                        r5 r5Var3 = (r5) q5Var5.d;
                        x5Var.a = s5Var;
                        x5Var.b = s5Var2;
                        x5Var.c = s5Var3;
                        x5Var.d = f22;
                        x5Var.e = f21;
                        x5Var.f = f23;
                        x5Var.h = z16;
                        x5Var.n = z17;
                        x5Var.r = z18;
                        x5Var.s = r5Var;
                        x5Var.w = r5Var2;
                        x5Var.x = r5Var3;
                        x5Var.y = f24 - 1.0f;
                        x5Var.E = f24;
                        x5Var.F = f24 + 1.0f;
                        x5Var.invalidate();
                        u5Var.u = false;
                        u5Var.b();
                        break;
                    }
                }
                break;
            case 2:
                u5 u5Var2 = this.b;
                u5Var2.o = false;
                u5Var2.a.c.c();
                s1 s1Var = u5Var2.r;
                if (s1Var != null) {
                    s1Var.run();
                    break;
                }
                break;
            default:
                s1 s1Var2 = this.b.s;
                if (s1Var2 != null) {
                    s1Var2.run();
                    break;
                }
                break;
        }
    }
}
