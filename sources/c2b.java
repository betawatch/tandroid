// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f2b b;

    public /* synthetic */ c2b(f2b f2bVar, byte b) {
        this.a = b;
        this.b = f2bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f2b f2bVar = this.b;
        switch (b) {
            case 0:
                f2bVar.e();
                break;
            default:
                f2bVar.b();
                break;
        }
    }
}
