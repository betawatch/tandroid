package o4;

import android.util.Pair;
import j3.m2;
import j3.n2;
import j3.o2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q extends v0 {
    public final boolean l;
    public final n2 m;
    public final m2 n;
    public o o;
    public n p;
    public boolean q;
    public boolean r;
    public boolean s;

    public q(a aVar, boolean z4) {
        super(aVar);
        this.l = z4 && aVar.i();
        this.m = new n2();
        this.n = new m2();
        o2 g10 = aVar.g();
        if (g10 == null) {
            this.o = new o(new p(aVar.h()), n2.E, o.e);
        } else {
            this.o = new o(g10, null, null);
            this.s = true;
        }
    }

    @Override // o4.a
    public final void n(t tVar) {
        n nVar = (n) tVar;
        if (nVar.e != null) {
            a aVar = nVar.d;
            aVar.getClass();
            aVar.n(nVar.e);
        }
        if (tVar == this.p) {
            this.p = null;
        }
    }

    @Override // o4.v0, o4.a
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // o4.v0
    public final v s(v vVar) {
        Object obj = vVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = o.e;
        }
        return vVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // o4.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(o2 o2Var) {
        long j10;
        o oVar;
        n nVar;
        v b10;
        o oVar2;
        if (this.r) {
            o oVar3 = this.o;
            this.o = new o(o2Var, oVar3.c, oVar3.d);
            n nVar2 = this.p;
            if (nVar2 != null) {
                y(nVar2.h);
            }
        } else if (o2Var.p()) {
            if (this.s) {
                o oVar4 = this.o;
                oVar2 = new o(o2Var, oVar4.c, oVar4.d);
            } else {
                oVar2 = new o(o2Var, n2.E, o.e);
            }
            this.o = oVar2;
        } else {
            n2 n2Var = this.m;
            o2Var.n(0, n2Var);
            long j11 = n2Var.x;
            Object obj = n2Var.a;
            n nVar3 = this.p;
            if (nVar3 != null) {
                long j12 = nVar3.b;
                o oVar5 = this.o;
                Object obj2 = nVar3.a.a;
                m2 m2Var = this.n;
                oVar5.g(obj2, m2Var);
                long j13 = m2Var.e + j12;
                this.o.m(0, n2Var, 0L);
                if (j13 != n2Var.x) {
                    j10 = j13;
                    Pair i10 = o2Var.i(this.m, this.n, 0, j10);
                    Object obj3 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        oVar = new o(o2Var, obj, obj3);
                    } else {
                        o oVar6 = this.o;
                        oVar = new o(o2Var, oVar6.c, oVar6.d);
                    }
                    this.o = oVar;
                    nVar = this.p;
                    if (nVar != null) {
                        y(longValue);
                        v vVar = nVar.a;
                        Object obj4 = vVar.a;
                        if (this.o.d != null && obj4.equals(o.e)) {
                            obj4 = this.o.d;
                        }
                        b10 = vVar.b(obj4);
                        this.s = true;
                        this.r = true;
                        m(this.o);
                        if (b10 == null) {
                            n nVar4 = this.p;
                            nVar4.getClass();
                            nVar4.c(b10);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair i102 = o2Var.i(this.m, this.n, 0, j10);
            Object obj32 = i102.first;
            long longValue2 = ((Long) i102.second).longValue();
            if (this.s) {
            }
            this.o = oVar;
            nVar = this.p;
            if (nVar != null) {
            }
        }
        b10 = null;
        this.s = true;
        this.r = true;
        m(this.o);
        if (b10 == null) {
        }
    }

    @Override // o4.v0
    public final void w() {
        if (this.l) {
            return;
        }
        this.q = true;
        v(null, this.k);
    }

    @Override // o4.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final n b(v vVar, g5.q qVar, long j10) {
        n nVar = new n(vVar, qVar, j10);
        h5.a.i(nVar.d == null);
        a aVar = this.k;
        nVar.d = aVar;
        if (!this.r) {
            this.p = nVar;
            if (!this.q) {
                this.q = true;
                v(null, aVar);
            }
            return nVar;
        }
        Object obj = vVar.a;
        if (this.o.d != null && obj.equals(o.e)) {
            obj = this.o.d;
        }
        nVar.c(vVar.b(obj));
        return nVar;
    }

    public final void y(long j10) {
        n nVar = this.p;
        int b10 = this.o.b(nVar.a.a);
        if (b10 == -1) {
            return;
        }
        o oVar = this.o;
        m2 m2Var = this.n;
        oVar.f(b10, m2Var, false);
        long j11 = m2Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        nVar.h = j10;
    }

    @Override // o4.v0, o4.a
    public final void j() {
    }
}
