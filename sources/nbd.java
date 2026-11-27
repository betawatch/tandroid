// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nbd extends tbd {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ tbd w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbd(tbd tbdVar, int i, int i2) {
        super((byte) 3);
        this.w = tbdVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        t8f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // b4d
    public final Object[] r() {
        return this.w.r();
    }

    @Override // b4d
    public final int s() {
        return this.w.s() + this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // b4d
    public final int t() {
        return this.w.s() + this.r + this.s;
    }

    @Override // tbd, java.util.List
    /* renamed from: z */
    public final tbd subList(int i, int i2) {
        t8f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
