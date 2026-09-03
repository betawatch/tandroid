package o8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        k7.i0.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // o8.f
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // o8.f
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // o8.f
    public final Object[] p() {
        return this.e.p();
    }

    @Override // o8.i, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i subList(int i10, int i11) {
        k7.i0.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
