package c9;

import b8.q9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends i {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i e;

    public h(i iVar, int i3, int i10) {
        this.e = iVar;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        q9.a(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // c9.f
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // c9.f
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // c9.f
    public final Object[] k() {
        return this.e.k();
    }

    @Override // c9.i, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final i subList(int i3, int i10) {
        q9.b(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
