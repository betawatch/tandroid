// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class f4d extends e4d {
    public static final f4d s = new f4d(new Object[0]);
    public final transient Object[] r;

    public f4d(Object[] objArr) {
        super((byte) 0);
        this.r = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i3f.a(i, 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e4d, b4d
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
        return 0;
    }

    @Override // b4d
    public final Object[] k() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
