package ci;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc b;

    public /* synthetic */ xb(tc tcVar, int i3) {
        this.a = i3;
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tc tcVar = this.b;
                tcVar.L1 = true;
                tcVar.J0(null);
                org.telegram.messenger.g0.i3(new xb(tcVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                dc dcVar = this.b.q1;
                dcVar.G = false;
                dcVar.invalidate();
                break;
        }
    }
}
