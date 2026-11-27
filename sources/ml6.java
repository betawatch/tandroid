// default package

import android.util.Pair;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ml6 extends i3d {
    public final boolean l;
    public final zrb m;
    public final xrb n;
    public kl6 o;
    public jl6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public ml6(rg0 rg0Var, boolean z) {
        super(rg0Var);
        this.l = z && rg0Var.j();
        this.m = new zrb();
        this.n = new xrb();
        asb h = rg0Var.h();
        if (h == null) {
            this.o = new kl6(new ll6(rg0Var.i()), zrb.p, kl6.h);
        } else {
            this.o = new kl6(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // i3d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(asb asbVar) {
        long j;
        kl6 kl6Var;
        jl6 jl6Var;
        Object obj;
        vz6 a;
        kl6 kl6Var2;
        if (this.r) {
            kl6 kl6Var3 = this.o;
            this.o = new kl6(asbVar, kl6Var3.f, kl6Var3.g);
            jl6 jl6Var2 = this.p;
            if (jl6Var2 != null) {
                D(jl6Var2.h);
            }
        } else if (asbVar.p()) {
            if (this.s) {
                kl6 kl6Var4 = this.o;
                kl6Var2 = new kl6(asbVar, kl6Var4.f, kl6Var4.g);
            } else {
                kl6Var2 = new kl6(asbVar, zrb.p, kl6.h);
            }
            this.o = kl6Var2;
        } else {
            zrb zrbVar = this.m;
            asbVar.n(0, zrbVar);
            long j2 = zrbVar.k;
            Object obj2 = zrbVar.a;
            jl6 jl6Var3 = this.p;
            xrb xrbVar = this.n;
            if (jl6Var3 != null) {
                long j3 = jl6Var3.b;
                this.o.g(jl6Var3.a.a, xrbVar);
                long j4 = xrbVar.e + j3;
                this.o.m(0, zrbVar, 0L);
                if (j4 != zrbVar.k) {
                    j = j4;
                    Pair i = asbVar.i(zrbVar, xrbVar, 0, j);
                    Object obj3 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (this.s) {
                        kl6Var = new kl6(asbVar, obj2, obj3);
                    } else {
                        kl6 kl6Var5 = this.o;
                        kl6Var = new kl6(asbVar, kl6Var5.f, kl6Var5.g);
                    }
                    this.o = kl6Var;
                    jl6Var = this.p;
                    if (jl6Var != null && D(longValue)) {
                        vz6 vz6Var = jl6Var.a;
                        obj = vz6Var.a;
                        if (this.o.g != null && obj.equals(kl6.h)) {
                            obj = this.o.g;
                        }
                        a = vz6Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a != null) {
                            jl6 jl6Var4 = this.p;
                            jl6Var4.getClass();
                            jl6Var4.b(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair i2 = asbVar.i(zrbVar, xrbVar, 0, j);
            Object obj32 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (this.s) {
            }
            this.o = kl6Var;
            jl6Var = this.p;
            if (jl6Var != null) {
                vz6 vz6Var2 = jl6Var.a;
                obj = vz6Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a = vz6Var2.a(obj);
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

    @Override // i3d
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        y(null, this.k);
    }

    @Override // rg0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final jl6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        jl6 jl6Var = new jl6(vz6Var, rx6Var, j);
        yve.p(jl6Var.d == null);
        rg0 rg0Var = this.k;
        jl6Var.d = rg0Var;
        if (!this.r) {
            this.p = jl6Var;
            if (!this.q) {
                this.q = true;
                y(null, rg0Var);
            }
            return jl6Var;
        }
        Object obj = vz6Var.a;
        if (this.o.g != null && obj.equals(kl6.h)) {
            obj = this.o.g;
        }
        jl6Var.b(vz6Var.a(obj));
        return jl6Var;
    }

    public final boolean D(long j) {
        jl6 jl6Var = this.p;
        int b = this.o.b(jl6Var.a.a);
        if (b == -1) {
            return false;
        }
        kl6 kl6Var = this.o;
        xrb xrbVar = this.n;
        kl6Var.f(b, xrbVar, false);
        long j2 = xrbVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        jl6Var.h = j;
        return true;
    }

    @Override // i3d, rg0
    public final boolean a(ft6 ft6Var) {
        return this.k.a(ft6Var);
    }

    @Override // rg0
    public final void o(xt6 xt6Var) {
        jl6 jl6Var = (jl6) xt6Var;
        if (jl6Var.e != null) {
            rg0 rg0Var = jl6Var.d;
            rg0Var.getClass();
            rg0Var.o(jl6Var.e);
        }
        if (xt6Var == this.p) {
            this.p = null;
        }
    }

    @Override // cr2, rg0
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // i3d, rg0
    public final void t(ft6 ft6Var) {
        if (this.s) {
            kl6 kl6Var = this.o;
            asb asbVar = kl6Var.e;
            this.o = new kl6(asbVar instanceof lsb ? new lsb(((lsb) asbVar).e, ft6Var) : new lsb(asbVar, ft6Var), kl6Var.f, kl6Var.g);
        } else {
            this.o = new kl6(new ll6(ft6Var), zrb.p, kl6.h);
        }
        this.k.t(ft6Var);
    }

    @Override // i3d
    public final vz6 z(vz6 vz6Var) {
        Object obj = vz6Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = kl6.h;
        }
        return vz6Var.a(obj);
    }
}
