// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ihd extends ped {
    public static final ihd r = new ihd(0, new Object[0]);
    public final transient Object[] h;
    public final transient int n;

    public ihd(int i, Object[] objArr) {
        super((byte) 1);
        this.h = objArr;
        this.n = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k6f.a(i, this.n);
        Object obj = this.h[i];
        obj.getClass();
        return obj;
    }

    @Override // ped, zad
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // zad
    public final int i() {
        return this.n;
    }

    @Override // zad
    public final int j() {
        return 0;
    }

    @Override // zad
    public final Object[] k() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
