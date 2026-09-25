package ki;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ n(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                q qVar = this.b;
                if (qVar.G != 0) {
                    qVar.F = true;
                    break;
                }
                break;
        }
    }
}
