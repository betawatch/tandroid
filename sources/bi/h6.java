package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ h6(o6 o6Var, int i10) {
        this.a = i10;
        this.b = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                o6 o6Var = this.b;
                b7 b7Var = o6Var.a;
                if (!o6Var.u) {
                    o6Var.v = false;
                    if (o6Var.o) {
                        o6Var.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - o6Var.m) / 1000.0f, 0.25f);
                        float f7 = o6Var.n + min;
                        o6Var.n = f7;
                        float f10 = o6Var.j.f(min, f7 > AndroidUtilities.lerp(0.1f, 1.0f, o6Var.t));
                        float f11 = o6Var.k.f(min, o6Var.n > AndroidUtilities.lerp(0.1f, 1.0f, o6Var.t));
                        float f12 = o6Var.i.f(min, o6Var.j.b(0.5f));
                        float f13 = o6Var.h.f(min, o6Var.j.b(0.5f) && o6Var.i.b(0.5f));
                        o6Var.m = currentTimeMillis;
                        if (o6Var.j.c() && o6Var.i.c() && o6Var.h.c() && !o6Var.p) {
                            o6Var.p = true;
                            AndroidUtilities.runOnUIThread(new h6(o6Var, 2));
                        }
                        if (o6Var.j.c() && o6Var.i.c() && o6Var.h.b(0.25f) && !o6Var.q) {
                            o6Var.q = true;
                            AndroidUtilities.runOnUIThread(new h6(o6Var, 3));
                        }
                        t6 t6Var = o6Var.b;
                        if (t6Var != null) {
                            k6 k6Var = o6Var.h;
                            j6 j6Var = k6Var.b;
                            float f14 = k6Var.e - f13;
                            float f15 = f14 - 1.0f;
                            j6 j6Var2 = k6Var.i;
                            boolean z10 = j6Var == j6Var2;
                            j6 j6Var3 = k6Var.c;
                            boolean z11 = j6Var3 == j6Var2;
                            j6 j6Var4 = k6Var.d;
                            t6Var.a(j6Var, f15, z10, j6Var3, f14, z11, j6Var4, f14 + 1.0f, j6Var4 == j6Var2);
                        }
                        t6 t6Var2 = o6Var.c;
                        if (t6Var2 != null) {
                            k6 k6Var2 = o6Var.i;
                            j6 j6Var5 = k6Var2.b;
                            float f16 = k6Var2.e - f12;
                            float f17 = f16 - 1.0f;
                            j6 j6Var6 = k6Var2.i;
                            boolean z12 = j6Var5 == j6Var6;
                            j6 j6Var7 = k6Var2.c;
                            boolean z13 = j6Var7 == j6Var6;
                            j6 j6Var8 = k6Var2.d;
                            t6Var2.a(j6Var5, f17, z12, j6Var7, f16, z13, j6Var8, f16 + 1.0f, j6Var8 == j6Var6);
                        }
                        t6 t6Var3 = o6Var.d;
                        if (t6Var3 != null) {
                            k6 k6Var3 = o6Var.k;
                            j6 j6Var9 = k6Var3.b;
                            float f18 = k6Var3.e - f11;
                            float f19 = f18 - 1.0f;
                            j6 j6Var10 = k6Var3.i;
                            boolean z14 = j6Var9 == j6Var10;
                            j6 j6Var11 = k6Var3.c;
                            boolean z15 = j6Var11 == j6Var10;
                            j6 j6Var12 = k6Var3.d;
                            t6Var3.a(j6Var9, f19, z14, j6Var11, f18, z15, j6Var12, f18 + 1.0f, j6Var12 == j6Var10);
                        }
                        b7Var.g(0, ((n6) o6Var.i.c).c, true);
                        r6 r6Var = b7Var.c;
                        k6 k6Var4 = o6Var.h;
                        j6 j6Var13 = k6Var4.b;
                        m6 m6Var = (m6) j6Var13;
                        float f20 = k6Var4.e - f13;
                        float f21 = f20 - 1.0f;
                        j6 j6Var14 = k6Var4.i;
                        boolean z16 = j6Var13 == j6Var14;
                        j6 j6Var15 = k6Var4.c;
                        m6 m6Var2 = (m6) j6Var15;
                        boolean z17 = j6Var15 == j6Var14;
                        j6 j6Var16 = k6Var4.d;
                        m6 m6Var3 = (m6) j6Var16;
                        float f22 = f20 + 1.0f;
                        boolean z18 = j6Var16 == j6Var14;
                        k6 k6Var5 = o6Var.j;
                        l6 l6Var = (l6) k6Var5.b;
                        float f23 = k6Var5.e - f10;
                        l6 l6Var2 = (l6) k6Var5.c;
                        l6 l6Var3 = (l6) k6Var5.d;
                        r6Var.a = m6Var;
                        r6Var.b = m6Var2;
                        r6Var.c = m6Var3;
                        r6Var.d = f21;
                        r6Var.e = f20;
                        r6Var.f = f22;
                        r6Var.h = z16;
                        r6Var.n = z17;
                        r6Var.r = z18;
                        r6Var.s = l6Var;
                        r6Var.v = l6Var2;
                        r6Var.w = l6Var3;
                        r6Var.x = f23 - 1.0f;
                        r6Var.y = f23;
                        r6Var.E = f23 + 1.0f;
                        r6Var.invalidate();
                        o6Var.u = false;
                        o6Var.b();
                        break;
                    }
                }
                break;
            case 2:
                o6 o6Var2 = this.b;
                o6Var2.o = false;
                o6Var2.a.c.c();
                a2 a2Var = o6Var2.r;
                if (a2Var != null) {
                    a2Var.run();
                    break;
                }
                break;
            default:
                a2 a2Var2 = this.b.s;
                if (a2Var2 != null) {
                    a2Var2.run();
                    break;
                }
                break;
        }
    }
}
