package h3;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f2 extends a {
    public final int e;
    public final int f;
    public final int[] h;
    public final int[] n;
    public final r2[] r;
    public final Object[] s;
    public final HashMap v;

    public f2(ArrayList arrayList, j4.g1 g1Var) {
        super(g1Var);
        int size = arrayList.size();
        this.h = new int[size];
        this.n = new int[size];
        this.r = new r2[size];
        this.s = new Object[size];
        this.v = new HashMap();
        int size2 = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            l1 l1Var = (l1) obj;
            this.r[i11] = l1Var.b();
            this.n[i11] = i9;
            this.h[i11] = i10;
            i9 += this.r[i11].o();
            i10 += this.r[i11].h();
            this.s[i11] = l1Var.a();
            this.v.put(this.s[i11], Integer.valueOf(i11));
            i11++;
        }
        this.e = i9;
        this.f = i10;
    }

    @Override // h3.r2
    public final int h() {
        return this.f;
    }

    @Override // h3.r2
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
    public final int r(int i9) {
        return d5.f0.d(this.h, i9 + 1, false, false);
    }

    @Override // h3.a
    public final int s(int i9) {
        return d5.f0.d(this.n, i9 + 1, false, false);
    }

    @Override // h3.a
    public final Object t(int i9) {
        return this.s[i9];
    }

    @Override // h3.a
    public final int u(int i9) {
        return this.h[i9];
    }

    @Override // h3.a
    public final int v(int i9) {
        return this.n[i9];
    }

    @Override // h3.a
    public final r2 x(int i9) {
        return this.r[i9];
    }
}
