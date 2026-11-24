// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fwb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qwb b;
    public final /* synthetic */ long c;

    public /* synthetic */ fwb(qwb qwbVar, long j, byte b) {
        this.a = b;
        this.b = qwbVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        qwb qwbVar = this.b;
        switch (b) {
            case 0:
                qwbVar.c.put(j, 0);
                qwbVar.getNotificationCenter().k(nm7.u5, Long.valueOf(j), Boolean.FALSE);
                break;
            default:
                qwbVar.n(0, j, false);
                break;
        }
    }
}
