// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jna implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lna b;

    public /* synthetic */ jna(lna lnaVar, byte b) {
        this.a = b;
        this.b = lnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lna lnaVar = this.b;
        switch (b) {
            case 0:
                lnaVar.W0 = false;
                if (!lnaVar.Z0 && lnaVar.X0) {
                    lnaVar.x(true);
                    break;
                }
                break;
            case 1:
                lnaVar.W0 = false;
                break;
            case 2:
                lnaVar.Z0 = false;
                if (!lnaVar.W0 && lnaVar.X0) {
                    lnaVar.x(true);
                    break;
                }
                break;
            default:
                lnaVar.Z0 = false;
                break;
        }
    }
}
