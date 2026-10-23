package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ m6(t6 t6Var, int i10) {
        this.a = i10;
        this.b = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                t6 t6Var = this.b;
                f7 f7Var = t6Var.a;
                if (!t6Var.u) {
                    t6Var.v = false;
                    if (t6Var.o) {
                        t6Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - t6Var.m) / 1000.0f, 0.25f);
                        float f7 = t6Var.n + min;
                        t6Var.n = f7;
                        float f10 = t6Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, t6Var.t));
                        float f11 = t6Var.k.f(min, t6Var.n > AndroidUtilities.lerp(0.1f, 1.0f, t6Var.t));
                        float f12 = t6Var.i.f(min, t6Var.j.b(0.5f));
                        float f13 = t6Var.h.f(min, t6Var.j.b(0.5f) && t6Var.i.b(0.5f));
                        t6Var.m = currentTimeMillis;
                        if (t6Var.j.c() && t6Var.i.c() && t6Var.h.c() && !t6Var.p) {
                            t6Var.p = true;
                            AndroidUtilities.runOnUIThread(new m6(t6Var, 2));
                        }
                        if (t6Var.j.c() && t6Var.i.c() && t6Var.h.b(0.25f) && !t6Var.q) {
                            t6Var.q = true;
                            AndroidUtilities.runOnUIThread(new m6(t6Var, 3));
                        }
                        y6 y6Var = t6Var.b;
                        if (y6Var != null) {
                            p6 p6Var = t6Var.h;
                            o6 o6Var = p6Var.b;
                            float f14 = p6Var.e - f13;
                            float f15 = f14 - 1.0f;
                            o6 o6Var2 = p6Var.i;
                            boolean z10 = o6Var == o6Var2;
                            o6 o6Var3 = p6Var.c;
                            boolean z11 = o6Var3 == o6Var2;
                            o6 o6Var4 = p6Var.d;
                            y6Var.a(o6Var, f15, z10, o6Var3, f14, z11, o6Var4, f14 + 1.0f, o6Var4 == o6Var2);
                        }
                        y6 y6Var2 = t6Var.c;
                        if (y6Var2 != null) {
                            p6 p6Var2 = t6Var.i;
                            o6 o6Var5 = p6Var2.b;
                            float f16 = p6Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            o6 o6Var6 = p6Var2.i;
                            boolean z12 = o6Var5 == o6Var6;
                            o6 o6Var7 = p6Var2.c;
                            boolean z13 = o6Var7 == o6Var6;
                            o6 o6Var8 = p6Var2.d;
                            y6Var2.a(o6Var5, f17, z12, o6Var7, f16, z13, o6Var8, f16 + 1.0f, o6Var8 == o6Var6);
                        }
                        y6 y6Var3 = t6Var.d;
                        if (y6Var3 != null) {
                            p6 p6Var3 = t6Var.k;
                            o6 o6Var9 = p6Var3.b;
                            float f18 = p6Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            o6 o6Var10 = p6Var3.i;
                            boolean z14 = o6Var9 == o6Var10;
                            o6 o6Var11 = p6Var3.c;
                            boolean z15 = o6Var11 == o6Var10;
                            o6 o6Var12 = p6Var3.d;
                            y6Var3.a(o6Var9, f19, z14, o6Var11, f18, z15, o6Var12, f18 + 1.0f, o6Var12 == o6Var10);
                        }
                        f7Var.g(0, ((s6) t6Var.i.c).c, true);
                        w6 w6Var = f7Var.c;
                        p6 p6Var4 = t6Var.h;
                        o6 o6Var13 = p6Var4.b;
                        r6 r6Var = (r6) o6Var13;
                        float f20 = p6Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        o6 o6Var14 = p6Var4.i;
                        boolean z16 = o6Var13 == o6Var14;
                        o6 o6Var15 = p6Var4.c;
                        r6 r6Var2 = (r6) o6Var15;
                        boolean z17 = o6Var15 == o6Var14;
                        o6 o6Var16 = p6Var4.d;
                        r6 r6Var3 = (r6) o6Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = o6Var16 == o6Var14;
                        p6 p6Var5 = t6Var.j;
                        q6 q6Var = (q6) p6Var5.b;
                        float f23 = p6Var5.e - f10;
                        q6 q6Var2 = (q6) p6Var5.c;
                        q6 q6Var3 = (q6) p6Var5.d;
                        w6Var.a = r6Var;
                        w6Var.b = r6Var2;
                        w6Var.c = r6Var3;
                        w6Var.d = f21;
                        w6Var.e = f20;
                        w6Var.f = f22;
                        w6Var.h = z16;
                        w6Var.n = z17;
                        w6Var.r = z18;
                        w6Var.s = q6Var;
                        w6Var.v = q6Var2;
                        w6Var.w = q6Var3;
                        w6Var.x = f23 - 1.0f;
                        w6Var.y = f23;
                        w6Var.E = f23 + 1.0f;
                        w6Var.invalidate();
                        t6Var.u = false;
                        t6Var.b();
                        break;
                    }
                }
                break;
            case 2:
                t6 t6Var2 = this.b;
                t6Var2.o = false;
                t6Var2.a.c.c();
                d2 d2Var = t6Var2.r;
                if (d2Var != null) {
                    d2Var.run();
                    break;
                }
                break;
            default:
                d2 d2Var2 = this.b.s;
                if (d2Var2 != null) {
                    d2Var2.run();
                    break;
                }
                break;
        }
    }
}
