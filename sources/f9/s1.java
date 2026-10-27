package f9;

import a8.yb;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s1 extends i0 {
    public static final s1 e = new s1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public s1(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        yb.j(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // f9.i0, f9.d0
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // f9.d0
    public final Object[] n() {
        return this.c;
    }

    @Override // f9.d0
    public final int o() {
        return this.d;
    }

    @Override // f9.d0
    public final int p() {
        return 0;
    }

    @Override // f9.d0
    public final boolean q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
