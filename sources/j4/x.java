package j4;

import android.util.Pair;
import h3.p2;
import h3.q2;
import h3.r2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x extends l1 {
    public final boolean l;
    public final q2 m;
    public final p2 n;
    public v o;
    public u p;
    public boolean q;
    public boolean r;
    public boolean s;

    public x(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.i();
        this.m = new q2();
        this.n = new p2();
        r2 g10 = aVar.g();
        if (g10 == null) {
            this.o = new v(new w(aVar.h()), q2.D, v.e);
        } else {
            this.o = new v(g10, null, null);
            this.s = true;
        }
    }

    @Override // j4.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final u b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        u uVar = new u(d0Var, rVar, j10);
        d5.a.i(uVar.d == null);
        a aVar = this.k;
        uVar.d = aVar;
        if (!this.r) {
            this.p = uVar;
            if (!this.q) {
                this.q = true;
                w(null, aVar);
            }
            return uVar;
        }
        Object obj = d0Var.a;
        if (this.o.d != null && obj.equals(v.e)) {
            obj = this.o.d;
        }
        uVar.a(d0Var.b(obj));
        return uVar;
    }

    public final void B(long j10) {
        u uVar = this.p;
        int b10 = this.o.b(uVar.a.a);
        if (b10 == -1) {
            return;
        }
        v vVar = this.o;
        p2 p2Var = this.n;
        vVar.f(b10, p2Var, false);
        long j11 = p2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        uVar.h = j10;
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        u uVar = (u) a0Var;
        if (uVar.e != null) {
            a aVar = uVar.d;
            aVar.getClass();
            aVar.n(uVar.e);
        }
        if (a0Var == this.p) {
            this.p = null;
        }
    }

    @Override // j4.k, j4.a
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // j4.l1
    public final d0 x(d0 d0Var) {
        Object obj = d0Var.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = v.e;
        }
        return d0Var.b(obj);
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
    public final void y(r2 r2Var) {
        long j10;
        v vVar;
        u uVar;
        d0 b10;
        v vVar2;
        if (this.r) {
            v vVar3 = this.o;
            this.o = new v(r2Var, vVar3.c, vVar3.d);
            u uVar2 = this.p;
            if (uVar2 != null) {
                B(uVar2.h);
            }
        } else if (r2Var.p()) {
            if (this.s) {
                v vVar4 = this.o;
                vVar2 = new v(r2Var, vVar4.c, vVar4.d);
            } else {
                vVar2 = new v(r2Var, q2.D, v.e);
            }
            this.o = vVar2;
        } else {
            q2 q2Var = this.m;
            r2Var.n(0, q2Var);
            long j11 = q2Var.x;
            Object obj = q2Var.a;
            u uVar3 = this.p;
            if (uVar3 != null) {
                long j12 = uVar3.b;
                v vVar5 = this.o;
                Object obj2 = uVar3.a.a;
                p2 p2Var = this.n;
                vVar5.g(obj2, p2Var);
                long j13 = p2Var.e + j12;
                this.o.m(0, q2Var, 0L);
                if (j13 != q2Var.x) {
                    j10 = j13;
                    Pair i9 = r2Var.i(this.m, this.n, 0, j10);
                    Object obj3 = i9.first;
                    long longValue = ((Long) i9.second).longValue();
                    if (this.s) {
                        vVar = new v(r2Var, obj, obj3);
                    } else {
                        v vVar6 = this.o;
                        vVar = new v(r2Var, vVar6.c, vVar6.d);
                    }
                    this.o = vVar;
                    uVar = this.p;
                    if (uVar != null) {
                        B(longValue);
                        d0 d0Var = uVar.a;
                        Object obj4 = d0Var.a;
                        if (this.o.d != null && obj4.equals(v.e)) {
                            obj4 = this.o.d;
                        }
                        b10 = d0Var.b(obj4);
                        this.s = true;
                        this.r = true;
                        m(this.o);
                        if (b10 == null) {
                            u uVar4 = this.p;
                            uVar4.getClass();
                            uVar4.a(b10);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair i92 = r2Var.i(this.m, this.n, 0, j10);
            Object obj32 = i92.first;
            long longValue2 = ((Long) i92.second).longValue();
            if (this.s) {
            }
            this.o = vVar;
            uVar = this.p;
            if (uVar != null) {
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

    @Override // j4.k, j4.a
    public final void j() {
    }
}
