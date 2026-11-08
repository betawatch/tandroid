package m2;

import d3.q;
import e2.i1;
import e2.k1;
import e2.l1;
import h2.m0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x2.g0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g {
    public static final q h = new q(4);
    public static final Random i = new Random();
    public h d;
    public String f;
    public final k1 a = new k1();
    public final i1 b = new i1();
    public final HashMap c = new HashMap();
    public l1 e = l1.a;
    public long g = -1;

    public final void a(f fVar) {
        long j3 = fVar.c;
        if (j3 != -1 && fVar.e) {
            this.g = j3;
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
                    hVar.n(aVar, fVar2.a);
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
    public final f c(int i7, g0 g0Var) {
        long j3;
        long j10;
        long j11;
        HashMap hashMap = this.c;
        f fVar = null;
        long j12 = Long.MAX_VALUE;
        for (f fVar2 : hashMap.values()) {
            long j13 = fVar2.c;
            g0 g0Var2 = fVar2.d;
            if (j13 == -1 && i7 == fVar2.b && g0Var != null) {
                long j14 = g0Var.d;
                g gVar = fVar2.g;
                j3 = -1;
                f fVar3 = (f) gVar.c.get(gVar.f);
                if (fVar3 != null) {
                    j11 = fVar3.c;
                }
                j11 = gVar.g + 1;
                if (j14 >= j11) {
                    fVar2.c = j14;
                }
            } else {
                j3 = -1;
            }
            if (g0Var != null) {
                long j15 = g0Var.d;
                if (j15 != j3) {
                    if (g0Var2 == null) {
                        if (!g0Var.b() && j15 == fVar2.c) {
                            j10 = fVar2.c;
                            if (j10 == j3 || j10 < j12) {
                                fVar = fVar2;
                                j12 = j10;
                            } else if (j10 == j12) {
                                String str = m0.a;
                                if (fVar.d != null && g0Var2 != null) {
                                    fVar = fVar2;
                                }
                            }
                        }
                    } else if (j15 == g0Var2.d && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                        j10 = fVar2.c;
                        if (j10 == j3) {
                        }
                        fVar = fVar2;
                        j12 = j10;
                    }
                }
            }
            if (i7 == fVar2.b) {
                j10 = fVar2.c;
                if (j10 == j3) {
                }
                fVar = fVar2;
                j12 = j10;
            }
        }
        if (fVar != null) {
            return fVar;
        }
        String str2 = (String) h.get();
        f fVar4 = new f(this, str2, i7, g0Var);
        hashMap.put(str2, fVar4);
        return fVar4;
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
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f);
        this.f = c(i7, g0Var2).a;
        f(aVar);
        if (g0Var2 != null) {
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (fVar2 != null && fVar2.c == j3 && (g0Var = fVar2.d) != null && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
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
                f fVar = (f) this.c.get(this.f);
                if (fVar != null) {
                    j3 = fVar.c;
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
                Math.max(0L, m0.h0(0L) + m0.h0(this.b.e));
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
            boolean z9 = i7 == 0;
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
                        if (z9 && equals) {
                            boolean z10 = fVar.f;
                        }
                        this.d.n(aVar, fVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
