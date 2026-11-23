package d9;

import a8.r9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h extends i {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i e;

    public h(i iVar, int i7, int i10) {
        this.e = iVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        r9.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // d9.f
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // d9.f
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // d9.f
    public final Object[] k() {
        return this.e.k();
    }

    @Override // d9.i, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final i subList(int i7, int i10) {
        r9.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
