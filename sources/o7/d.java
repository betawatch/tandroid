package o7;

import b8.bf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends e {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ e e;

    public d(e eVar, int i3, int i10) {
        this.e = eVar;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        bf.a(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // o7.a
    public final Object[] h() {
        return this.e.h();
    }

    @Override // o7.a
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // o7.a
    public final int j() {
        return this.e.i() + this.c + this.d;
    }

    @Override // o7.e, java.util.List
    /* renamed from: m */
    public final e subList(int i3, int i10) {
        bf.b(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
