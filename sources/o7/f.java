package o7;

import b8.bf;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends e {
    public static final f e = new f(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public f(int i3, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        bf.a(i3, this.d);
        Object obj = this.c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o7.a
    public final Object[] h() {
        return this.c;
    }

    @Override // o7.a
    public final int i() {
        return 0;
    }

    @Override // o7.a
    public final int j() {
        return this.d;
    }

    @Override // o7.e, o7.a
    public final int k(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
