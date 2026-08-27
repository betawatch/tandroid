package h3;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f2 extends a {
    public final int e;
    public final int f;
    public final int[] h;
    public final int[] n;
    public final s2[] r;
    public final Object[] s;
    public final HashMap v;

    public f2(ArrayList arrayList, j4.g1 g1Var) {
        super(g1Var);
        int size = arrayList.size();
        this.h = new int[size];
        this.n = new int[size];
        this.r = new s2[size];
        this.s = new Object[size];
        this.v = new HashMap();
        int size2 = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList.get(i13);
            i13++;
            l1 l1Var = (l1) obj;
            this.r[i12] = l1Var.b();
            this.n[i12] = i10;
            this.h[i12] = i11;
            i10 += this.r[i12].o();
            i11 += this.r[i12].h();
            this.s[i12] = l1Var.a();
            this.v.put(this.s[i12], Integer.valueOf(i12));
            i12++;
        }
        this.e = i10;
        this.f = i11;
    }

    @Override // h3.s2
    public final int h() {
        return this.f;
    }

    @Override // h3.s2
    public final int o() {
        return this.e;
    }

    @Override // h3.a
    public final int q(Object obj) {
        Integer num = (Integer) this.v.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // h3.a
    public final int r(int i10) {
        return d5.g0.d(this.h, i10 + 1, false, false);
    }

    @Override // h3.a
    public final int s(int i10) {
        return d5.g0.d(this.n, i10 + 1, false, false);
    }

    @Override // h3.a
    public final Object t(int i10) {
        return this.s[i10];
    }

    @Override // h3.a
    public final int u(int i10) {
        return this.h[i10];
    }

    @Override // h3.a
    public final int v(int i10) {
        return this.n[i10];
    }

    @Override // h3.a
    public final s2 x(int i10) {
        return this.r[i10];
    }
}
