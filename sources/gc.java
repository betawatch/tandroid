// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc b;

    public /* synthetic */ gc(hc hcVar, byte b) {
        this.a = b;
        this.b = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hc hcVar = this.b;
        switch (b) {
            case 0:
                hcVar.invalidateSelf();
                break;
            case 1:
            default:
                hcVar.a();
                break;
        }
    }
}
