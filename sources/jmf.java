// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jmf extends wbf {
    public final transient Object[] h;
    public final transient boolean n;
    public final transient boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    public jmf(int i, Object[] objArr) {
        super((byte) 2);
        this.h = objArr;
        this.n = i;
        this.r = true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i6f.a(i, this.r ? 1 : 0);
        Object obj = this.h[(i << 1) + (this.n ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r ? 1 : 0;
    }
}
