// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hfd extends ncd {
    public static final hfd r = new hfd(0, new Object[0]);
    public final transient Object[] h;
    public final transient int n;

    public hfd(int i, Object[] objArr) {
        super((byte) 1);
        this.h = objArr;
        this.n = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i4f.a(i, this.n);
        Object obj = this.h[i];
        obj.getClass();
        return obj;
    }

    @Override // ncd, x8d
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // x8d
    public final int i() {
        return this.n;
    }

    @Override // x8d
    public final int j() {
        return 0;
    }

    @Override // x8d
    public final Object[] k() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
