// default package

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b17 extends jq2 {
    public static final br6 s;
    public final qg0[] k;
    public final ArrayList l;
    public final aob[] m;
    public final ArrayList n;
    public final ie7 o;
    public int p;
    public long[][] q;
    public bk2 r;

    static {
        pq6 pq6Var = new pq6();
        pq6Var.a = "MergingMediaSource";
        s = pq6Var.a();
    }

    public b17(qg0... qg0VarArr) {
        ie7 ie7Var = new ie7((byte) 17);
        this.k = qg0VarArr;
        this.o = ie7Var;
        this.n = new ArrayList(Arrays.asList(qg0VarArr));
        this.p = -1;
        this.l = new ArrayList(qg0VarArr.length);
        for (int i = 0; i < qg0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new aob[qg0VarArr.length];
        this.q = new long[0][];
        krd.b(8, "expectedKeys");
        krd.b(2, "expectedValuesPerKey");
        so2 c = so2.c(8);
        vg7 vg7Var = new vg7();
        krd.b(2, "expectedValuesPerKey");
        new wg7(c).h = vg7Var;
    }

    @Override // qg0
    public final boolean a(br6 br6Var) {
        qg0[] qg0VarArr = this.k;
        return qg0VarArr.length > 0 && qg0VarArr[0].a(br6Var);
    }

    @Override // qg0
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        qg0[] qg0VarArr = this.k;
        int length = qg0VarArr.length;
        sr6[] sr6VarArr = new sr6[length];
        aob[] aobVarArr = this.m;
        int b = aobVarArr[0].b(rx6Var.a);
        for (int i = 0; i < length; i++) {
            rx6 a = rx6Var.a(aobVarArr[i].l(b));
            sr6VarArr[i] = qg0VarArr[i].c(a, mv6Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new a17(a, sr6VarArr[i]));
        }
        return new z07(this.o, this.q[b], sr6VarArr);
    }

    @Override // qg0
    public final br6 i() {
        qg0[] qg0VarArr = this.k;
        return qg0VarArr.length > 0 ? qg0VarArr[0].i() : s;
    }

    @Override // jq2, qg0
    public final void k() {
        bk2 bk2Var = this.r;
        if (bk2Var != null) {
            throw bk2Var;
        }
        super.k();
    }

    @Override // qg0
    public final void m(vyb vybVar) {
        this.j = g8c.q(null);
        int i = 0;
        while (true) {
            qg0[] qg0VarArr = this.k;
            if (i >= qg0VarArr.length) {
                return;
            }
            y(Integer.valueOf(i), qg0VarArr[i]);
            i++;
        }
    }

    @Override // qg0
    public final void o(sr6 sr6Var) {
        z07 z07Var = (z07) sr6Var;
        int i = 0;
        while (true) {
            qg0[] qg0VarArr = this.k;
            if (i >= qg0VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = z07Var.b;
            sr6[] sr6VarArr = z07Var.a;
            sr6 sr6Var2 = zArr[i] ? ((rnb) sr6VarArr[i]).a : sr6VarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((a17) list.get(i2)).b.equals(sr6Var2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            qg0VarArr[i].o(z07Var.b[i] ? ((rnb) sr6VarArr[i]).a : sr6VarArr[i]);
            i++;
        }
    }

    @Override // jq2, qg0
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // qg0
    public final void t(br6 br6Var) {
        this.k[0].t(br6Var);
    }

    @Override // jq2
    public final rx6 u(Integer num, rx6 rx6Var) {
        int intValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((a17) list.get(i)).a.equals(rx6Var)) {
                return ((a17) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // jq2
    public final void x(Integer num, qg0 qg0Var, aob aobVar) {
        int i;
        if (this.r == null) {
            if (this.p == -1) {
                i = aobVar.h();
                this.p = i;
            } else {
                int h = aobVar.h();
                int i2 = this.p;
                if (h != i2) {
                    this.r = new bk2();
                    return;
                }
                i = i2;
            }
            int length = this.q.length;
            aob[] aobVarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, aobVarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(qg0Var);
            aobVarArr[num.intValue()] = aobVar;
            if (arrayList.isEmpty()) {
                n(aobVarArr[0]);
            }
        }
    }
}
