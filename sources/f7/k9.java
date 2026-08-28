package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k9 extends l9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ l9 e;

    public k9(l9 l9Var, int i9, int i10) {
        this.e = l9Var;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        a7.a(i9, this.d);
        return this.e.get(i9 + this.c);
    }

    @Override // f7.i9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // f7.i9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // f7.i9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // f7.l9, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final l9 subList(int i9, int i10) {
        a7.b(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
