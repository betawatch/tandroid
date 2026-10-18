package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ l6(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                s6 s6Var = this.b;
                e7 e7Var = s6Var.a;
                if (!s6Var.u) {
                    s6Var.v = false;
                    if (s6Var.o) {
                        s6Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - s6Var.m) / 1000.0f, 0.25f);
                        float f7 = s6Var.n + min;
                        s6Var.n = f7;
                        float f10 = s6Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, s6Var.t));
                        float f11 = s6Var.k.f(min, s6Var.n > AndroidUtilities.lerp(0.1f, 1.0f, s6Var.t));
                        float f12 = s6Var.i.f(min, s6Var.j.b(0.5f));
                        float f13 = s6Var.h.f(min, s6Var.j.b(0.5f) && s6Var.i.b(0.5f));
                        s6Var.m = currentTimeMillis;
                        if (s6Var.j.c() && s6Var.i.c() && s6Var.h.c() && !s6Var.p) {
                            s6Var.p = true;
                            AndroidUtilities.runOnUIThread(new l6(s6Var, 2));
                        }
                        if (s6Var.j.c() && s6Var.i.c() && s6Var.h.b(0.25f) && !s6Var.q) {
                            s6Var.q = true;
                            AndroidUtilities.runOnUIThread(new l6(s6Var, 3));
                        }
                        x6 x6Var = s6Var.b;
                        if (x6Var != null) {
                            o6 o6Var = s6Var.h;
                            n6 n6Var = o6Var.b;
                            float f14 = o6Var.e - f13;
                            float f15 = f14 - 1.0f;
                            n6 n6Var2 = o6Var.i;
                            boolean z10 = n6Var == n6Var2;
                            n6 n6Var3 = o6Var.c;
                            boolean z11 = n6Var3 == n6Var2;
                            n6 n6Var4 = o6Var.d;
                            x6Var.a(n6Var, f15, z10, n6Var3, f14, z11, n6Var4, f14 + 1.0f, n6Var4 == n6Var2);
                        }
                        x6 x6Var2 = s6Var.c;
                        if (x6Var2 != null) {
                            o6 o6Var2 = s6Var.i;
                            n6 n6Var5 = o6Var2.b;
                            float f16 = o6Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            n6 n6Var6 = o6Var2.i;
                            boolean z12 = n6Var5 == n6Var6;
                            n6 n6Var7 = o6Var2.c;
                            boolean z13 = n6Var7 == n6Var6;
                            n6 n6Var8 = o6Var2.d;
                            x6Var2.a(n6Var5, f17, z12, n6Var7, f16, z13, n6Var8, f16 + 1.0f, n6Var8 == n6Var6);
                        }
                        x6 x6Var3 = s6Var.d;
                        if (x6Var3 != null) {
                            o6 o6Var3 = s6Var.k;
                            n6 n6Var9 = o6Var3.b;
                            float f18 = o6Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            n6 n6Var10 = o6Var3.i;
                            boolean z14 = n6Var9 == n6Var10;
                            n6 n6Var11 = o6Var3.c;
                            boolean z15 = n6Var11 == n6Var10;
                            n6 n6Var12 = o6Var3.d;
                            x6Var3.a(n6Var9, f19, z14, n6Var11, f18, z15, n6Var12, f18 + 1.0f, n6Var12 == n6Var10);
                        }
                        e7Var.g(0, ((r6) s6Var.i.c).c, true);
                        v6 v6Var = e7Var.c;
                        o6 o6Var4 = s6Var.h;
                        n6 n6Var13 = o6Var4.b;
                        q6 q6Var = (q6) n6Var13;
                        float f20 = o6Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        n6 n6Var14 = o6Var4.i;
                        boolean z16 = n6Var13 == n6Var14;
                        n6 n6Var15 = o6Var4.c;
                        q6 q6Var2 = (q6) n6Var15;
                        boolean z17 = n6Var15 == n6Var14;
                        n6 n6Var16 = o6Var4.d;
                        q6 q6Var3 = (q6) n6Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = n6Var16 == n6Var14;
                        o6 o6Var5 = s6Var.j;
                        p6 p6Var = (p6) o6Var5.b;
                        float f23 = o6Var5.e - f10;
                        p6 p6Var2 = (p6) o6Var5.c;
                        p6 p6Var3 = (p6) o6Var5.d;
                        v6Var.a = q6Var;
                        v6Var.b = q6Var2;
                        v6Var.c = q6Var3;
                        v6Var.d = f21;
                        v6Var.e = f20;
                        v6Var.f = f22;
                        v6Var.h = z16;
                        v6Var.n = z17;
                        v6Var.r = z18;
                        v6Var.s = p6Var;
                        v6Var.v = p6Var2;
                        v6Var.w = p6Var3;
                        v6Var.x = f23 - 1.0f;
                        v6Var.y = f23;
                        v6Var.E = f23 + 1.0f;
                        v6Var.invalidate();
                        s6Var.u = false;
                        s6Var.b();
                        break;
                    }
                }
                break;
            case 2:
                s6 s6Var2 = this.b;
                s6Var2.o = false;
                s6Var2.a.c.c();
                b2 b2Var = s6Var2.r;
                if (b2Var != null) {
                    b2Var.run();
                    break;
                }
                break;
            default:
                b2 b2Var2 = this.b.s;
                if (b2Var2 != null) {
                    b2Var2.run();
                    break;
                }
                break;
        }
    }
}
