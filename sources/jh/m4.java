package jh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;

    public /* synthetic */ m4(s4 s4Var, int i10) {
        this.a = i10;
        this.b = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                s4 s4Var = this.b;
                d5 d5Var = s4Var.a;
                if (!s4Var.u) {
                    s4Var.v = false;
                    if (s4Var.o) {
                        s4Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - s4Var.m) / 1000.0f, 0.25f);
                        float f9 = s4Var.n + min;
                        s4Var.n = f9;
                        float f10 = s4Var.j.f(min, f9 > AndroidUtilities.lerp(0.1f, 1.0f, s4Var.t));
                        float f11 = s4Var.k.f(min, s4Var.n > AndroidUtilities.lerp(0.1f, 1.0f, s4Var.t));
                        float f12 = s4Var.i.f(min, s4Var.j.b(0.5f));
                        float f13 = s4Var.h.f(min, s4Var.j.b(0.5f) && s4Var.i.b(0.5f));
                        s4Var.m = currentTimeMillis;
                        if (s4Var.j.c() && s4Var.i.c() && s4Var.h.c() && !s4Var.p) {
                            s4Var.p = true;
                            AndroidUtilities.runOnUIThread(new m4(s4Var, 2));
                        }
                        if (s4Var.j.c() && s4Var.i.c() && s4Var.h.b(0.25f) && !s4Var.q) {
                            s4Var.q = true;
                            AndroidUtilities.runOnUIThread(new m4(s4Var, 3));
                        }
                        x4 x4Var = s4Var.b;
                        if (x4Var != null) {
                            o4 o4Var = s4Var.h;
                            n4 n4Var = o4Var.b;
                            float f14 = o4Var.e - f13;
                            float f15 = f14 - 1.0f;
                            n4 n4Var2 = o4Var.i;
                            boolean z10 = n4Var == n4Var2;
                            n4 n4Var3 = o4Var.c;
                            boolean z11 = n4Var3 == n4Var2;
                            n4 n4Var4 = o4Var.d;
                            x4Var.a(n4Var, f15, z10, n4Var3, f14, z11, n4Var4, f14 + 1.0f, n4Var4 == n4Var2);
                        }
                        x4 x4Var2 = s4Var.c;
                        if (x4Var2 != null) {
                            o4 o4Var2 = s4Var.i;
                            n4 n4Var5 = o4Var2.b;
                            float f16 = o4Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            n4 n4Var6 = o4Var2.i;
                            boolean z12 = n4Var5 == n4Var6;
                            n4 n4Var7 = o4Var2.c;
                            boolean z13 = n4Var7 == n4Var6;
                            n4 n4Var8 = o4Var2.d;
                            x4Var2.a(n4Var5, f17, z12, n4Var7, f16, z13, n4Var8, f16 + 1.0f, n4Var8 == n4Var6);
                        }
                        x4 x4Var3 = s4Var.d;
                        if (x4Var3 != null) {
                            o4 o4Var3 = s4Var.k;
                            n4 n4Var9 = o4Var3.b;
                            float f18 = o4Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            n4 n4Var10 = o4Var3.i;
                            boolean z14 = n4Var9 == n4Var10;
                            n4 n4Var11 = o4Var3.c;
                            boolean z15 = n4Var11 == n4Var10;
                            n4 n4Var12 = o4Var3.d;
                            x4Var3.a(n4Var9, f19, z14, n4Var11, f18, z15, n4Var12, f18 + 1.0f, n4Var12 == n4Var10);
                        }
                        d5Var.g(0, ((r4) s4Var.i.c).c, true);
                        v4 v4Var = d5Var.c;
                        o4 o4Var4 = s4Var.h;
                        n4 n4Var13 = o4Var4.b;
                        q4 q4Var = (q4) n4Var13;
                        float f20 = o4Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        n4 n4Var14 = o4Var4.i;
                        boolean z16 = n4Var13 == n4Var14;
                        n4 n4Var15 = o4Var4.c;
                        q4 q4Var2 = (q4) n4Var15;
                        boolean z17 = n4Var15 == n4Var14;
                        n4 n4Var16 = o4Var4.d;
                        q4 q4Var3 = (q4) n4Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = n4Var16 == n4Var14;
                        o4 o4Var5 = s4Var.j;
                        p4 p4Var = (p4) o4Var5.b;
                        float f23 = o4Var5.e - f10;
                        p4 p4Var2 = (p4) o4Var5.c;
                        p4 p4Var3 = (p4) o4Var5.d;
                        v4Var.a = q4Var;
                        v4Var.b = q4Var2;
                        v4Var.c = q4Var3;
                        v4Var.d = f21;
                        v4Var.e = f20;
                        v4Var.f = f22;
                        v4Var.h = z16;
                        v4Var.n = z17;
                        v4Var.r = z18;
                        v4Var.s = p4Var;
                        v4Var.v = p4Var2;
                        v4Var.w = p4Var3;
                        v4Var.x = f23 - 1.0f;
                        v4Var.y = f23;
                        v4Var.A = f23 + 1.0f;
                        v4Var.invalidate();
                        s4Var.u = false;
                        s4Var.b();
                        break;
                    }
                }
                break;
            case 2:
                s4 s4Var2 = this.b;
                s4Var2.o = false;
                s4Var2.a.c.c();
                t1 t1Var = s4Var2.r;
                if (t1Var != null) {
                    t1Var.run();
                    break;
                }
                break;
            default:
                t1 t1Var2 = this.b.s;
                if (t1Var2 != null) {
                    t1Var2.run();
                    break;
                }
                break;
        }
    }
}
