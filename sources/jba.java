// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lba b;

    public /* synthetic */ jba(lba lbaVar, byte b) {
        this.a = b;
        this.b = lbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        lba lbaVar = this.b;
        switch (b) {
            case 0:
                lbaVar.post(new jba(lbaVar, b2));
                break;
            default:
                lbaVar.c0.N0 = true;
                lbaVar.I.clear();
                lbaVar.J.clear();
                lbaVar.K.clear();
                lbaVar.invalidate();
                break;
        }
    }
}
