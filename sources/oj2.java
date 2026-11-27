// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class oj2 extends i3d {
    public final ArrayList l;
    public final zrb m;
    public final vs6 n;
    public mj2 o;
    public nj2 p;
    public long q;
    public long r;

    public oj2(rx rxVar) {
        super((rg0) rxVar.c);
        this.n = new vs6((us6) rxVar.d);
        this.l = new ArrayList();
        this.m = new zrb();
    }

    @Override // i3d
    public final void A(asb asbVar) {
        if (this.p != null) {
            return;
        }
        C(asbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056 A[LOOP:1: B:33:0x0054->B:34:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(asb asbVar) {
        long j;
        long j2;
        long j3;
        int size;
        int i;
        zrb zrbVar = this.m;
        asbVar.n(0, zrbVar);
        long j4 = zrbVar.o;
        ArrayList arrayList = this.l;
        boolean isEmpty = arrayList.isEmpty();
        vs6 vs6Var = this.n;
        long j5 = Long.MIN_VALUE;
        if (isEmpty || this.o == null || vs6Var.e) {
            j = vs6Var.b;
            long j6 = vs6Var.d;
            if (vs6Var.f) {
                long j7 = zrbVar.k;
                j += j7;
                if (j6 != Long.MIN_VALUE) {
                    j3 = j7 + j6;
                    j2 = Long.MIN_VALUE;
                    this.q = j4 + j;
                    this.r = j6 != j2 ? j2 : j4 + j3;
                    size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        lj2 lj2Var = (lj2) arrayList.get(i);
                        long j8 = this.q;
                        long j9 = this.r;
                        lj2Var.n = j8;
                        lj2Var.r = j9;
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
            mj2 mj2Var = new mj2(asbVar, j, j5, vs6Var.h);
            this.o = mj2Var;
            n(mj2Var);
        } catch (nj2 e) {
            this.p = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((lj2) arrayList.get(i2)).s = this.p;
            }
        }
    }

    @Override // i3d, rg0
    public final boolean a(ft6 ft6Var) {
        rg0 rg0Var = this.k;
        return rg0Var.a(ft6Var) && rg0Var.i().e.equals(ft6Var.e);
    }

    @Override // rg0
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        lj2 lj2Var = new lj2(this.k.c(vz6Var, rx6Var, j), !this.n.g, this.q, this.r, 0);
        this.l.add(lj2Var);
        return lj2Var;
    }

    @Override // cr2, rg0
    public final void k() {
        nj2 nj2Var = this.p;
        if (nj2Var != null) {
            throw nj2Var;
        }
        super.k();
    }

    @Override // rg0
    public final void o(xt6 xt6Var) {
        ArrayList arrayList = this.l;
        yve.p(arrayList.remove(xt6Var));
        this.k.o(((lj2) xt6Var).a);
        if (!arrayList.isEmpty() || this.n.e) {
            return;
        }
        mj2 mj2Var = this.o;
        mj2Var.getClass();
        C(mj2Var.e);
    }

    @Override // cr2, rg0
    public final void q() {
        super.q();
        this.p = null;
        this.o = null;
    }
}
