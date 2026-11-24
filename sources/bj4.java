// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bj4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ akb b;

    public /* synthetic */ bj4(akb akbVar, byte b) {
        this.a = b;
        this.b = akbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        akb akbVar = this.b;
        switch (b) {
            case 0:
                kk7.e().k(kk7.v4, akbVar, Boolean.TRUE, null, -1);
                break;
            default:
                akbVar.r();
                break;
        }
    }
}
