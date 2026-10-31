package j2;

import a3.s;
import b2.l1;
import b2.n1;
import b2.o1;
import e2.l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i {
    public static final s h = new s(4);
    public static final Random i = new Random();
    public j d;
    public String f;
    public final n1 a = new n1();
    public final l1 b = new l1();
    public final HashMap c = new HashMap();
    public o1 e = o1.a;
    public long g = -1;

    public final void a(h hVar) {
        long j10 = hVar.c;
        if (j10 != -1 && hVar.e) {
            this.g = j10;
        }
        this.f = null;
    }

    public final synchronized void b(a aVar) {
        j jVar;
        try {
            String str = this.f;
            if (str != null) {
                h hVar = (h) this.c.get(str);
                hVar.getClass();
                a(hVar);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                h hVar2 = (h) it.next();
                it.remove();
                if (hVar2.e && (jVar = this.d) != null) {
                    jVar.p(aVar, hVar2.a);
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
    public final h c(int i10, g0 g0Var) {
        long j10;
        long j11;
        long j12;
        HashMap hashMap = this.c;
        h hVar = null;
        long j13 = Long.MAX_VALUE;
        for (h hVar2 : hashMap.values()) {
            long j14 = hVar2.c;
            g0 g0Var2 = hVar2.d;
            if (j14 == -1 && i10 == hVar2.b && g0Var != null) {
                long j15 = g0Var.d;
                i iVar = hVar2.g;
                j10 = -1;
                h hVar3 = (h) iVar.c.get(iVar.f);
                if (hVar3 != null) {
                    j12 = hVar3.c;
                }
                j12 = iVar.g + 1;
                if (j15 >= j12) {
                    hVar2.c = j15;
                }
            } else {
                j10 = -1;
            }
            if (g0Var != null) {
                long j16 = g0Var.d;
                if (j16 != j10) {
                    if (g0Var2 == null) {
                        if (!g0Var.b() && j16 == hVar2.c) {
                            j11 = hVar2.c;
                            if (j11 == j10 || j11 < j13) {
                                hVar = hVar2;
                                j13 = j11;
                            } else if (j11 == j13) {
                                String str = l0.a;
                                if (hVar.d != null && g0Var2 != null) {
                                    hVar = hVar2;
                                }
                            }
                        }
                    } else if (j16 == g0Var2.d && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                        j11 = hVar2.c;
                        if (j11 == j10) {
                        }
                        hVar = hVar2;
                        j13 = j11;
                    }
                }
            }
            if (i10 == hVar2.b) {
                j11 = hVar2.c;
                if (j11 == j10) {
                }
                hVar = hVar2;
                j13 = j11;
            }
        }
        if (hVar != null) {
            return hVar;
        }
        String str2 = (String) h.get();
        h hVar4 = new h(this, str2, i10, g0Var);
        hashMap.put(str2, hVar4);
        return hVar4;
    }

    public final synchronized String d(o1 o1Var, g0 g0Var) {
        return c(o1Var.g(g0Var.a, this.b).c, g0Var).a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        o1 o1Var = aVar.b;
        int i10 = aVar.c;
        g0 g0Var2 = aVar.d;
        boolean p5 = o1Var.p();
        HashMap hashMap = this.c;
        if (p5) {
            String str = this.f;
            if (str != null) {
                h hVar = (h) hashMap.get(str);
                hVar.getClass();
                a(hVar);
                return;
            }
            return;
        }
        h hVar2 = (h) hashMap.get(this.f);
        this.f = c(i10, g0Var2).a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (hVar2 != null && hVar2.c == j10 && (g0Var = hVar2.d) != null && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                    return;
                }
                c(i10, new g0(g0Var2.a, j10));
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
                h hVar = (h) this.c.get(this.f);
                if (hVar != null) {
                    j10 = hVar.c;
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
            h hVar2 = (h) this.c.get(this.f);
            if (hVar2 != null && hVar2.c == -1 && hVar2.b != aVar.c) {
                return;
            }
        }
        h c10 = c(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = c10.a;
        }
        g0 g0Var2 = aVar.d;
        if (g0Var2 != null && g0Var2.b()) {
            g0 g0Var3 = aVar.d;
            h c11 = c(aVar.c, new g0(g0Var3.a, g0Var3.d, g0Var3.b));
            if (!c11.e) {
                c11.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, l0.h0(0L) + l0.h0(this.b.e));
                this.d.getClass();
            }
        }
        if (!c10.e) {
            c10.e = true;
            this.d.getClass();
        }
        if (c10.a.equals(this.f) && !c10.f) {
            c10.f = true;
            this.d.o(aVar, c10.a);
        }
    }

    public final synchronized void g(a aVar, int i10) {
        try {
            this.d.getClass();
            boolean z10 = i10 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar.a(aVar)) {
                    it.remove();
                    boolean equals = hVar.a.equals(this.f);
                    if (equals) {
                        a(hVar);
                    }
                    if (hVar.e) {
                        if (z10 && equals) {
                            boolean z11 = hVar.f;
                        }
                        this.d.p(aVar, hVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
