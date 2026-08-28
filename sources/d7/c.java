package d7;

import f7.r6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i9, int i10) {
        this.e = dVar;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        r6.a(i9, this.d);
        return this.e.get(i9 + this.c);
    }

    @Override // d7.a
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // d7.a
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // d7.a
    public final Object[] p() {
        return this.e.p();
    }

    @Override // d7.d, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final d subList(int i9, int i10) {
        r6.c(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
