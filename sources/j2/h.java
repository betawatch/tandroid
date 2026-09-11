package j2;

import a3.r;
import b2.h1;
import b2.j1;
import b2.k1;
import e2.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u2.f0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h {
    public static final r h = new r(4);
    public static final Random i = new Random();
    public i d;
    public String f;
    public final j1 a = new j1();
    public final h1 b = new h1();
    public final HashMap c = new HashMap();
    public k1 e = k1.a;
    public long g = -1;

    public final void a(g gVar) {
        long j3 = gVar.c;
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
                g gVar = (g) this.c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.e && (iVar = this.d) != null) {
                    iVar.t(aVar, gVar2.a);
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
    public final g c(int i10, f0 f0Var) {
        long j3;
        long j10;
        long j11;
        HashMap hashMap = this.c;
        g gVar = null;
        long j12 = Long.MAX_VALUE;
        for (g gVar2 : hashMap.values()) {
            long j13 = gVar2.c;
            f0 f0Var2 = gVar2.d;
            if (j13 == -1 && i10 == gVar2.b && f0Var != null) {
                long j14 = f0Var.d;
                h hVar = gVar2.g;
                j3 = -1;
                g gVar3 = (g) hVar.c.get(hVar.f);
                if (gVar3 != null) {
                    j11 = gVar3.c;
                }
                j11 = hVar.g + 1;
                if (j14 >= j11) {
                    gVar2.c = j14;
                }
            } else {
                j3 = -1;
            }
            if (f0Var != null) {
                long j15 = f0Var.d;
                if (f0Var2 == null) {
                    if (!f0Var.b() && j15 == gVar2.c) {
                        j10 = gVar2.c;
                        if (j10 == j3) {
                        }
                        gVar = gVar2;
                        j12 = j10;
                    }
                } else if (j15 == f0Var2.d && f0Var.b == f0Var2.b && f0Var.c == f0Var2.c) {
                    j10 = gVar2.c;
                    if (j10 == j3) {
                    }
                    gVar = gVar2;
                    j12 = j10;
                }
            } else if (i10 == gVar2.b) {
                j10 = gVar2.c;
                if (j10 == j3 || j10 < j12) {
                    gVar = gVar2;
                    j12 = j10;
                } else if (j10 == j12) {
                    String str = d0.a;
                    if (gVar.d != null && f0Var2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str2 = (String) h.get();
        g gVar4 = new g(this, str2, i10, f0Var);
        hashMap.put(str2, gVar4);
        return gVar4;
    }

    public final synchronized String d(k1 k1Var, f0 f0Var) {
        return c(k1Var.g(f0Var.a, this.b).c, f0Var).a;
    }

    public final void e(a aVar) {
        f0 f0Var;
        k1 k1Var = aVar.b;
        int i10 = aVar.c;
        f0 f0Var2 = aVar.d;
        boolean p5 = k1Var.p();
        HashMap hashMap = this.c;
        if (p5) {
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
        this.f = c(i10, f0Var2).a;
        f(aVar);
        if (f0Var2 != null) {
            long j3 = f0Var2.d;
            if (f0Var2.b()) {
                if (gVar2 != null && gVar2.c == j3 && (f0Var = gVar2.d) != null && f0Var.b == f0Var2.b && f0Var.c == f0Var2.c) {
                    return;
                }
                c(i10, new f0(f0Var2.a, j3));
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
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            long j10 = f0Var.d;
            g gVar = (g) this.c.get(this.f);
            if (gVar != null) {
                j3 = gVar.c;
                if (j3 != -1) {
                    if (j10 >= j3) {
                        return;
                    }
                    g gVar2 = (g) this.c.get(this.f);
                    if (gVar2 != null && gVar2.c == -1 && gVar2.b != aVar.c) {
                        return;
                    }
                }
            }
            j3 = this.g + 1;
            if (j10 >= j3) {
            }
        }
        g c10 = c(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = c10.a;
        }
        f0 f0Var2 = aVar.d;
        if (f0Var2 != null && f0Var2.b()) {
            f0 f0Var3 = aVar.d;
            g c11 = c(aVar.c, new f0(f0Var3.a, f0Var3.d, f0Var3.b));
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
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.e) {
                        boolean equals = gVar.a.equals(this.f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.t(aVar, gVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
