package o3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(m mVar, n nVar, int i10) {
        this.a = i10;
        this.b = mVar;
        this.c = nVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.n] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o3.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o3.n] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                this.c.l(mVar.a, mVar.b);
                break;
            case 1:
                m mVar2 = this.b;
                this.c.j(mVar2.a, mVar2.b);
                break;
            default:
                m mVar3 = this.b;
                this.c.b(mVar3.a, mVar3.b);
                break;
        }
    }
}
