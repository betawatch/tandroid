package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class qa extends ra {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ra e;

    public qa(ra raVar, int i10, int i11) {
        this.e = raVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j7.u8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // k7.j9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // k7.j9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // k7.j9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // k7.ra, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ra subList(int i10, int i11) {
        j7.u8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
