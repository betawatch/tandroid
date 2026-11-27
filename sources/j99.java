// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j99 extends po5 {
    public static final j99 e = new j99(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public j99(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yve.j(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // po5, jo5
    public final int i(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // jo5
    public final Object[] j() {
        return this.c;
    }

    @Override // jo5
    public final int k() {
        return this.d;
    }

    @Override // jo5
    public final int l() {
        return 0;
    }

    @Override // jo5
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
