// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class eyb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qyb b;
    public final /* synthetic */ long c;

    public /* synthetic */ eyb(qyb qybVar, long j, byte b) {
        this.a = b;
        this.b = qybVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        qyb qybVar = this.b;
        switch (b) {
            case 0:
                qybVar.c.put(j, 0);
                qybVar.getNotificationCenter().k(jn7.t5, Long.valueOf(j), Boolean.FALSE);
                break;
            default:
                qybVar.n(0, j, false);
                break;
        }
    }
}
