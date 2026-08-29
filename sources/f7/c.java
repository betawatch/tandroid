package f7;

import h7.i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // f7.a
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // f7.a
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // f7.a
    public final Object[] p() {
        return this.e.p();
    }

    @Override // f7.d, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        i7.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
