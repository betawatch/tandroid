package l2;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p1 extends a {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final e2.l1[] l;
    public final Object[] m;
    public final HashMap n;

    public p1(e2.l1[] l1VarArr, Object[] objArr, x2.h1 h1Var) {
        super(h1Var);
        int length = l1VarArr.length;
        this.l = l1VarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = l1VarArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < length2) {
            e2.l1 l1Var = l1VarArr[i7];
            this.l[i12] = l1Var;
            this.k[i12] = i10;
            this.j[i12] = i11;
            i10 += l1Var.o();
            i11 += this.l[i12].h();
            this.n.put(objArr[i12], Integer.valueOf(i12));
            i7++;
            i12++;
        }
        this.h = i10;
        this.i = i11;
    }

    @Override // e2.l1
    public final int h() {
        return this.i;
    }

    @Override // e2.l1
    public final int o() {
        return this.h;
    }

    @Override // l2.a
    public final int q(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // l2.a
    public final int r(int i7) {
        return h2.m0.e(this.j, i7 + 1, false, false);
    }

    @Override // l2.a
    public final int s(int i7) {
        return h2.m0.e(this.k, i7 + 1, false, false);
    }

    @Override // l2.a
    public final Object t(int i7) {
        return this.m[i7];
    }

    @Override // l2.a
    public final int u(int i7) {
        return this.j[i7];
    }

    @Override // l2.a
    public final int v(int i7) {
        return this.k[i7];
    }

    @Override // l2.a
    public final e2.l1 x(int i7) {
        return this.l[i7];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p1(ArrayList arrayList, x2.h1 h1Var) {
        this(r0, r1, h1Var);
        e2.l1[] l1VarArr = new e2.l1[arrayList.size()];
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            l1VarArr[i10] = ((b1) obj).b();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            objArr[i7] = ((b1) obj2).a();
            i7++;
        }
    }
}
