package c8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        a8.f8.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // c8.e
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // c8.e
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // c8.e
    public final Object[] k() {
        return this.e.k();
    }

    @Override // c8.i, java.util.List
    /* renamed from: l */
    public final i subList(int i7, int i10) {
        a8.f8.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
