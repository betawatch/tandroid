package f7;

import j7.l7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v extends u {
    public static final v e = new v(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public v(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l7.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // f7.u, f7.r
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // f7.r
    public final int n() {
        return this.d;
    }

    @Override // f7.r
    public final int o() {
        return 0;
    }

    @Override // f7.r
    public final boolean p() {
        return false;
    }

    @Override // f7.r
    public final Object[] q() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
