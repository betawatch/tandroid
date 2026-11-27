// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
