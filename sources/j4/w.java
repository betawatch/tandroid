package j4;

import android.util.Pair;
import h3.p2;
import h3.r2;
import h3.s2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w extends l1 {
    public final boolean l;
    public final r2 m;
    public final p2 n;
    public u o;
    public t p;
    public boolean q;
    public boolean r;
    public boolean s;

    public w(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.i();
        this.m = new r2();
        this.n = new p2();
        s2 g10 = aVar.g();
        if (g10 == null) {
            this.o = new u(new v(aVar.h()), r2.D, u.e);
        } else {
            this.o = new u(g10, null, null);
            this.s = true;
        }
    }

    @Override // j4.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final t b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        t tVar = new t(c0Var, rVar, j10);
        d5.a.i(tVar.d == null);
        a aVar = this.k;
        tVar.d = aVar;
        if (!this.r) {
            this.p = tVar;
            if (!this.q) {
                this.q = true;
                w(null, aVar);
            }
            return tVar;
        }
        Object obj = c0Var.a;
        if (this.o.d != null && obj.equals(u.e)) {
            obj = this.o.d;
        }
        tVar.c(c0Var.b(obj));
        return tVar;
    }

    public final void B(long j10) {
        t tVar = this.p;
        int b10 = this.o.b(tVar.a.a);
        if (b10 == -1) {
            return;
        }
        u uVar = this.o;
        p2 p2Var = this.n;
        uVar.f(b10, p2Var, false);
        long j11 = p2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        tVar.h = j10;
    }

    @Override // j4.a
    public final void n(z zVar) {
        t tVar = (t) zVar;
        if (tVar.e != null) {
            a aVar = tVar.d;
            aVar.getClass();
            aVar.n(tVar.e);
        }
        if (zVar == this.p) {
            this.p = null;
        }
    }

    @Override // j4.j, j4.a
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // j4.l1
    public final c0 x(c0 c0Var) {
        Object obj = c0Var.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = u.e;
        }
        return c0Var.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // j4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(s2 s2Var) {
        long j10;
        u uVar;
        t tVar;
        c0 b10;
        u uVar2;
        if (this.r) {
            u uVar3 = this.o;
            this.o = new u(s2Var, uVar3.c, uVar3.d);
            t tVar2 = this.p;
            if (tVar2 != null) {
                B(tVar2.h);
            }
        } else if (s2Var.p()) {
            if (this.s) {
                u uVar4 = this.o;
                uVar2 = new u(s2Var, uVar4.c, uVar4.d);
            } else {
                uVar2 = new u(s2Var, r2.D, u.e);
            }
            this.o = uVar2;
        } else {
            r2 r2Var = this.m;
            s2Var.n(0, r2Var);
            long j11 = r2Var.x;
            Object obj = r2Var.a;
            t tVar3 = this.p;
            if (tVar3 != null) {
                long j12 = tVar3.b;
                u uVar5 = this.o;
                Object obj2 = tVar3.a.a;
                p2 p2Var = this.n;
                uVar5.g(obj2, p2Var);
                long j13 = p2Var.e + j12;
                this.o.m(0, r2Var, 0L);
                if (j13 != r2Var.x) {
                    j10 = j13;
                    Pair i10 = s2Var.i(this.m, this.n, 0, j10);
                    Object obj3 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        uVar = new u(s2Var, obj, obj3);
                    } else {
                        u uVar6 = this.o;
                        uVar = new u(s2Var, uVar6.c, uVar6.d);
                    }
                    this.o = uVar;
                    tVar = this.p;
                    if (tVar != null) {
                        B(longValue);
                        c0 c0Var = tVar.a;
                        Object obj4 = c0Var.a;
                        if (this.o.d != null && obj4.equals(u.e)) {
                            obj4 = this.o.d;
                        }
                        b10 = c0Var.b(obj4);
                        this.s = true;
                        this.r = true;
                        m(this.o);
                        if (b10 == null) {
                            t tVar4 = this.p;
                            tVar4.getClass();
                            tVar4.c(b10);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair i102 = s2Var.i(this.m, this.n, 0, j10);
            Object obj32 = i102.first;
            long longValue2 = ((Long) i102.second).longValue();
            if (this.s) {
            }
            this.o = uVar;
            tVar = this.p;
            if (tVar != null) {
            }
        }
        b10 = null;
        this.s = true;
        this.r = true;
        m(this.o);
        if (b10 == null) {
        }
    }

    @Override // j4.l1
    public final void z() {
        if (this.l) {
            return;
        }
        this.q = true;
        w(null, this.k);
    }

    @Override // j4.j, j4.a
    public final void j() {
    }
}
