package l2;

import c3.q;
import d2.k1;
import d2.m1;
import d2.n1;
import g2.n0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public static final q h = new q(4);
    public static final Random i = new Random();
    public i d;
    public String f;
    public final m1 a = new m1();
    public final k1 b = new k1();
    public final HashMap c = new HashMap();
    public n1 e = n1.a;
    public long g = -1;

    public final void a(g gVar) {
        long j10 = gVar.c;
        if (j10 != -1 && gVar.e) {
            this.g = j10;
        }
        this.f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f;
            if (str != null) {
                g gVar = (g) this.c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.o(aVar, gVar2.a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g c(int i3, g0 g0Var) {
        long j10;
        long j11;
        long j12;
        HashMap hashMap = this.c;
        g gVar = null;
        long j13 = Long.MAX_VALUE;
        for (g gVar2 : hashMap.values()) {
            long j14 = gVar2.c;
            g0 g0Var2 = gVar2.d;
            if (j14 == -1 && i3 == gVar2.b && g0Var != null) {
                long j15 = g0Var.d;
                h hVar = gVar2.g;
                j10 = -1;
                g gVar3 = (g) hVar.c.get(hVar.f);
                if (gVar3 != null) {
                    j12 = gVar3.c;
                }
                j12 = hVar.g + 1;
                if (j15 >= j12) {
                    gVar2.c = j15;
                }
            } else {
                j10 = -1;
            }
            if (g0Var != null) {
                long j16 = g0Var.d;
                if (j16 != j10) {
                    if (g0Var2 == null) {
                        if (!g0Var.b() && j16 == gVar2.c) {
                            j11 = gVar2.c;
                            if (j11 == j10 || j11 < j13) {
                                gVar = gVar2;
                                j13 = j11;
                            } else if (j11 == j13) {
                                String str = n0.a;
                                if (gVar.d != null && g0Var2 != null) {
                                    gVar = gVar2;
                                }
                            }
                        }
                    } else if (j16 == g0Var2.d && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                        j11 = gVar2.c;
                        if (j11 == j10) {
                        }
                        gVar = gVar2;
                        j13 = j11;
                    }
                }
            }
            if (i3 == gVar2.b) {
                j11 = gVar2.c;
                if (j11 == j10) {
                }
                gVar = gVar2;
                j13 = j11;
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str2 = (String) h.get();
        g gVar4 = new g(this, str2, i3, g0Var);
        hashMap.put(str2, gVar4);
        return gVar4;
    }

    public final synchronized String d(n1 n1Var, g0 g0Var) {
        return c(n1Var.g(g0Var.a, this.b).c, g0Var).a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        n1 n1Var = aVar.b;
        int i3 = aVar.c;
        g0 g0Var2 = aVar.d;
        boolean p10 = n1Var.p();
        HashMap hashMap = this.c;
        if (p10) {
            String str = this.f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f);
        this.f = c(i3, g0Var2).a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (gVar2 != null && gVar2.c == j10 && (g0Var = gVar2.d) != null && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                    return;
                }
                c(i3, new g0(g0Var2.a, j10));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(a aVar) {
        long j10;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            long j11 = g0Var.d;
            if (j11 != -1) {
                g gVar = (g) this.c.get(this.f);
                if (gVar != null) {
                    j10 = gVar.c;
                    if (j10 != -1) {
                        if (j11 < j10) {
                            return;
                        }
                    }
                }
                j10 = this.g + 1;
                if (j11 < j10) {
                }
            }
            g gVar2 = (g) this.c.get(this.f);
            if (gVar2 != null && gVar2.c == -1 && gVar2.b != aVar.c) {
                return;
            }
        }
        g c2 = c(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = c2.a;
        }
        g0 g0Var2 = aVar.d;
        if (g0Var2 != null && g0Var2.b()) {
            g0 g0Var3 = aVar.d;
            g c10 = c(aVar.c, new g0(g0Var3.a, g0Var3.d, g0Var3.b));
            if (!c10.e) {
                c10.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, n0.h0(0L) + n0.h0(this.b.e));
                this.d.getClass();
            }
        }
        if (!c2.e) {
            c2.e = true;
            this.d.getClass();
        }
        if (c2.a.equals(this.f) && !c2.f) {
            c2.f = true;
            this.d.n(aVar, c2.a);
        }
    }

    public final synchronized void g(a aVar, int i3) {
        try {
            this.d.getClass();
            boolean z10 = i3 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    boolean equals = gVar.a.equals(this.f);
                    if (equals) {
                        a(gVar);
                    }
                    if (gVar.e) {
                        if (z10 && equals) {
                            boolean z11 = gVar.f;
                        }
                        this.d.o(aVar, gVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
