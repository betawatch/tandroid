package i2;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l1 extends a {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final b2.k1[] l;
    public final Object[] m;
    public final HashMap n;

    public l1(b2.k1[] k1VarArr, Object[] objArr, u2.g1 g1Var) {
        super(g1Var);
        int length = k1VarArr.length;
        this.l = k1VarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = k1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b2.k1 k1Var = k1VarArr[i10];
            this.l[i13] = k1Var;
            this.k[i13] = i11;
            this.j[i13] = i12;
            i11 += k1Var.o();
            i12 += this.l[i13].h();
            this.n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.h = i11;
        this.i = i12;
    }

    @Override // b2.k1
    public final int h() {
        return this.i;
    }

    @Override // b2.k1
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
        return e2.d0.d(this.j, i10 + 1, false, false);
    }

    @Override // i2.a
    public final int s(int i10) {
        return e2.d0.d(this.k, i10 + 1, false, false);
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
    public final b2.k1 x(int i10) {
        return this.l[i10];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l1(ArrayList arrayList, u2.g1 g1Var) {
        this(r0, r1, g1Var);
        b2.k1[] k1VarArr = new b2.k1[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            k1VarArr[i11] = ((w0) obj).b();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            objArr[i10] = ((w0) obj2).a();
            i10++;
        }
    }
}
