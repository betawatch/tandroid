// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mzc extends nzc {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ nzc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzc(nzc nzcVar, int i, int i2) {
        super((byte) 0);
        this.w = nzcVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qye.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // kzc
    public final int i() {
        return this.w.j() + this.r + this.s;
    }

    @Override // kzc
    public final int j() {
        return this.w.j() + this.r;
    }

    @Override // kzc
    public final Object[] k() {
        return this.w.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // nzc, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final nzc subList(int i, int i2) {
        qye.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
