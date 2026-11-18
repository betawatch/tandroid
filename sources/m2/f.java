package m2;

import d3.p;
import e2.i1;
import e2.k1;
import e2.l1;
import h2.l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x2.g0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f {
    public static final p h = new p(4);
    public static final Random i = new Random();
    public g d;
    public String f;
    public final k1 a = new k1();
    public final i1 b = new i1();
    public final HashMap c = new HashMap();
    public l1 e = l1.a;
    public long g = -1;

    public final void a(e eVar) {
        long j3 = eVar.c;
        if (j3 != -1 && eVar.e) {
            this.g = j3;
        }
        this.f = null;
    }

    public final synchronized void b(a aVar) {
        g gVar;
        try {
            String str = this.f;
            if (str != null) {
                e eVar = (e) this.c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.e && (gVar = this.d) != null) {
                    gVar.n(aVar, eVar2.a);
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
    public final e c(int i7, g0 g0Var) {
        long j3;
        long j10;
        long j11;
        HashMap hashMap = this.c;
        e eVar = null;
        long j12 = Long.MAX_VALUE;
        for (e eVar2 : hashMap.values()) {
            long j13 = eVar2.c;
            g0 g0Var2 = eVar2.d;
            if (j13 == -1 && i7 == eVar2.b && g0Var != null) {
                long j14 = g0Var.d;
                f fVar = eVar2.g;
                j3 = -1;
                e eVar3 = (e) fVar.c.get(fVar.f);
                if (eVar3 != null) {
                    j11 = eVar3.c;
                }
                j11 = fVar.g + 1;
                if (j14 >= j11) {
                    eVar2.c = j14;
                }
            } else {
                j3 = -1;
            }
            if (g0Var != null) {
                long j15 = g0Var.d;
                if (j15 != j3) {
                    if (g0Var2 == null) {
                        if (!g0Var.b() && j15 == eVar2.c) {
                            j10 = eVar2.c;
                            if (j10 == j3 || j10 < j12) {
                                eVar = eVar2;
                                j12 = j10;
                            } else if (j10 == j12) {
                                String str = l0.a;
                                if (eVar.d != null && g0Var2 != null) {
                                    eVar = eVar2;
                                }
                            }
                        }
                    } else if (j15 == g0Var2.d && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                        j10 = eVar2.c;
                        if (j10 == j3) {
                        }
                        eVar = eVar2;
                        j12 = j10;
                    }
                }
            }
            if (i7 == eVar2.b) {
                j10 = eVar2.c;
                if (j10 == j3) {
                }
                eVar = eVar2;
                j12 = j10;
            }
        }
        if (eVar != null) {
            return eVar;
        }
        String str2 = (String) h.get();
        e eVar4 = new e(this, str2, i7, g0Var);
        hashMap.put(str2, eVar4);
        return eVar4;
    }

    public final synchronized String d(l1 l1Var, g0 g0Var) {
        return c(l1Var.g(g0Var.a, this.b).c, g0Var).a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        l1 l1Var = aVar.b;
        int i7 = aVar.c;
        g0 g0Var2 = aVar.d;
        boolean p10 = l1Var.p();
        HashMap hashMap = this.c;
        if (p10) {
            String str = this.f;
            if (str != null) {
                e eVar = (e) hashMap.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) hashMap.get(this.f);
        this.f = c(i7, g0Var2).a;
        f(aVar);
        if (g0Var2 != null) {
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (eVar2 != null && eVar2.c == j3 && (g0Var = eVar2.d) != null && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                    return;
                }
                c(i7, new g0(g0Var2.a, j3));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(a aVar) {
        long j3;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            long j10 = g0Var.d;
            if (j10 != -1) {
                e eVar = (e) this.c.get(this.f);
                if (eVar != null) {
                    j3 = eVar.c;
                    if (j3 != -1) {
                        if (j10 < j3) {
                            return;
                        }
                    }
                }
                j3 = this.g + 1;
                if (j10 < j3) {
                }
            }
            e eVar2 = (e) this.c.get(this.f);
            if (eVar2 != null && eVar2.c == -1 && eVar2.b != aVar.c) {
                return;
            }
        }
        e c10 = c(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = c10.a;
        }
        g0 g0Var2 = aVar.d;
        if (g0Var2 != null && g0Var2.b()) {
            g0 g0Var3 = aVar.d;
            e c11 = c(aVar.c, new g0(g0Var3.a, g0Var3.d, g0Var3.b));
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
            this.d.m(aVar, c10.a);
        }
    }

    public final synchronized void g(a aVar, int i7) {
        try {
            this.d.getClass();
            boolean z10 = i7 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    boolean equals = eVar.a.equals(this.f);
                    if (equals) {
                        a(eVar);
                    }
                    if (eVar.e) {
                        if (z10 && equals) {
                            boolean z11 = eVar.f;
                        }
                        this.d.n(aVar, eVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
