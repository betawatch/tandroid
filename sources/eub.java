// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class eub implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pub b;
    public final /* synthetic */ long c;

    public /* synthetic */ eub(pub pubVar, long j, byte b) {
        this.a = b;
        this.b = pubVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        pub pubVar = this.b;
        switch (b) {
            case 0:
                pubVar.c.put(j, 0);
                pubVar.getNotificationCenter().k(kk7.s5, Long.valueOf(j), Boolean.FALSE);
                break;
            default:
                pubVar.n(0, j, false);
                break;
        }
    }
}
