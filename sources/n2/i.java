package n2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                this.c.h(kVar.a, kVar.b);
                break;
            default:
                k kVar2 = this.b;
                this.c.j(kVar2.a, kVar2.b);
                break;
        }
    }
}
