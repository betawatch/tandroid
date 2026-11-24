// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cpb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jpb b;

    public /* synthetic */ cpb(jpb jpbVar, byte b) {
        this.a = b;
        this.b = jpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jpb jpbVar = this.b;
        switch (b) {
            case 0:
                jpbVar.b(false);
                break;
            case 1:
                jpbVar.c();
                break;
            default:
                jpbVar.b(false);
                break;
        }
    }
}
