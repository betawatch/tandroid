// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class emd extends vjd {
    public static final emd e = new emd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public emd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k4f.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // vjd, ejd
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // ejd
    public final int i() {
        return this.d;
    }

    @Override // ejd
    public final int j() {
        return 0;
    }

    @Override // ejd
    public final boolean l() {
        return false;
    }

    @Override // ejd
    public final Object[] m() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
