package n2;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(k kVar, l lVar, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.l] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, n2.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, n2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                this.c.g(kVar.a, kVar.b);
                break;
            case 1:
                k kVar2 = this.b;
                this.c.i(kVar2.a, kVar2.b);
                break;
            default:
                k kVar3 = this.b;
                this.c.k(kVar3.a, kVar3.b);
                break;
        }
    }
}
