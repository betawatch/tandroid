package k7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends i {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i e;

    public h(i iVar, int i10, int i11) {
        this.e = iVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g7.f9.b(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // k7.e
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // k7.e
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // k7.e
    public final Object[] p() {
        return this.e.p();
    }

    @Override // k7.i, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i subList(int i10, int i11) {
        g7.f9.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
