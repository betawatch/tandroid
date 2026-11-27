// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class o9f extends wbf {
    public final transient int h;
    public final transient int n;
    public final /* synthetic */ wbf r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9f(wbf wbfVar, int i, int i2) {
        super((byte) 2);
        this.r = wbfVar;
        this.h = i;
        this.n = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i6f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override // qdd
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override // qdd
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override // qdd
    public final Object[] k() {
        return this.r.k();
    }

    @Override // wbf, java.util.List
    /* renamed from: l */
    public final wbf subList(int i, int i2) {
        i6f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
