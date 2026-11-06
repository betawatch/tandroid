package n2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2.n b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ p(j2.n nVar, Exception exc, int i7) {
        this.a = i7;
        this.b = nVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Exception exc = this.c;
        j2.n nVar = this.b;
        switch (i7) {
            case 0:
                s sVar = (s) nVar.c;
                String str = h2.m0.a;
                m2.e eVar = ((l2.c0) sVar).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1029, new m2.c(U, exc, 12));
                break;
            default:
                s sVar2 = (s) nVar.c;
                String str2 = h2.m0.a;
                m2.e eVar2 = ((l2.c0) sVar2).a.s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1014, new m2.d(U2, exc, 4));
                break;
        }
    }
}
