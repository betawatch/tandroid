// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eta b;
    public final /* synthetic */ long c;

    public /* synthetic */ dta(eta etaVar, long j, byte b) {
        this.a = b;
        this.b = etaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eta etaVar = this.b;
        switch (b) {
            case 0:
                etaVar.q.b0(etaVar.b, etaVar.c, this.c, true, true, etaVar.n);
                break;
            default:
                etaVar.q.b0(etaVar.b, etaVar.c, this.c, true, true, etaVar.n);
                break;
        }
    }
}
