package a8;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class t extends u {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ u e;

    public t(u uVar, int i7, int i10) {
        this.e = uVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        x0.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // a8.p
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // a8.p
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // a8.p
    public final Object[] k() {
        return this.e.k();
    }

    @Override // a8.u, java.util.List
    /* renamed from: l */
    public final u subList(int i7, int i10) {
        x0.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
