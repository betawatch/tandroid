package j7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k9 extends l9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ l9 e;

    public k9(l9 l9Var, int i10, int i11) {
        this.e = l9Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // j7.i9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // j7.i9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // j7.i9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // j7.l9, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final l9 subList(int i10, int i11) {
        k8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
