package bi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;
    public final /* synthetic */ long c;

    public /* synthetic */ ba(ca caVar, long j3, int i7) {
        this.a = i7;
        this.b = caVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ca caVar = this.b;
                caVar.q.b0(caVar.b, caVar.c, this.c, true, true, caVar.n);
                break;
            default:
                ca caVar2 = this.b;
                caVar2.q.b0(caVar2.b, caVar2.c, this.c, true, true, caVar2.n);
                break;
        }
    }
}
