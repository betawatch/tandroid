package l7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class r extends s {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ s e;

    public r(s sVar, int i10, int i11) {
        this.e = sVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k7.k.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // l7.o
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // l7.o
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // l7.o
    public final Object[] p() {
        return this.e.p();
    }

    @Override // l7.s, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final s subList(int i10, int i11) {
        k7.k.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
