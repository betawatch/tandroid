// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kbe extends k8e {
    public final transient Object[] r;
    public final transient boolean s;
    public final transient int w;

    /* JADX WARN: Multi-variable type inference failed */
    public kbe(int i, int i2, Object[] objArr) {
        super((byte) 5);
        this.r = objArr;
        this.s = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h6f.a(i, this.w);
        Object obj = this.r[(i << 1) + (this.s ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
