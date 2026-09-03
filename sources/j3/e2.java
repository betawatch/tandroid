package j3;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e2 extends a {
    public final int e;
    public final int f;
    public final int[] h;
    public final int[] n;
    public final o2[] r;
    public final Object[] s;
    public final HashMap v;

    public e2(o2[] o2VarArr, Object[] objArr, o4.q0 q0Var) {
        super(q0Var);
        int length = o2VarArr.length;
        this.r = o2VarArr;
        this.h = new int[length];
        this.n = new int[length];
        this.s = objArr;
        this.v = new HashMap();
        int length2 = o2VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            o2 o2Var = o2VarArr[i10];
            this.r[i13] = o2Var;
            this.n[i13] = i11;
            this.h[i13] = i12;
            i11 += o2Var.o();
            i12 += this.r[i13].h();
            this.v.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.e = i11;
        this.f = i12;
    }

    @Override // j3.o2
    public final int h() {
        return this.f;
    }

    @Override // j3.o2
    public final int o() {
        return this.e;
    }

    @Override // j3.a
    public final int q(Object obj) {
        Integer num = (Integer) this.v.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // j3.a
    public final int r(int i10) {
        return h5.d0.d(this.h, i10 + 1, false, false);
    }

    @Override // j3.a
    public final int s(int i10) {
        return h5.d0.d(this.n, i10 + 1, false, false);
    }

    @Override // j3.a
    public final Object t(int i10) {
        return this.s[i10];
    }

    @Override // j3.a
    public final int u(int i10) {
        return this.h[i10];
    }

    @Override // j3.a
    public final int v(int i10) {
        return this.n[i10];
    }

    @Override // j3.a
    public final o2 x(int i10) {
        return this.r[i10];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e2(ArrayList arrayList, o4.q0 q0Var) {
        this(r0, r1, q0Var);
        o2[] o2VarArr = new o2[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            o2VarArr[i11] = ((i1) obj).b();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            objArr[i10] = ((i1) obj2).a();
            i10++;
        }
    }
}
