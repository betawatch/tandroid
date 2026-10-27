package b9;

import a8.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends j {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ j e;

    public i(j jVar, int i10, int i11) {
        this.e = jVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w1.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // b9.g
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // b9.g
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // b9.g
    public final Object[] o() {
        return this.e.o();
    }

    @Override // b9.j, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final j subList(int i10, int i11) {
        w1.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
