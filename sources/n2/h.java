package n2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                this.c.g(jVar.a, jVar.b);
                break;
            case 1:
                j jVar2 = this.b;
                this.c.i(jVar2.a, jVar2.b);
                break;
            default:
                j jVar3 = this.b;
                this.c.k(jVar3.a, jVar3.b);
                break;
        }
    }
}
