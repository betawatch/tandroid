// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lid extends ted {
    public static final lid r = new lid(0, new Object[0]);
    public final transient Object[] h;
    public final transient int n;

    public lid(int i, Object[] objArr) {
        super((byte) 0);
        this.h = objArr;
        this.n = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d7f.a(i, this.n);
        Object obj = this.h[i];
        obj.getClass();
        return obj;
    }

    @Override // ted, qdd
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // qdd
    public final int i() {
        return this.n;
    }

    @Override // qdd
    public final int j() {
        return 0;
    }

    @Override // qdd
    public final Object[] k() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
