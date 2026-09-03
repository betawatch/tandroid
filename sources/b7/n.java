package b7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n extends o {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ o e;

    public n(o oVar, int i10, int i11) {
        this.e = oVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b.e(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // b7.j
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // b7.j
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // b7.j
    public final Object[] q() {
        return this.e.q();
    }

    @Override // b7.o, java.util.List
    /* renamed from: s */
    public final o subList(int i10, int i11) {
        b.m(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
