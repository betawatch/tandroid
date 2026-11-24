// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n1d extends o1d {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ o1d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1d(o1d o1dVar, int i, int i2) {
        super((byte) 0);
        this.w = o1dVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        s0f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // l1d
    public final int i() {
        return this.w.j() + this.r + this.s;
    }

    @Override // l1d
    public final int j() {
        return this.w.j() + this.r;
    }

    @Override // l1d
    public final Object[] k() {
        return this.w.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // o1d, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o1d subList(int i, int i2) {
        s0f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
