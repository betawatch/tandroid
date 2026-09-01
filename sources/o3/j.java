package o3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(l lVar, m mVar, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o3.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o3.m] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                this.c.k(lVar.a, lVar.b);
                break;
            case 1:
                l lVar2 = this.b;
                this.c.j(lVar2.a, lVar2.b);
                break;
            default:
                l lVar3 = this.b;
                this.c.b(lVar3.a, lVar3.b);
                break;
        }
    }
}
