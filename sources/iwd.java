// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class iwd extends dwd {
    public static final iwd e = new iwd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public iwd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a6f.a(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // dwd, qvd
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // qvd
    public final int i() {
        return this.d;
    }

    @Override // qvd
    public final boolean k() {
        return false;
    }

    @Override // qvd
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
