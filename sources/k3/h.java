package k3;

import h5.d0;
import j3.m2;
import j3.n2;
import j3.o2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import o4.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h {
    public static final e h = new e(6);
    public static final Random i = new Random();
    public i d;
    public String f;
    public final n2 a = new n2();
    public final m2 b = new m2();
    public final HashMap c = new HashMap();
    public o2 e = o2.a;
    public long g = -1;

    public final void a(g gVar) {
        long j10 = gVar.c;
        if (j10 != -1) {
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
                    iVar.m(aVar, gVar2.a);
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
    public final g c(int i10, v vVar) {
        long j10;
        long j11;
        long j12;
        HashMap hashMap = this.c;
        g gVar = null;
        long j13 = Long.MAX_VALUE;
        for (g gVar2 : hashMap.values()) {
            long j14 = gVar2.c;
            v vVar2 = gVar2.d;
            if (j14 == -1 && i10 == gVar2.b && vVar != null) {
                long j15 = vVar.d;
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
            if (vVar != null) {
                long j16 = vVar.d;
                if (vVar2 == null) {
                    if (!vVar.a() && j16 == gVar2.c) {
                        j11 = gVar2.c;
                        if (j11 == j10) {
                        }
                        gVar = gVar2;
                        j13 = j11;
                    }
                } else if (j16 == vVar2.d && vVar.b == vVar2.b && vVar.c == vVar2.c) {
                    j11 = gVar2.c;
                    if (j11 == j10) {
                    }
                    gVar = gVar2;
                    j13 = j11;
                }
            } else if (i10 == gVar2.b) {
                j11 = gVar2.c;
                if (j11 == j10 || j11 < j13) {
                    gVar = gVar2;
                    j13 = j11;
                } else if (j11 == j13) {
                    int i11 = d0.a;
                    if (gVar.d != null && vVar2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) h.get();
        g gVar4 = new g(this, str, i10, vVar);
        hashMap.put(str, gVar4);
        return gVar4;
    }

    public final synchronized String d(o2 o2Var, v vVar) {
        return c(o2Var.g(vVar.a, this.b).c, vVar).a;
    }

    public final void e(a aVar) {
        v vVar;
        o2 o2Var = aVar.b;
        int i10 = aVar.c;
        v vVar2 = aVar.d;
        boolean p10 = o2Var.p();
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
        this.f = c(i10, vVar2).a;
        f(aVar);
        if (vVar2 != null) {
            long j10 = vVar2.d;
            if (vVar2.a()) {
                if (gVar2 != null && gVar2.c == j10 && (vVar = gVar2.d) != null && vVar.b == vVar2.b && vVar.c == vVar2.c) {
                    return;
                }
                c(i10, new v(vVar2.a, j10));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b3, B:41:0x00b7, B:42:0x00be, B:44:0x00c8, B:46:0x00cc), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(a aVar) {
        long j10;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        v vVar = aVar.d;
        if (vVar != null) {
            long j11 = vVar.d;
            g gVar = (g) this.c.get(this.f);
            if (gVar != null) {
                j10 = gVar.c;
                if (j10 != -1) {
                    if (j11 >= j10) {
                        return;
                    }
                    g gVar2 = (g) this.c.get(this.f);
                    if (gVar2 != null && gVar2.c == -1 && gVar2.b != aVar.c) {
                        return;
                    }
                }
            }
            j10 = this.g + 1;
            if (j11 >= j10) {
            }
        }
        g c3 = c(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = c3.a;
        }
        v vVar2 = aVar.d;
        if (vVar2 != null && vVar2.a()) {
            v vVar3 = aVar.d;
            g c10 = c(aVar.c, new v(vVar3.a, vVar3.d, vVar3.b));
            if (!c10.e) {
                c10.e = true;
                aVar.b.g(aVar.d.a, this.b);
                Math.max(0L, d0.S(this.b.d(aVar.d.b)) + d0.S(this.b.e));
                this.d.getClass();
            }
        }
        if (!c3.e) {
            c3.e = true;
            this.d.getClass();
        }
        if (c3.a.equals(this.f) && !c3.f) {
            c3.f = true;
            this.d.l(aVar, c3.a);
        }
    }

    public final synchronized void g(a aVar, int i10) {
        try {
            this.d.getClass();
            boolean z4 = i10 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.e) {
                        boolean equals = gVar.a.equals(this.f);
                        if (z4 && equals) {
                            boolean z10 = gVar.f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.d.m(aVar, gVar.a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
