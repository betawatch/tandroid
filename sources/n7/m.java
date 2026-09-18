package n7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class m extends n {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ n e;

    public m(n nVar, int i10, int i11) {
        this.e = nVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // n7.i
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // n7.i
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // n7.i
    public final Object[] q() {
        return this.e.q();
    }

    @Override // n7.n, java.util.List
    /* renamed from: s */
    public final n subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
