package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc b;

    public /* synthetic */ xb(gc gcVar, int i9) {
        this.a = i9;
        this.b = gcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc gcVar = this.b;
                ec ecVar = gcVar.I;
                if (ecVar != null) {
                    long j10 = ecVar.a;
                    if (j10 > 0) {
                        gcVar.D = j10;
                        break;
                    }
                }
                break;
            case 1:
                ac acVar = this.b.a;
                if (acVar != null) {
                    acVar.a2();
                    break;
                }
                break;
            default:
                ac acVar2 = this.b.a;
                if (acVar2 != null) {
                    acVar2.g0();
                    break;
                }
                break;
        }
    }
}
