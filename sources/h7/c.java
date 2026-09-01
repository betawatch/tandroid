package h7;

import j7.u7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        u7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // h7.a
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // h7.a
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // h7.a
    public final Object[] p() {
        return this.e.p();
    }

    @Override // h7.d, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        u7.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
