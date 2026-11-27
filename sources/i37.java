// default package

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i37 extends cr2 {
    public static final ft6 s;
    public final rg0[] k;
    public final ArrayList l;
    public final asb[] m;
    public final ArrayList n;
    public final rg7 o;
    public int p;
    public long[][] q;
    public wk2 r;

    static {
        ts6 ts6Var = new ts6();
        ts6Var.a = "MergingMediaSource";
        s = ts6Var.a();
    }

    public i37(rg0... rg0VarArr) {
        rg7 rg7Var = new rg7((byte) 17);
        this.k = rg0VarArr;
        this.o = rg7Var;
        this.n = new ArrayList(Arrays.asList(rg0VarArr));
        this.p = -1;
        this.l = new ArrayList(rg0VarArr.length);
        for (int i = 0; i < rg0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new asb[rg0VarArr.length];
        this.q = new long[0][];
        awd.b(8, "expectedKeys");
        awd.b(2, "expectedValuesPerKey");
        lp2 c = lp2.c(8);
        ej7 ej7Var = new ej7();
        awd.b(2, "expectedValuesPerKey");
        new fj7(c).h = ej7Var;
    }

    @Override // rg0
    public final boolean a(ft6 ft6Var) {
        rg0[] rg0VarArr = this.k;
        return rg0VarArr.length > 0 && rg0VarArr[0].a(ft6Var);
    }

    @Override // rg0
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        rg0[] rg0VarArr = this.k;
        int length = rg0VarArr.length;
        xt6[] xt6VarArr = new xt6[length];
        asb[] asbVarArr = this.m;
        int b = asbVarArr[0].b(vz6Var.a);
        for (int i = 0; i < length; i++) {
            vz6 a = vz6Var.a(asbVarArr[i].l(b));
            xt6VarArr[i] = rg0VarArr[i].c(a, rx6Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new h37(a, xt6VarArr[i]));
        }
        return new g37(this.o, this.q[b], xt6VarArr);
    }

    @Override // rg0
    public final ft6 i() {
        rg0[] rg0VarArr = this.k;
        return rg0VarArr.length > 0 ? rg0VarArr[0].i() : s;
    }

    @Override // cr2, rg0
    public final void k() {
        wk2 wk2Var = this.r;
        if (wk2Var != null) {
            throw wk2Var;
        }
        super.k();
    }

    @Override // rg0
    public final void m(v2c v2cVar) {
        this.j = gcc.q(null);
        int i = 0;
        while (true) {
            rg0[] rg0VarArr = this.k;
            if (i >= rg0VarArr.length) {
                return;
            }
            y(Integer.valueOf(i), rg0VarArr[i]);
            i++;
        }
    }

    @Override // rg0
    public final void o(xt6 xt6Var) {
        g37 g37Var = (g37) xt6Var;
        int i = 0;
        while (true) {
            rg0[] rg0VarArr = this.k;
            if (i >= rg0VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = g37Var.b;
            xt6[] xt6VarArr = g37Var.a;
            xt6 xt6Var2 = zArr[i] ? ((rrb) xt6VarArr[i]).a : xt6VarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((h37) list.get(i2)).b.equals(xt6Var2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            rg0VarArr[i].o(g37Var.b[i] ? ((rrb) xt6VarArr[i]).a : xt6VarArr[i]);
            i++;
        }
    }

    @Override // cr2, rg0
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // rg0
    public final void t(ft6 ft6Var) {
        this.k[0].t(ft6Var);
    }

    @Override // cr2
    public final vz6 u(Integer num, vz6 vz6Var) {
        int intValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((h37) list.get(i)).a.equals(vz6Var)) {
                return ((h37) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // cr2
    public final void x(Integer num, rg0 rg0Var, asb asbVar) {
        int i;
        if (this.r == null) {
            if (this.p == -1) {
                i = asbVar.h();
                this.p = i;
            } else {
                int h = asbVar.h();
                int i2 = this.p;
                if (h != i2) {
                    this.r = new wk2();
                    return;
                }
                i = i2;
            }
            int length = this.q.length;
            asb[] asbVarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, asbVarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(rg0Var);
            asbVarArr[num.intValue()] = asbVar;
            if (arrayList.isEmpty()) {
                n(asbVarArr[0]);
            }
        }
    }
}
