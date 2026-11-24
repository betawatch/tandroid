// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gk2 extends t0d {
    public final ArrayList l;
    public final aqb m;
    public final rs6 n;
    public ek2 o;
    public fk2 p;
    public long q;
    public long r;

    public gk2(ry ryVar) {
        super((rh0) ryVar.c);
        this.n = new rs6((qs6) ryVar.d);
        this.l = new ArrayList();
        this.m = new aqb();
    }

    @Override // t0d
    public final void A(bqb bqbVar) {
        if (this.p != null) {
            return;
        }
        C(bqbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056 A[LOOP:1: B:33:0x0054->B:34:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(bqb bqbVar) {
        long j;
        long j2;
        long j3;
        int size;
        int i;
        aqb aqbVar = this.m;
        bqbVar.n(0, aqbVar);
        long j4 = aqbVar.o;
        ArrayList arrayList = this.l;
        boolean isEmpty = arrayList.isEmpty();
        rs6 rs6Var = this.n;
        long j5 = Long.MIN_VALUE;
        if (isEmpty || this.o == null || rs6Var.e) {
            j = rs6Var.b;
            long j6 = rs6Var.d;
            if (rs6Var.f) {
                long j7 = aqbVar.k;
                j += j7;
                if (j6 != Long.MIN_VALUE) {
                    j3 = j7 + j6;
                    j2 = Long.MIN_VALUE;
                    this.q = j4 + j;
                    this.r = j6 != j2 ? j2 : j4 + j3;
                    size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        dk2 dk2Var = (dk2) arrayList.get(i);
                        long j8 = this.q;
                        long j9 = this.r;
                        dk2Var.n = j8;
                        dk2Var.r = j9;
                    }
                    j5 = j3;
                }
            }
            j2 = Long.MIN_VALUE;
            j3 = j6;
            this.q = j4 + j;
            this.r = j6 != j2 ? j2 : j4 + j3;
            size = arrayList.size();
            while (i < size) {
            }
            j5 = j3;
        } else {
            j = this.q - j4;
            long j10 = this.r;
            if (j10 != Long.MIN_VALUE) {
                j5 = j10 - j4;
            }
        }
        try {
            ek2 ek2Var = new ek2(bqbVar, j, j5, rs6Var.h);
            this.o = ek2Var;
            n(ek2Var);
        } catch (fk2 e) {
            this.p = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((dk2) arrayList.get(i2)).s = this.p;
            }
        }
    }

    @Override // t0d, rh0
    public final boolean a(bt6 bt6Var) {
        rh0 rh0Var = this.k;
        return rh0Var.a(bt6Var) && rh0Var.i().e.equals(bt6Var.e);
    }

    @Override // rh0
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        dk2 dk2Var = new dk2(this.k.c(rz6Var, mx6Var, j), !this.n.g, this.q, this.r, 0);
        this.l.add(dk2Var);
        return dk2Var;
    }

    @Override // ur2, rh0
    public final void k() {
        fk2 fk2Var = this.p;
        if (fk2Var != null) {
            throw fk2Var;
        }
        super.k();
    }

    @Override // rh0
    public final void o(tt6 tt6Var) {
        ArrayList arrayList = this.l;
        jte.p(arrayList.remove(tt6Var));
        this.k.o(((dk2) tt6Var).a);
        if (!arrayList.isEmpty() || this.n.e) {
            return;
        }
        ek2 ek2Var = this.o;
        ek2Var.getClass();
        C(ek2Var.e);
    }

    @Override // ur2, rh0
    public final void q() {
        super.q();
        this.p = null;
        this.o = null;
    }
}
