package n7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // n7.i
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // n7.i
    public final Object[] p() {
        return this.e.p();
    }

    @Override // n7.n, java.util.List
    /* renamed from: r */
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
