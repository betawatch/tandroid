package ai;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;
    public final /* synthetic */ long c;

    public /* synthetic */ da(ea eaVar, long j10, int i10) {
        this.a = i10;
        this.b = eaVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ea eaVar = this.b;
                eaVar.q.d0(eaVar.b, eaVar.c, this.c, true, true, eaVar.n);
                break;
            default:
                ea eaVar2 = this.b;
                eaVar2.q.d0(eaVar2.b, eaVar2.c, this.c, true, true, eaVar2.n);
                break;
        }
    }
}
