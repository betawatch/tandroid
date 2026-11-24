// default package

import android.util.Pair;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hj6 extends syc {
    public final boolean l;
    public final znb m;
    public final xnb n;
    public fj6 o;
    public ej6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public hj6(qg0 qg0Var, boolean z) {
        super(qg0Var);
        this.l = z && qg0Var.j();
        this.m = new znb();
        this.n = new xnb();
        aob h = qg0Var.h();
        if (h == null) {
            this.o = new fj6(new gj6(qg0Var.i()), znb.p, fj6.h);
        } else {
            this.o = new fj6(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // syc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(aob aobVar) {
        long j;
        fj6 fj6Var;
        ej6 ej6Var;
        Object obj;
        rx6 a;
        fj6 fj6Var2;
        if (this.r) {
            fj6 fj6Var3 = this.o;
            this.o = new fj6(aobVar, fj6Var3.f, fj6Var3.g);
            ej6 ej6Var2 = this.p;
            if (ej6Var2 != null) {
                D(ej6Var2.h);
            }
        } else if (aobVar.p()) {
            if (this.s) {
                fj6 fj6Var4 = this.o;
                fj6Var2 = new fj6(aobVar, fj6Var4.f, fj6Var4.g);
            } else {
                fj6Var2 = new fj6(aobVar, znb.p, fj6.h);
            }
            this.o = fj6Var2;
        } else {
            znb znbVar = this.m;
            aobVar.n(0, znbVar);
            long j2 = znbVar.k;
            Object obj2 = znbVar.a;
            ej6 ej6Var3 = this.p;
            xnb xnbVar = this.n;
            if (ej6Var3 != null) {
                long j3 = ej6Var3.b;
                this.o.g(ej6Var3.a.a, xnbVar);
                long j4 = xnbVar.e + j3;
                this.o.m(0, znbVar, 0L);
                if (j4 != znbVar.k) {
                    j = j4;
                    Pair i = aobVar.i(znbVar, xnbVar, 0, j);
                    Object obj3 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (this.s) {
                        fj6Var = new fj6(aobVar, obj2, obj3);
                    } else {
                        fj6 fj6Var5 = this.o;
                        fj6Var = new fj6(aobVar, fj6Var5.f, fj6Var5.g);
                    }
                    this.o = fj6Var;
                    ej6Var = this.p;
                    if (ej6Var != null && D(longValue)) {
                        rx6 rx6Var = ej6Var.a;
                        obj = rx6Var.a;
                        if (this.o.g != null && obj.equals(fj6.h)) {
                            obj = this.o.g;
                        }
                        a = rx6Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a != null) {
                            ej6 ej6Var4 = this.p;
                            ej6Var4.getClass();
                            ej6Var4.c(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair i2 = aobVar.i(znbVar, xnbVar, 0, j);
            Object obj32 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (this.s) {
            }
            this.o = fj6Var;
            ej6Var = this.p;
            if (ej6Var != null) {
                rx6 rx6Var2 = ej6Var.a;
                obj = rx6Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a = rx6Var2.a(obj);
                this.s = true;
                this.r = true;
                n(this.o);
                if (a != null) {
                }
            }
        }
        a = null;
        this.s = true;
        this.r = true;
        n(this.o);
        if (a != null) {
        }
    }

    @Override // syc
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        y(null, this.k);
    }

    @Override // qg0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ej6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        ej6 ej6Var = new ej6(rx6Var, mv6Var, j);
        gre.p(ej6Var.d == null);
        qg0 qg0Var = this.k;
        ej6Var.d = qg0Var;
        if (!this.r) {
            this.p = ej6Var;
            if (!this.q) {
                this.q = true;
                y(null, qg0Var);
            }
            return ej6Var;
        }
        Object obj = rx6Var.a;
        if (this.o.g != null && obj.equals(fj6.h)) {
            obj = this.o.g;
        }
        ej6Var.c(rx6Var.a(obj));
        return ej6Var;
    }

    public final boolean D(long j) {
        ej6 ej6Var = this.p;
        int b = this.o.b(ej6Var.a.a);
        if (b == -1) {
            return false;
        }
        fj6 fj6Var = this.o;
        xnb xnbVar = this.n;
        fj6Var.f(b, xnbVar, false);
        long j2 = xnbVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        ej6Var.h = j;
        return true;
    }

    @Override // syc, qg0
    public final boolean a(br6 br6Var) {
        return this.k.a(br6Var);
    }

    @Override // qg0
    public final void o(sr6 sr6Var) {
        ej6 ej6Var = (ej6) sr6Var;
        if (ej6Var.e != null) {
            qg0 qg0Var = ej6Var.d;
            qg0Var.getClass();
            qg0Var.o(ej6Var.e);
        }
        if (sr6Var == this.p) {
            this.p = null;
        }
    }

    @Override // jq2, qg0
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // syc, qg0
    public final void t(br6 br6Var) {
        if (this.s) {
            fj6 fj6Var = this.o;
            aob aobVar = fj6Var.e;
            this.o = new fj6(aobVar instanceof lob ? new lob(((lob) aobVar).e, br6Var) : new lob(aobVar, br6Var), fj6Var.f, fj6Var.g);
        } else {
            this.o = new fj6(new gj6(br6Var), znb.p, fj6.h);
        }
        this.k.t(br6Var);
    }

    @Override // syc
    public final rx6 z(rx6 rx6Var) {
        Object obj = rx6Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = fj6.h;
        }
        return rx6Var.a(obj);
    }
}
