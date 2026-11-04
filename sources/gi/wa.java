package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb b;

    public /* synthetic */ wa(fb fbVar, int i3) {
        this.a = i3;
        this.b = fbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fb fbVar = this.b;
                db dbVar = fbVar.N;
                if (dbVar != null) {
                    long j10 = dbVar.a;
                    if (j10 > 0) {
                        fbVar.I = j10;
                        break;
                    }
                }
                break;
            case 1:
                za zaVar = this.b.a;
                if (zaVar != null) {
                    zaVar.X();
                    break;
                }
                break;
            default:
                za zaVar2 = this.b.a;
                if (zaVar2 != null) {
                    zaVar2.s();
                    break;
                }
                break;
        }
    }
}
