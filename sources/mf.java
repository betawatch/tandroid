// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ long c;

    public /* synthetic */ mf(p8c p8cVar, long j, byte b) {
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
