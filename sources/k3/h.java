package k3;

import f5.d0;
import j3.p2;
import j3.q;
import j3.q2;
import j3.r2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import l4.c0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public static final q g = new q(1);
    public static final Random h = new Random();
    public i d;
    public String f;
    public final q2 a = new q2();
    public final p2 b = new p2();
    public final HashMap c = new HashMap();
    public r2 e = r2.a;

    public final synchronized void a(a aVar) {
        i iVar;
        this.f = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            if (gVar.e && (iVar = this.d) != null) {
                iVar.n(aVar, gVar.a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g b(int i10, c0 c0Var) {
        long j10;
        HashMap hashMap = this.c;
        g gVar = null;
        long j11 = Long.MAX_VALUE;
        for (g gVar2 : hashMap.values()) {
            long j12 = gVar2.c;
            c0 c0Var2 = gVar2.d;
            if (j12 == -1 && i10 == gVar2.b && c0Var != null) {
                gVar2.c = c0Var.d;
            }
            if (c0Var != null) {
                long j13 = c0Var.d;
                if (c0Var2 == null) {
                    if (!c0Var.a() && j13 == gVar2.c) {
                        j10 = gVar2.c;
                        if (j10 == -1) {
                        }
                        gVar = gVar2;
                        j11 = j10;
                    }
                } else if (j13 == c0Var2.d && c0Var.b == c0Var2.b && c0Var.c == c0Var2.c) {
                    j10 = gVar2.c;
                    if (j10 == -1) {
                    }
                    gVar = gVar2;
                    j11 = j10;
                }
            } else if (i10 == gVar2.b) {
                j10 = gVar2.c;
                if (j10 == -1 || j10 < j11) {
                    gVar = gVar2;
                    j11 = j10;
                } else if (j10 == j11) {
                    int i11 = d0.a;
                    if (gVar.d != null && c0Var2 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) g.get();
        g gVar3 = new g(this, str, i10, c0Var);
        hashMap.put(str, gVar3);
        return gVar3;
    }

    public final synchronized String c(r2 r2Var, c0 c0Var) {
        return b(r2Var.g(c0Var.a, this.b).c, c0Var).a;
    }

    public final void d(a aVar) {
        c0 c0Var;
        r2 r2Var = aVar.b;
        int i10 = aVar.c;
        c0 c0Var2 = aVar.d;
        if (r2Var.p()) {
            this.f = null;
            return;
        }
        g gVar = (g) this.c.get(this.f);
        this.f = b(i10, c0Var2).a;
        e(aVar);
        if (c0Var2 != null) {
            long j10 = c0Var2.d;
            if (c0Var2.a()) {
                if (gVar != null && gVar.c == j10 && (c0Var = gVar.d) != null && c0Var.b == c0Var2.b && c0Var.c == c0Var2.c) {
                    return;
                }
                b(i10, new c0(c0Var2.a, j10));
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
        c0 c0Var = aVar.d;
        if (c0Var != null && gVar != null) {
            long j10 = gVar.c;
            if (j10 == -1) {
                if (gVar.b != aVar.c) {
                    return;
                }
            }
        }
        g b10 = b(aVar.c, c0Var);
        if (this.f == null) {
            this.f = b10.a;
        }
        c0 c0Var2 = aVar.d;
        if (c0Var2 != null && c0Var2.a()) {
            c0 c0Var3 = aVar.d;
            g b11 = b(aVar.c, new c0(c0Var3.a, c0Var3.d, c0Var3.b));
            if (!b11.e) {
                b11.e = true;
                aVar.b.g(aVar.d.a, this.b);
                Math.max(0L, d0.S(this.b.d(aVar.d.b)) + d0.S(this.b.e));
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

    public final synchronized void f(a aVar, int i10) {
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
                            this.f = null;
                        }
                        this.d.n(aVar, gVar.a);
                    }
                }
            }
            d(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
