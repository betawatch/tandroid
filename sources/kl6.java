// default package

import android.util.Pair;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kl6 extends t0d {
    public final boolean l;
    public final aqb m;
    public final ypb n;
    public il6 o;
    public hl6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public kl6(rh0 rh0Var, boolean z) {
        super(rh0Var);
        this.l = z && rh0Var.j();
        this.m = new aqb();
        this.n = new ypb();
        bqb h = rh0Var.h();
        if (h == null) {
            this.o = new il6(new jl6(rh0Var.i()), aqb.p, il6.h);
        } else {
            this.o = new il6(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // t0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(bqb bqbVar) {
        long j;
        il6 il6Var;
        hl6 hl6Var;
        Object obj;
        rz6 a;
        il6 il6Var2;
        if (this.r) {
            il6 il6Var3 = this.o;
            this.o = new il6(bqbVar, il6Var3.f, il6Var3.g);
            hl6 hl6Var2 = this.p;
            if (hl6Var2 != null) {
                D(hl6Var2.h);
            }
        } else if (bqbVar.p()) {
            if (this.s) {
                il6 il6Var4 = this.o;
                il6Var2 = new il6(bqbVar, il6Var4.f, il6Var4.g);
            } else {
                il6Var2 = new il6(bqbVar, aqb.p, il6.h);
            }
            this.o = il6Var2;
        } else {
            aqb aqbVar = this.m;
            bqbVar.n(0, aqbVar);
            long j2 = aqbVar.k;
            Object obj2 = aqbVar.a;
            hl6 hl6Var3 = this.p;
            ypb ypbVar = this.n;
            if (hl6Var3 != null) {
                long j3 = hl6Var3.b;
                this.o.g(hl6Var3.a.a, ypbVar);
                long j4 = ypbVar.e + j3;
                this.o.m(0, aqbVar, 0L);
                if (j4 != aqbVar.k) {
                    j = j4;
                    Pair i = bqbVar.i(aqbVar, ypbVar, 0, j);
                    Object obj3 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (this.s) {
                        il6Var = new il6(bqbVar, obj2, obj3);
                    } else {
                        il6 il6Var5 = this.o;
                        il6Var = new il6(bqbVar, il6Var5.f, il6Var5.g);
                    }
                    this.o = il6Var;
                    hl6Var = this.p;
                    if (hl6Var != null && D(longValue)) {
                        rz6 rz6Var = hl6Var.a;
                        obj = rz6Var.a;
                        if (this.o.g != null && obj.equals(il6.h)) {
                            obj = this.o.g;
                        }
                        a = rz6Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a != null) {
                            hl6 hl6Var4 = this.p;
                            hl6Var4.getClass();
                            hl6Var4.d(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair i2 = bqbVar.i(aqbVar, ypbVar, 0, j);
            Object obj32 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (this.s) {
            }
            this.o = il6Var;
            hl6Var = this.p;
            if (hl6Var != null) {
                rz6 rz6Var2 = hl6Var.a;
                obj = rz6Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a = rz6Var2.a(obj);
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

    @Override // t0d
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        y(null, this.k);
    }

    @Override // rh0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final hl6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        hl6 hl6Var = new hl6(rz6Var, mx6Var, j);
        jte.p(hl6Var.d == null);
        rh0 rh0Var = this.k;
        hl6Var.d = rh0Var;
        if (!this.r) {
            this.p = hl6Var;
            if (!this.q) {
                this.q = true;
                y(null, rh0Var);
            }
            return hl6Var;
        }
        Object obj = rz6Var.a;
        if (this.o.g != null && obj.equals(il6.h)) {
            obj = this.o.g;
        }
        hl6Var.d(rz6Var.a(obj));
        return hl6Var;
    }

    public final boolean D(long j) {
        hl6 hl6Var = this.p;
        int b = this.o.b(hl6Var.a.a);
        if (b == -1) {
            return false;
        }
        il6 il6Var = this.o;
        ypb ypbVar = this.n;
        il6Var.f(b, ypbVar, false);
        long j2 = ypbVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        hl6Var.h = j;
        return true;
    }

    @Override // t0d, rh0
    public final boolean a(bt6 bt6Var) {
        return this.k.a(bt6Var);
    }

    @Override // rh0
    public final void o(tt6 tt6Var) {
        hl6 hl6Var = (hl6) tt6Var;
        if (hl6Var.e != null) {
            rh0 rh0Var = hl6Var.d;
            rh0Var.getClass();
            rh0Var.o(hl6Var.e);
        }
        if (tt6Var == this.p) {
            this.p = null;
        }
    }

    @Override // ur2, rh0
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // t0d, rh0
    public final void t(bt6 bt6Var) {
        if (this.s) {
            il6 il6Var = this.o;
            bqb bqbVar = il6Var.e;
            this.o = new il6(bqbVar instanceof mqb ? new mqb(((mqb) bqbVar).e, bt6Var) : new mqb(bqbVar, bt6Var), il6Var.f, il6Var.g);
        } else {
            this.o = new il6(new jl6(bt6Var), aqb.p, il6.h);
        }
        this.k.t(bt6Var);
    }

    @Override // t0d
    public final rz6 z(rz6 rz6Var) {
        Object obj = rz6Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = il6.h;
        }
        return rz6Var.a(obj);
    }
}
