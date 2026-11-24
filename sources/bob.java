// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bob implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kob b;

    public /* synthetic */ bob(kob kobVar, byte b) {
        this.a = b;
        this.b = kobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kob kobVar = this.b;
        switch (b) {
            case 0:
                iob iobVar = kobVar.N;
                if (iobVar != null) {
                    long j = iobVar.a;
                    if (j > 0) {
                        kobVar.I = j;
                        break;
                    }
                }
                break;
            case 1:
                eob eobVar = kobVar.a;
                if (eobVar != null) {
                    eobVar.p1();
                    break;
                }
                break;
            default:
                eob eobVar2 = kobVar.a;
                if (eobVar2 != null) {
                    eobVar2.K();
                    break;
                }
                break;
        }
    }
}
