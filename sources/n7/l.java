package n7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l extends m {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ m e;

    public l(m mVar, int i10, int i11) {
        this.e = mVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // n7.h
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // n7.h
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // n7.h
    public final Object[] p() {
        return this.e.p();
    }

    @Override // n7.m, java.util.List
    /* renamed from: r */
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
