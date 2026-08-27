package hh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ n4(t4 t4Var, int i10) {
        this.a = i10;
        this.b = t4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                t4 t4Var = this.b;
                e5 e5Var = t4Var.a;
                if (!t4Var.u) {
                    t4Var.v = false;
                    if (t4Var.o) {
                        t4Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - t4Var.m) / 1000.0f, 0.25f);
                        float f10 = t4Var.n + min;
                        t4Var.n = f10;
                        float f11 = t4Var.j.f(min, f10 > AndroidUtilities.lerp(0.1f, 1.0f, t4Var.t));
                        float f12 = t4Var.k.f(min, t4Var.n > AndroidUtilities.lerp(0.1f, 1.0f, t4Var.t));
                        float f13 = t4Var.i.f(min, t4Var.j.b(0.5f));
                        float f14 = t4Var.h.f(min, t4Var.j.b(0.5f) && t4Var.i.b(0.5f));
                        t4Var.m = currentTimeMillis;
                        if (t4Var.j.c() && t4Var.i.c() && t4Var.h.c() && !t4Var.p) {
                            t4Var.p = true;
                            AndroidUtilities.runOnUIThread(new n4(t4Var, 2));
                        }
                        if (t4Var.j.c() && t4Var.i.c() && t4Var.h.b(0.25f) && !t4Var.q) {
                            t4Var.q = true;
                            AndroidUtilities.runOnUIThread(new n4(t4Var, 3));
                        }
                        y4 y4Var = t4Var.b;
                        if (y4Var != null) {
                            p4 p4Var = t4Var.h;
                            o4 o4Var = p4Var.b;
                            float f15 = p4Var.e - f14;
                            float f16 = f15 - 1.0f;
                            o4 o4Var2 = p4Var.i;
                            boolean z10 = o4Var == o4Var2;
                            o4 o4Var3 = p4Var.c;
                            boolean z11 = o4Var3 == o4Var2;
                            o4 o4Var4 = p4Var.d;
                            y4Var.a(o4Var, f16, z10, o4Var3, f15, z11, o4Var4, f15 + 1.0f, o4Var4 == o4Var2);
                        }
                        y4 y4Var2 = t4Var.c;
                        if (y4Var2 != null) {
                            p4 p4Var2 = t4Var.i;
                            o4 o4Var5 = p4Var2.b;
                            float f17 = p4Var2.e - f13;
                            float f18 = f17 - 1.0f;
                            o4 o4Var6 = p4Var2.i;
                            boolean z12 = o4Var5 == o4Var6;
                            o4 o4Var7 = p4Var2.c;
                            boolean z13 = o4Var7 == o4Var6;
                            o4 o4Var8 = p4Var2.d;
                            y4Var2.a(o4Var5, f18, z12, o4Var7, f17, z13, o4Var8, f17 + 1.0f, o4Var8 == o4Var6);
                        }
                        y4 y4Var3 = t4Var.d;
                        if (y4Var3 != null) {
                            p4 p4Var3 = t4Var.k;
                            o4 o4Var9 = p4Var3.b;
                            float f19 = p4Var3.e - f12;
                            float f20 = f19 - 1.0f;
                            o4 o4Var10 = p4Var3.i;
                            boolean z14 = o4Var9 == o4Var10;
                            o4 o4Var11 = p4Var3.c;
                            boolean z15 = o4Var11 == o4Var10;
                            o4 o4Var12 = p4Var3.d;
                            y4Var3.a(o4Var9, f20, z14, o4Var11, f19, z15, o4Var12, f19 + 1.0f, o4Var12 == o4Var10);
                        }
                        e5Var.g(0, ((s4) t4Var.i.c).c, true);
                        w4 w4Var = e5Var.c;
                        p4 p4Var4 = t4Var.h;
                        o4 o4Var13 = p4Var4.b;
                        r4 r4Var = (r4) o4Var13;
                        float f21 = p4Var4.e - f14;
                        float f22 = f21 - 1.0f;
                        o4 o4Var14 = p4Var4.i;
                        boolean z16 = o4Var13 == o4Var14;
                        o4 o4Var15 = p4Var4.c;
                        r4 r4Var2 = (r4) o4Var15;
                        boolean z17 = o4Var15 == o4Var14;
                        o4 o4Var16 = p4Var4.d;
                        r4 r4Var3 = (r4) o4Var16;
                        float f23 = f21 + 1.0f;
                        boolean z18 = o4Var16 == o4Var14;
                        p4 p4Var5 = t4Var.j;
                        q4 q4Var = (q4) p4Var5.b;
                        float f24 = p4Var5.e - f11;
                        q4 q4Var2 = (q4) p4Var5.c;
                        q4 q4Var3 = (q4) p4Var5.d;
                        w4Var.a = r4Var;
                        w4Var.b = r4Var2;
                        w4Var.c = r4Var3;
                        w4Var.d = f22;
                        w4Var.e = f21;
                        w4Var.f = f23;
                        w4Var.h = z16;
                        w4Var.n = z17;
                        w4Var.r = z18;
                        w4Var.s = q4Var;
                        w4Var.v = q4Var2;
                        w4Var.w = q4Var3;
                        w4Var.x = f24 - 1.0f;
                        w4Var.y = f24;
                        w4Var.A = f24 + 1.0f;
                        w4Var.invalidate();
                        t4Var.u = false;
                        t4Var.b();
                        break;
                    }
                }
                break;
            case 2:
                t4 t4Var2 = this.b;
                t4Var2.o = false;
                t4Var2.a.c.c();
                v1 v1Var = t4Var2.r;
                if (v1Var != null) {
                    v1Var.run();
                    break;
                }
                break;
            default:
                v1 v1Var2 = this.b.s;
                if (v1Var2 != null) {
                    v1Var2.run();
                    break;
                }
                break;
        }
    }
}
