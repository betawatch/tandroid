package i3;

import d5.f0;
import h3.p2;
import h3.q;
import h3.q2;
import h3.r2;
import j4.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h {
    public static final q g = new q(1);
    public static final Random h = new Random();
    public j d;
    public String f;
    public final q2 a = new q2();
    public final p2 b = new p2();
    public final HashMap c = new HashMap();
    public r2 e = r2.a;

    public final synchronized void a(a aVar) {
        j jVar;
        this.f = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            if (gVar.e && (jVar = this.d) != null) {
                jVar.n(aVar, gVar.a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g b(int i9, d0 d0Var) {
        long j10;
        HashMap hashMap = this.c;
        g gVar = null;
        long j11 = Long.MAX_VALUE;
        for (g gVar2 : hashMap.values()) {
            long j12 = gVar2.c;
            d0 d0Var2 = gVar2.d;
            if (j12 == -1 && i9 == gVar2.b && d0Var != null) {
                gVar2.c = d0Var.d;
            }
            if (d0Var != null) {
                long j13 = d0Var.d;
                if (d0Var2 == null) {
                    if (!d0Var.a() && j13 == gVar2.c) {
                        j10 = gVar2.c;
                        if (j10 == -1) {
                        }
                        gVar = gVar2;
                        j11 = j10;
                    }
                } else if (j13 == d0Var2.d && d0Var.b == d0Var2.b && d0Var.c == d0Var2.c) {
                    j10 = gVar2.c;
                    if (j10 == -1) {
                    }
                    gVar = gVar2;
                    j11 = j10;
                }
            } else if (i9 == gVar2.b) {
                j10 = gVar2.c;
                if (j10 == -1 || j10 < j11) {
                    gVar = gVar2;
                    j11 = j10;
                } else if (j10 == j11) {
                    int i10 = f0.a;
                    if (gVar.d != null && d0Var2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) g.get();
        g gVar3 = new g(this, str, i9, d0Var);
        hashMap.put(str, gVar3);
        return gVar3;
    }

    public final synchronized String c(r2 r2Var, d0 d0Var) {
        return b(r2Var.g(d0Var.a, this.b).c, d0Var).a;
    }

    public final void d(a aVar) {
        d0 d0Var;
        r2 r2Var = aVar.b;
        int i9 = aVar.c;
        d0 d0Var2 = aVar.d;
        if (r2Var.p()) {
            this.f = null;
            return;
        }
        g gVar = (g) this.c.get(this.f);
        this.f = b(i9, d0Var2).a;
        e(aVar);
        if (d0Var2 != null) {
            long j10 = d0Var2.d;
            if (d0Var2.a()) {
                if (gVar != null && gVar.c == j10 && (d0Var = gVar.d) != null && d0Var.b == d0Var2.b && d0Var.c == d0Var2.c) {
                    return;
                }
                b(i9, new d0(d0Var2.a, j10));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(a aVar) {
        try {
            this.d.getClass();
        } finally {
        }
        if (aVar.b.p()) {
            return;
        }
        g gVar = (g) this.c.get(this.f);
        d0 d0Var = aVar.d;
        if (d0Var != null && gVar != null) {
            long j10 = gVar.c;
            if (j10 == -1) {
                if (gVar.b != aVar.c) {
                    return;
                }
            }
        }
        g b10 = b(aVar.c, d0Var);
        if (this.f == null) {
            this.f = b10.a;
        }
        d0 d0Var2 = aVar.d;
        if (d0Var2 != null && d0Var2.a()) {
            d0 d0Var3 = aVar.d;
            g b11 = b(aVar.c, new d0(d0Var3.a, d0Var3.d, d0Var3.b));
            if (!b11.e) {
                b11.e = true;
                aVar.b.g(aVar.d.a, this.b);
                Math.max(0L, f0.S(this.b.d(aVar.d.b)) + f0.S(this.b.e));
                this.d.getClass();
            }
        }
        if (!b10.e) {
            b10.e = true;
            this.d.getClass();
        }
        if (b10.a.equals(this.f) && !b10.f) {
            b10.f = true;
            this.d.m(aVar, b10.a);
        }
    }

    public final synchronized void f(a aVar, int i9) {
        try {
            this.d.getClass();
            boolean z10 = i9 == 0;
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
                            this.f = null;
                        }
                        this.d.n(aVar, gVar.a);
                    }
                }
            }
            d(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
