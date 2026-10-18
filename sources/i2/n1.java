package i2;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class n1 extends a {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final b2.o1[] l;
    public final Object[] m;
    public final HashMap n;

    public n1(b2.o1[] o1VarArr, Object[] objArr, u2.j1 j1Var) {
        super(j1Var);
        int length = o1VarArr.length;
        this.l = o1VarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = o1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.o1 o1Var = o1VarArr[i10];
            this.l[i13] = o1Var;
            this.k[i13] = i11;
            this.j[i13] = i12;
            i11 += o1Var.o();
            i12 += this.l[i13].h();
            this.n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.i = i12;
    }

    @Override // b2.o1
    public final int h() {
        return this.i;
    }

    @Override // b2.o1
    public final int o() {
        return this.h;
    }

    @Override // i2.a
    public final int q(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // i2.a
    public final int r(int i10) {
        return e2.m0.e(this.j, i10 + 1, false, false);
    }

    @Override // i2.a
    public final int s(int i10) {
        return e2.m0.e(this.k, i10 + 1, false, false);
    }

    @Override // i2.a
    public final Object t(int i10) {
        return this.m[i10];
    }

    @Override // i2.a
    public final int u(int i10) {
        return this.j[i10];
    }

    @Override // i2.a
    public final int v(int i10) {
        return this.k[i10];
    }

    @Override // i2.a
    public final b2.o1 x(int i10) {
        return this.l[i10];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n1(ArrayList arrayList, u2.j1 j1Var) {
        this(r0, r1, j1Var);
        b2.o1[] o1VarArr = new b2.o1[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            o1VarArr[i11] = ((z0) obj).b();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            objArr[i10] = ((z0) obj2).a();
            i10++;
        }
    }
}
