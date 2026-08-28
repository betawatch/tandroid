package b7;

import f7.i0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends v {
    public static final w e = new w(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public w(int i9, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        i0.a(i9, this.d);
        Object obj = this.c[i9];
        obj.getClass();
        return obj;
    }

    @Override // b7.v, b7.s
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // b7.s
    public final int n() {
        return this.d;
    }

    @Override // b7.s
    public final int o() {
        return 0;
    }

    @Override // b7.s
    public final boolean p() {
        return false;
    }

    @Override // b7.s
    public final Object[] q() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
