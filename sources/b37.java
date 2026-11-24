// default package

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b37 extends ur2 {
    public static final bt6 s;
    public final rh0[] k;
    public final ArrayList l;
    public final bqb[] m;
    public final ArrayList n;
    public final kg7 o;
    public int p;
    public long[][] q;
    public ol2 r;

    static {
        ps6 ps6Var = new ps6();
        ps6Var.a = "MergingMediaSource";
        s = ps6Var.a();
    }

    public b37(rh0... rh0VarArr) {
        kg7 kg7Var = new kg7((byte) 17);
        this.k = rh0VarArr;
        this.o = kg7Var;
        this.n = new ArrayList(Arrays.asList(rh0VarArr));
        this.p = -1;
        this.l = new ArrayList(rh0VarArr.length);
        for (int i = 0; i < rh0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new bqb[rh0VarArr.length];
        this.q = new long[0][];
        ntd.b(8, "expectedKeys");
        ntd.b(2, "expectedValuesPerKey");
        dq2 c = dq2.c(8);
        yi7 yi7Var = new yi7();
        ntd.b(2, "expectedValuesPerKey");
        new zi7(c).h = yi7Var;
    }

    @Override // rh0
    public final boolean a(bt6 bt6Var) {
        rh0[] rh0VarArr = this.k;
        return rh0VarArr.length > 0 && rh0VarArr[0].a(bt6Var);
    }

    @Override // rh0
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        rh0[] rh0VarArr = this.k;
        int length = rh0VarArr.length;
        tt6[] tt6VarArr = new tt6[length];
        bqb[] bqbVarArr = this.m;
        int b = bqbVarArr[0].b(rz6Var.a);
        for (int i = 0; i < length; i++) {
            rz6 a = rz6Var.a(bqbVarArr[i].l(b));
            tt6VarArr[i] = rh0VarArr[i].c(a, mx6Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new a37(a, tt6VarArr[i]));
        }
        return new z27(this.o, this.q[b], tt6VarArr);
    }

    @Override // rh0
    public final bt6 i() {
        rh0[] rh0VarArr = this.k;
        return rh0VarArr.length > 0 ? rh0VarArr[0].i() : s;
    }

    @Override // ur2, rh0
    public final void k() {
        ol2 ol2Var = this.r;
        if (ol2Var != null) {
            throw ol2Var;
        }
        super.k();
    }

    @Override // rh0
    public final void m(w0c w0cVar) {
        this.j = hac.q(null);
        int i = 0;
        while (true) {
            rh0[] rh0VarArr = this.k;
            if (i >= rh0VarArr.length) {
                return;
            }
            y(Integer.valueOf(i), rh0VarArr[i]);
            i++;
        }
    }

    @Override // rh0
    public final void o(tt6 tt6Var) {
        z27 z27Var = (z27) tt6Var;
        int i = 0;
        while (true) {
            rh0[] rh0VarArr = this.k;
            if (i >= rh0VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = z27Var.b;
            tt6[] tt6VarArr = z27Var.a;
            tt6 tt6Var2 = zArr[i] ? ((spb) tt6VarArr[i]).a : tt6VarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((a37) list.get(i2)).b.equals(tt6Var2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            rh0VarArr[i].o(z27Var.b[i] ? ((spb) tt6VarArr[i]).a : tt6VarArr[i]);
            i++;
        }
    }

    @Override // ur2, rh0
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // rh0
    public final void t(bt6 bt6Var) {
        this.k[0].t(bt6Var);
    }

    @Override // ur2
    public final rz6 u(Integer num, rz6 rz6Var) {
        int intValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((a37) list.get(i)).a.equals(rz6Var)) {
                return ((a37) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // ur2
    public final void x(Integer num, rh0 rh0Var, bqb bqbVar) {
        int i;
        if (this.r == null) {
            if (this.p == -1) {
                i = bqbVar.h();
                this.p = i;
            } else {
                int h = bqbVar.h();
                int i2 = this.p;
                if (h != i2) {
                    this.r = new ol2();
                    return;
                }
                i = i2;
            }
            int length = this.q.length;
            bqb[] bqbVarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, bqbVarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(rh0Var);
            bqbVarArr[num.intValue()] = bqbVar;
            if (arrayList.isEmpty()) {
                n(bqbVarArr[0]);
            }
        }
    }
}
