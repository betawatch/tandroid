package ai;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;
    public final /* synthetic */ long c;

    public /* synthetic */ ea(fa faVar, long j10, int i10) {
        this.a = i10;
        this.b = faVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fa faVar = this.b;
                faVar.q.d0(faVar.b, faVar.c, this.c, true, true, faVar.n);
                break;
            default:
                fa faVar2 = this.b;
                faVar2.q.d0(faVar2.b, faVar2.c, this.c, true, true, faVar2.n);
                break;
        }
    }
}
