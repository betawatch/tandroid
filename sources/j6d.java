// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j6d extends r6d {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ r6d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6d(r6d r6dVar, int i, int i2) {
        super((byte) 2);
        this.w = r6dVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k4f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // kzc
    public final int q() {
        return this.w.s() + this.r + this.s;
    }

    @Override // kzc
    public final int s() {
        return this.w.s() + this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // kzc
    public final Object[] v() {
        return this.w.v();
    }

    @Override // r6d, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final r6d subList(int i, int i2) {
        k4f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
