// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ long c;

    public /* synthetic */ lg(qac qacVar, long j, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(Long.valueOf(j));
                break;
            default:
                qacVar.a(Long.valueOf(j));
                break;
        }
    }
}
