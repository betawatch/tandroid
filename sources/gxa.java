// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gxa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hxa b;
    public final /* synthetic */ long c;

    public /* synthetic */ gxa(hxa hxaVar, long j, byte b) {
        this.a = b;
        this.b = hxaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hxa hxaVar = this.b;
        switch (b) {
            case 0:
                hxaVar.q.c0(hxaVar.b, hxaVar.c, this.c, true, true, hxaVar.n);
                break;
            default:
                hxaVar.q.c0(hxaVar.b, hxaVar.c, this.c, true, true, hxaVar.n);
                break;
        }
    }
}
