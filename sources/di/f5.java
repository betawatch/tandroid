package di;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ f5(l5 l5Var, int i7) {
        this.a = i7;
        this.b = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                l5 l5Var = this.b;
                w5 w5Var = l5Var.a;
                if (!l5Var.u) {
                    l5Var.v = false;
                    if (l5Var.o) {
                        l5Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - l5Var.m) / 1000.0f, 0.25f);
                        float f10 = l5Var.n + min;
                        l5Var.n = f10;
                        float f11 = l5Var.j.f(f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, l5Var.t), min);
                        float f12 = l5Var.k.f(l5Var.n > org.telegram.messenger.g0.T1(0.1f, 1.0f, l5Var.t), min);
                        float f13 = l5Var.i.f(l5Var.j.b(0.5f), min);
                        float f14 = l5Var.h.f(l5Var.j.b(0.5f) && l5Var.i.b(0.5f), min);
                        l5Var.m = currentTimeMillis;
                        if (l5Var.j.c() && l5Var.i.c() && l5Var.h.c() && !l5Var.p) {
                            l5Var.p = true;
                            org.telegram.messenger.g0.h3(new f5(l5Var, 2));
                        }
                        if (l5Var.j.c() && l5Var.i.c() && l5Var.h.b(0.25f) && !l5Var.q) {
                            l5Var.q = true;
                            org.telegram.messenger.g0.h3(new f5(l5Var, 3));
                        }
                        q5 q5Var = l5Var.b;
                        if (q5Var != null) {
                            h5 h5Var = l5Var.h;
                            g5 g5Var = h5Var.b;
                            float f15 = h5Var.e - f14;
                            float f16 = f15 - 1.0f;
                            g5 g5Var2 = h5Var.i;
                            boolean z10 = g5Var == g5Var2;
                            g5 g5Var3 = h5Var.c;
                            boolean z11 = g5Var3 == g5Var2;
                            g5 g5Var4 = h5Var.d;
                            q5Var.a(g5Var, f16, z10, g5Var3, f15, z11, g5Var4, f15 + 1.0f, g5Var4 == g5Var2);
                        }
                        q5 q5Var2 = l5Var.c;
                        if (q5Var2 != null) {
                            h5 h5Var2 = l5Var.i;
                            g5 g5Var5 = h5Var2.b;
                            float f17 = h5Var2.e - f13;
                            float f18 = f17 - 1.0f;
                            g5 g5Var6 = h5Var2.i;
                            boolean z12 = g5Var5 == g5Var6;
                            g5 g5Var7 = h5Var2.c;
                            boolean z13 = g5Var7 == g5Var6;
                            g5 g5Var8 = h5Var2.d;
                            q5Var2.a(g5Var5, f18, z12, g5Var7, f17, z13, g5Var8, f17 + 1.0f, g5Var8 == g5Var6);
                        }
                        q5 q5Var3 = l5Var.d;
                        if (q5Var3 != null) {
                            h5 h5Var3 = l5Var.k;
                            g5 g5Var9 = h5Var3.b;
                            float f19 = h5Var3.e - f12;
                            float f20 = f19 - 1.0f;
                            g5 g5Var10 = h5Var3.i;
                            boolean z14 = g5Var9 == g5Var10;
                            g5 g5Var11 = h5Var3.c;
                            boolean z15 = g5Var11 == g5Var10;
                            g5 g5Var12 = h5Var3.d;
                            q5Var3.a(g5Var9, f20, z14, g5Var11, f19, z15, g5Var12, f19 + 1.0f, g5Var12 == g5Var10);
                        }
                        w5Var.g(0, ((k5) l5Var.i.c).c, true);
                        o5 o5Var = w5Var.c;
                        h5 h5Var4 = l5Var.h;
                        g5 g5Var13 = h5Var4.b;
                        j5 j5Var = (j5) g5Var13;
                        float f21 = h5Var4.e - f14;
                        float f22 = f21 - 1.0f;
                        g5 g5Var14 = h5Var4.i;
                        boolean z16 = g5Var13 == g5Var14;
                        g5 g5Var15 = h5Var4.c;
                        j5 j5Var2 = (j5) g5Var15;
                        boolean z17 = g5Var15 == g5Var14;
                        g5 g5Var16 = h5Var4.d;
                        j5 j5Var3 = (j5) g5Var16;
                        float f23 = f21 + 1.0f;
                        boolean z18 = g5Var16 == g5Var14;
                        h5 h5Var5 = l5Var.j;
                        i5 i5Var = (i5) h5Var5.b;
                        float f24 = h5Var5.e - f11;
                        i5 i5Var2 = (i5) h5Var5.c;
                        i5 i5Var3 = (i5) h5Var5.d;
                        o5Var.a = j5Var;
                        o5Var.b = j5Var2;
                        o5Var.c = j5Var3;
                        o5Var.d = f22;
                        o5Var.e = f21;
                        o5Var.f = f23;
                        o5Var.h = z16;
                        o5Var.n = z17;
                        o5Var.r = z18;
                        o5Var.s = i5Var;
                        o5Var.w = i5Var2;
                        o5Var.x = i5Var3;
                        o5Var.y = f24 - 1.0f;
                        o5Var.E = f24;
                        o5Var.F = f24 + 1.0f;
                        o5Var.invalidate();
                        l5Var.u = false;
                        l5Var.b();
                        break;
                    }
                }
                break;
            case 2:
                l5 l5Var2 = this.b;
                l5Var2.o = false;
                l5Var2.a.c.c();
                l1 l1Var = l5Var2.r;
                if (l1Var != null) {
                    l1Var.run();
                    break;
                }
                break;
            default:
                l1 l1Var2 = this.b.s;
                if (l1Var2 != null) {
                    l1Var2.run();
                    break;
                }
                break;
        }
    }
}
