package i7;

import j7.d8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        d8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // i7.a
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // i7.a
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // i7.a
    public final Object[] p() {
        return this.e.p();
    }

    @Override // i7.d, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        d8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
