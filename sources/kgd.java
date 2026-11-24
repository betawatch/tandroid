// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kgd extends ccd {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    public kgd(int i, Object[] objArr) {
        super((byte) 0);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        n4f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r ? 1 : 0;
    }
}
