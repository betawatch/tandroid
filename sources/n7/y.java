package n7;

import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class y extends n {
    public static final y e = new y(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public y(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a.e(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // n7.n, n7.i
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // n7.i
    public final int n() {
        return this.d;
    }

    @Override // n7.i
    public final int o() {
        return 0;
    }

    @Override // n7.i
    public final Object[] q() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
