// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ long c;

    public /* synthetic */ lf(p8c p8cVar, long j, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(Long.valueOf(j));
                break;
            default:
                p8cVar.a(Long.valueOf(j));
                break;
        }
    }
}
