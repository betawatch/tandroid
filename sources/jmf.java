// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
