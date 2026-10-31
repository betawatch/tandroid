package n2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(j jVar, k kVar, int i10) {
        this.a = i10;
        this.b = jVar;
        this.c = kVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                this.c.E(jVar.a, jVar.b);
                break;
            default:
                j jVar2 = this.b;
                this.c.J(jVar2.a, jVar2.b);
                break;
        }
    }
}
