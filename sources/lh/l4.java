package lh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;

    public /* synthetic */ l4(r4 r4Var, int i10) {
        this.a = i10;
        this.b = r4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                r4 r4Var = this.b;
                c5 c5Var = r4Var.a;
                if (!r4Var.u) {
                    r4Var.v = false;
                    if (r4Var.o) {
                        r4Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - r4Var.m) / 1000.0f, 0.25f);
                        float f10 = r4Var.n + min;
                        r4Var.n = f10;
                        float f11 = r4Var.j.f(min, f10 > AndroidUtilities.lerp(0.1f, 1.0f, r4Var.t));
                        float f12 = r4Var.k.f(min, r4Var.n > AndroidUtilities.lerp(0.1f, 1.0f, r4Var.t));
                        float f13 = r4Var.i.f(min, r4Var.j.b(0.5f));
                        float f14 = r4Var.h.f(min, r4Var.j.b(0.5f) && r4Var.i.b(0.5f));
                        r4Var.m = currentTimeMillis;
                        if (r4Var.j.c() && r4Var.i.c() && r4Var.h.c() && !r4Var.p) {
                            r4Var.p = true;
                            AndroidUtilities.runOnUIThread(new l4(r4Var, 2));
                        }
                        if (r4Var.j.c() && r4Var.i.c() && r4Var.h.b(0.25f) && !r4Var.q) {
                            r4Var.q = true;
                            AndroidUtilities.runOnUIThread(new l4(r4Var, 3));
                        }
                        w4 w4Var = r4Var.b;
                        if (w4Var != null) {
                            n4 n4Var = r4Var.h;
                            m4 m4Var = n4Var.b;
                            float f15 = n4Var.e - f14;
                            float f16 = f15 - 1.0f;
                            m4 m4Var2 = n4Var.i;
                            boolean z4 = m4Var == m4Var2;
                            m4 m4Var3 = n4Var.c;
                            boolean z10 = m4Var3 == m4Var2;
                            m4 m4Var4 = n4Var.d;
                            w4Var.a(m4Var, f16, z4, m4Var3, f15, z10, m4Var4, f15 + 1.0f, m4Var4 == m4Var2);
                        }
                        w4 w4Var2 = r4Var.c;
                        if (w4Var2 != null) {
                            n4 n4Var2 = r4Var.i;
                            m4 m4Var5 = n4Var2.b;
                            float f17 = n4Var2.e - f13;
                            float f18 = f17 - 1.0f;
                            m4 m4Var6 = n4Var2.i;
                            boolean z11 = m4Var5 == m4Var6;
                            m4 m4Var7 = n4Var2.c;
                            boolean z12 = m4Var7 == m4Var6;
                            m4 m4Var8 = n4Var2.d;
                            w4Var2.a(m4Var5, f18, z11, m4Var7, f17, z12, m4Var8, f17 + 1.0f, m4Var8 == m4Var6);
                        }
                        w4 w4Var3 = r4Var.d;
                        if (w4Var3 != null) {
                            n4 n4Var3 = r4Var.k;
                            m4 m4Var9 = n4Var3.b;
                            float f19 = n4Var3.e - f12;
                            float f20 = f19 - 1.0f;
                            m4 m4Var10 = n4Var3.i;
                            boolean z13 = m4Var9 == m4Var10;
                            m4 m4Var11 = n4Var3.c;
                            boolean z14 = m4Var11 == m4Var10;
                            m4 m4Var12 = n4Var3.d;
                            w4Var3.a(m4Var9, f20, z13, m4Var11, f19, z14, m4Var12, f19 + 1.0f, m4Var12 == m4Var10);
                        }
                        c5Var.g(0, ((q4) r4Var.i.c).c, true);
                        u4 u4Var = c5Var.c;
                        n4 n4Var4 = r4Var.h;
                        m4 m4Var13 = n4Var4.b;
                        p4 p4Var = (p4) m4Var13;
                        float f21 = n4Var4.e - f14;
                        float f22 = f21 - 1.0f;
                        m4 m4Var14 = n4Var4.i;
                        boolean z15 = m4Var13 == m4Var14;
                        m4 m4Var15 = n4Var4.c;
                        p4 p4Var2 = (p4) m4Var15;
                        boolean z16 = m4Var15 == m4Var14;
                        m4 m4Var16 = n4Var4.d;
                        p4 p4Var3 = (p4) m4Var16;
                        float f23 = f21 + 1.0f;
                        boolean z17 = m4Var16 == m4Var14;
                        n4 n4Var5 = r4Var.j;
                        o4 o4Var = (o4) n4Var5.b;
                        float f24 = n4Var5.e - f11;
                        o4 o4Var2 = (o4) n4Var5.c;
                        o4 o4Var3 = (o4) n4Var5.d;
                        u4Var.a = p4Var;
                        u4Var.b = p4Var2;
                        u4Var.c = p4Var3;
                        u4Var.d = f22;
                        u4Var.e = f21;
                        u4Var.f = f23;
                        u4Var.h = z15;
                        u4Var.n = z16;
                        u4Var.r = z17;
                        u4Var.s = o4Var;
                        u4Var.v = o4Var2;
                        u4Var.w = o4Var3;
                        u4Var.x = f24 - 1.0f;
                        u4Var.y = f24;
                        u4Var.B = f24 + 1.0f;
                        u4Var.invalidate();
                        r4Var.u = false;
                        r4Var.b();
                        break;
                    }
                }
                break;
            case 2:
                r4 r4Var2 = this.b;
                r4Var2.o = false;
                r4Var2.a.c.c();
                t1 t1Var = r4Var2.r;
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
