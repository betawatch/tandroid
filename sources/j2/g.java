package j2;

import a3.s;
import b2.m1;
import b2.o1;
import b2.p1;
import e2.n0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g {
    public static final s h = new s(4);
    public static final Random i = new Random();
    public h d;
    public String f;
    public final o1 a = new o1();
    public final m1 b = new m1();
    public final HashMap c = new HashMap();
    public p1 e = p1.a;
    public long g = -1;

    public final void a(f fVar) {
        long j10 = fVar.c;
        if (j10 != -1 && fVar.e) {
            this.g = j10;
        }
        this.f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f;
            if (str != null) {
                f fVar = (f) this.c.get(str);
                fVar.getClass();
                a(fVar);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                it.remove();
                if (fVar2.e && (hVar = this.d) != null) {
                    hVar.t(aVar, fVar2.a);
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
    public final f c(int i10, g0 g0Var) {
        long j10;
        long j11;
        long j12;
        HashMap hashMap = this.c;
        f fVar = null;
        long j13 = Long.MAX_VALUE;
        for (f fVar2 : hashMap.values()) {
            long j14 = fVar2.c;
            g0 g0Var2 = fVar2.d;
            if (j14 == -1 && i10 == fVar2.b && g0Var != null) {
                long j15 = g0Var.d;
                g gVar = fVar2.g;
                j10 = -1;
                f fVar3 = (f) gVar.c.get(gVar.f);
                if (fVar3 != null) {
                    j12 = fVar3.c;
                }
                j12 = gVar.g + 1;
                if (j15 >= j12) {
                    fVar2.c = j15;
                }
            } else {
                j10 = -1;
            }
            if (g0Var != null) {
                long j16 = g0Var.d;
                if (j16 != j10) {
                    if (g0Var2 == null) {
                        if (!g0Var.b() && j16 == fVar2.c) {
                            j11 = fVar2.c;
                            if (j11 == j10 || j11 < j13) {
                                fVar = fVar2;
                                j13 = j11;
                            } else if (j11 == j13) {
                                String str = n0.a;
                                if (fVar.d != null && g0Var2 != null) {
                                    fVar = fVar2;
                                }
                            }
                        }
                    } else if (j16 == g0Var2.d && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                        j11 = fVar2.c;
                        if (j11 == j10) {
                        }
                        fVar = fVar2;
                        j13 = j11;
                    }
                }
            }
            if (i10 == fVar2.b) {
                j11 = fVar2.c;
                if (j11 == j10) {
                }
                fVar = fVar2;
                j13 = j11;
            }
        }
        if (fVar != null) {
            return fVar;
        }
        String str2 = (String) h.get();
        f fVar4 = new f(this, str2, i10, g0Var);
        hashMap.put(str2, fVar4);
        return fVar4;
    }

    public final synchronized String d(p1 p1Var, g0 g0Var) {
        return c(p1Var.g(g0Var.a, this.b).c, g0Var).a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        p1 p1Var = aVar.b;
        int i10 = aVar.c;
        g0 g0Var2 = aVar.d;
        boolean p10 = p1Var.p();
        HashMap hashMap = this.c;
        if (p10) {
            String str = this.f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f);
        this.f = c(i10, g0Var2).a;
        f(aVar);
        if (g0Var2 != null) {
            long j10 = g0Var2.d;
            if (g0Var2.b()) {
                if (fVar2 != null && fVar2.c == j10 && (g0Var = fVar2.d) != null && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
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
                f fVar = (f) this.c.get(this.f);
                if (fVar != null) {
                    j10 = fVar.c;
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
            f fVar2 = (f) this.c.get(this.f);
            if (fVar2 != null && fVar2.c == -1 && fVar2.b != aVar.c) {
                return;
            }
        }
        f c10 = c(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = c10.a;
        }
        g0 g0Var2 = aVar.d;
        if (g0Var2 != null && g0Var2.b()) {
            g0 g0Var3 = aVar.d;
            f c11 = c(aVar.c, new g0(g0Var3.a, g0Var3.d, g0Var3.b));
            if (!c11.e) {
                c11.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, n0.h0(0L) + n0.h0(this.b.e));
                this.d.getClass();
            }
        }
        if (!c10.e) {
            c10.e = true;
            this.d.getClass();
        }
        if (c10.a.equals(this.f) && !c10.f) {
            c10.f = true;
            this.d.s(aVar, c10.a);
        }
    }

    public final synchronized void g(a aVar, int i10) {
        try {
            this.d.getClass();
            boolean z10 = i10 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.a(aVar)) {
                    it.remove();
                    boolean equals = fVar.a.equals(this.f);
                    if (equals) {
                        a(fVar);
                    }
                    if (fVar.e) {
                        if (z10 && equals) {
                            boolean z11 = fVar.f;
                        }
                        this.d.t(aVar, fVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
