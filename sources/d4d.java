// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d4d extends e4d {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ e4d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4d(e4d e4dVar, int i, int i2) {
        super((byte) 1);
        this.w = e4dVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yye.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // kzc
    public final int m() {
        return this.w.n() + this.r + this.s;
    }

    @Override // kzc
    public final int n() {
        return this.w.n() + this.r;
    }

    @Override // kzc
    public final Object[] o() {
        return this.w.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // e4d, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final e4d subList(int i, int i2) {
        yye.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
