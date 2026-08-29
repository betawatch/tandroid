package d7;

import h7.z6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u extends t {
    public static final u e = new u(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public u(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z6.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // d7.t, d7.q
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // d7.q
    public final int n() {
        return this.d;
    }

    @Override // d7.q
    public final int o() {
        return 0;
    }

    @Override // d7.q
    public final boolean p() {
        return false;
    }

    @Override // d7.q
    public final Object[] q() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
