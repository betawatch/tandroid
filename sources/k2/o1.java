package k2;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o1 extends a {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final d2.n1[] l;
    public final Object[] m;
    public final HashMap n;

    public o1(d2.n1[] n1VarArr, Object[] objArr, w2.i1 i1Var) {
        super(i1Var);
        int length = n1VarArr.length;
        this.l = n1VarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = n1VarArr.length;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length2) {
            d2.n1 n1Var = n1VarArr[i3];
            this.l[i12] = n1Var;
            this.k[i12] = i10;
            this.j[i12] = i11;
            i10 += n1Var.o();
            i11 += this.l[i12].h();
            this.n.put(objArr[i12], Integer.valueOf(i12));
            i3++;
            i12++;
        }
        this.h = i10;
        this.i = i11;
    }

    @Override // d2.n1
    public final int h() {
        return this.i;
    }

    @Override // d2.n1
    public final int o() {
        return this.h;
    }

    @Override // k2.a
    public final int q(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // k2.a
    public final int r(int i3) {
        return g2.n0.e(this.j, i3 + 1, false, false);
    }

    @Override // k2.a
    public final int s(int i3) {
        return g2.n0.e(this.k, i3 + 1, false, false);
    }

    @Override // k2.a
    public final Object t(int i3) {
        return this.m[i3];
    }

    @Override // k2.a
    public final int u(int i3) {
        return this.j[i3];
    }

    @Override // k2.a
    public final int v(int i3) {
        return this.k[i3];
    }

    @Override // k2.a
    public final d2.n1 x(int i3) {
        return this.l[i3];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o1(ArrayList arrayList, w2.i1 i1Var) {
        this(r0, r1, i1Var);
        d2.n1[] n1VarArr = new d2.n1[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            n1VarArr[i10] = ((a1) obj).b();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            objArr[i3] = ((a1) obj2).a();
            i3++;
        }
    }
}
