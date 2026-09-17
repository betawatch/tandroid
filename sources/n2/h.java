package n2;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
