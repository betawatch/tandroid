// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jcd extends tbd {
    public static final jcd w = new jcd(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public jcd(int i, Object[] objArr) {
        super((byte) 3);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        t8f.a(i, this.s);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // b4d
    public final Object[] r() {
        return this.r;
    }

    @Override // b4d
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // b4d
    public final int t() {
        return this.s;
    }

    @Override // tbd, b4d
    public final int w(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
