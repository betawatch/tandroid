package gh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ p4(v4 v4Var, int i9) {
        this.a = i9;
        this.b = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                v4 v4Var = this.b;
                g5 g5Var = v4Var.a;
                if (!v4Var.u) {
                    v4Var.v = false;
                    if (v4Var.o) {
                        v4Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - v4Var.m) / 1000.0f, 0.25f);
                        float f10 = v4Var.n + min;
                        v4Var.n = f10;
                        float f11 = v4Var.j.f(min, f10 > AndroidUtilities.lerp(0.1f, 1.0f, v4Var.t));
                        float f12 = v4Var.k.f(min, v4Var.n > AndroidUtilities.lerp(0.1f, 1.0f, v4Var.t));
                        float f13 = v4Var.i.f(min, v4Var.j.b(0.5f));
                        float f14 = v4Var.h.f(min, v4Var.j.b(0.5f) && v4Var.i.b(0.5f));
                        v4Var.m = currentTimeMillis;
                        if (v4Var.j.c() && v4Var.i.c() && v4Var.h.c() && !v4Var.p) {
                            v4Var.p = true;
                            AndroidUtilities.runOnUIThread(new p4(v4Var, 2));
                        }
                        if (v4Var.j.c() && v4Var.i.c() && v4Var.h.b(0.25f) && !v4Var.q) {
                            v4Var.q = true;
                            AndroidUtilities.runOnUIThread(new p4(v4Var, 3));
                        }
                        a5 a5Var = v4Var.b;
                        if (a5Var != null) {
                            r4 r4Var = v4Var.h;
                            q4 q4Var = r4Var.b;
                            float f15 = r4Var.e - f14;
                            float f16 = f15 - 1.0f;
                            q4 q4Var2 = r4Var.i;
                            boolean z10 = q4Var == q4Var2;
                            q4 q4Var3 = r4Var.c;
                            boolean z11 = q4Var3 == q4Var2;
                            q4 q4Var4 = r4Var.d;
                            a5Var.a(q4Var, f16, z10, q4Var3, f15, z11, q4Var4, f15 + 1.0f, q4Var4 == q4Var2);
                        }
                        a5 a5Var2 = v4Var.c;
                        if (a5Var2 != null) {
                            r4 r4Var2 = v4Var.i;
                            q4 q4Var5 = r4Var2.b;
                            float f17 = r4Var2.e - f13;
                            float f18 = f17 - 1.0f;
                            q4 q4Var6 = r4Var2.i;
                            boolean z12 = q4Var5 == q4Var6;
                            q4 q4Var7 = r4Var2.c;
                            boolean z13 = q4Var7 == q4Var6;
                            q4 q4Var8 = r4Var2.d;
                            a5Var2.a(q4Var5, f18, z12, q4Var7, f17, z13, q4Var8, f17 + 1.0f, q4Var8 == q4Var6);
                        }
                        a5 a5Var3 = v4Var.d;
                        if (a5Var3 != null) {
                            r4 r4Var3 = v4Var.k;
                            q4 q4Var9 = r4Var3.b;
                            float f19 = r4Var3.e - f12;
                            float f20 = f19 - 1.0f;
                            q4 q4Var10 = r4Var3.i;
                            boolean z14 = q4Var9 == q4Var10;
                            q4 q4Var11 = r4Var3.c;
                            boolean z15 = q4Var11 == q4Var10;
                            q4 q4Var12 = r4Var3.d;
                            a5Var3.a(q4Var9, f20, z14, q4Var11, f19, z15, q4Var12, f19 + 1.0f, q4Var12 == q4Var10);
                        }
                        g5Var.g(0, ((u4) v4Var.i.c).c, true);
                        y4 y4Var = g5Var.c;
                        r4 r4Var4 = v4Var.h;
                        q4 q4Var13 = r4Var4.b;
                        t4 t4Var = (t4) q4Var13;
                        float f21 = r4Var4.e - f14;
                        float f22 = f21 - 1.0f;
                        q4 q4Var14 = r4Var4.i;
                        boolean z16 = q4Var13 == q4Var14;
                        q4 q4Var15 = r4Var4.c;
                        t4 t4Var2 = (t4) q4Var15;
                        boolean z17 = q4Var15 == q4Var14;
                        q4 q4Var16 = r4Var4.d;
                        t4 t4Var3 = (t4) q4Var16;
                        float f23 = f21 + 1.0f;
                        boolean z18 = q4Var16 == q4Var14;
                        r4 r4Var5 = v4Var.j;
                        s4 s4Var = (s4) r4Var5.b;
                        float f24 = r4Var5.e - f11;
                        s4 s4Var2 = (s4) r4Var5.c;
                        s4 s4Var3 = (s4) r4Var5.d;
                        y4Var.a = t4Var;
                        y4Var.b = t4Var2;
                        y4Var.c = t4Var3;
                        y4Var.d = f22;
                        y4Var.e = f21;
                        y4Var.f = f23;
                        y4Var.h = z16;
                        y4Var.n = z17;
                        y4Var.r = z18;
                        y4Var.s = s4Var;
                        y4Var.v = s4Var2;
                        y4Var.w = s4Var3;
                        y4Var.x = f24 - 1.0f;
                        y4Var.y = f24;
                        y4Var.A = f24 + 1.0f;
                        y4Var.invalidate();
                        v4Var.u = false;
                        v4Var.b();
                        break;
                    }
                }
                break;
            case 2:
                v4 v4Var2 = this.b;
                v4Var2.o = false;
                v4Var2.a.c.c();
                v1 v1Var = v4Var2.r;
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
