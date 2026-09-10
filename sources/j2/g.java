package j2;

import a3.s;
import b2.h1;
import b2.j1;
import b2.k1;
import e2.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.g0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g {
    public static final s h = new s(4);
    public static final Random i = new Random();
    public i d;
    public String f;
    public final j1 a = new j1();
    public final h1 b = new h1();
    public final HashMap c = new HashMap();
    public k1 e = k1.a;
    public long g = -1;

    public final void a(f fVar) {
        long j3 = fVar.c;
        if (j3 != -1) {
            this.g = j3;
        }
        this.f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
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
                if (fVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, fVar2.a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f c(int i10, g0 g0Var) {
        long j3;
        long j10;
        long j11;
        HashMap hashMap = this.c;
        f fVar = null;
        long j12 = Long.MAX_VALUE;
        for (f fVar2 : hashMap.values()) {
            long j13 = fVar2.c;
            g0 g0Var2 = fVar2.d;
            if (j13 == -1 && i10 == fVar2.b && g0Var != null) {
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
                if (g0Var2 == null) {
                    if (!g0Var.b() && j15 == fVar2.c) {
                        j10 = fVar2.c;
                        if (j10 == j3) {
                        }
                        fVar = fVar2;
                        j12 = j10;
                    }
                } else if (j15 == g0Var2.d && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                    j10 = fVar2.c;
                    if (j10 == j3) {
                    }
                    fVar = fVar2;
                    j12 = j10;
                }
            } else if (i10 == fVar2.b) {
                j10 = fVar2.c;
                if (j10 == j3 || j10 < j12) {
                    fVar = fVar2;
                    j12 = j10;
                } else if (j10 == j12) {
                    String str = d0.a;
                    if (fVar.d != null && g0Var2 != null) {
                        fVar = fVar2;
                    }
                }
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

    public final synchronized String d(k1 k1Var, g0 g0Var) {
        return c(k1Var.g(g0Var.a, this.b).c, g0Var).a;
    }

    public final void e(a aVar) {
        g0 g0Var;
        k1 k1Var = aVar.b;
        int i10 = aVar.c;
        g0 g0Var2 = aVar.d;
        boolean p5 = k1Var.p();
        HashMap hashMap = this.c;
        if (p5) {
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
            long j3 = g0Var2.d;
            if (g0Var2.b()) {
                if (fVar2 != null && fVar2.c == j3 && (g0Var = fVar2.d) != null && g0Var.b == g0Var2.b && g0Var.c == g0Var2.c) {
                    return;
                }
                c(i10, new g0(g0Var2.a, j3));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b2, B:41:0x00b6, B:42:0x00bd, B:44:0x00c7, B:46:0x00cb), top: B:2:0x0001 }] */
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
            f fVar = (f) this.c.get(this.f);
            if (fVar != null) {
                j3 = fVar.c;
                if (j3 != -1) {
                    if (j10 >= j3) {
                        return;
                    }
                    f fVar2 = (f) this.c.get(this.f);
                    if (fVar2 != null && fVar2.c == -1 && fVar2.b != aVar.c) {
                        return;
                    }
                }
            }
            j3 = this.g + 1;
            if (j10 >= j3) {
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
                Math.max(0L, d0.e0(0L) + d0.e0(this.b.e));
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
                    if (fVar.e) {
                        boolean equals = fVar.a.equals(this.f);
                        if (z10 && equals) {
                            boolean z11 = fVar.f;
                        }
                        if (equals) {
                            a(fVar);
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
