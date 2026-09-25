package n2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
