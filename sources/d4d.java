// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d4d extends e4d {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ e4d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4d(e4d e4dVar, int i, int i2) {
        super((byte) 0);
        this.w = e4dVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i3f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // b4d
    public final int i() {
        return this.w.j() + this.r + this.s;
    }

    @Override // b4d
    public final int j() {
        return this.w.j() + this.r;
    }

    @Override // b4d
    public final Object[] k() {
        return this.w.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // e4d, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final e4d subList(int i, int i2) {
        i3f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
