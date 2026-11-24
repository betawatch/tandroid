// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ejb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjb b;
    public final /* synthetic */ fjb c;

    public /* synthetic */ ejb(gjb gjbVar, fjb fjbVar, byte b) {
        this.a = b;
        this.b = gjbVar;
        this.c = fjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fjb fjbVar = this.c;
        gjb gjbVar = this.b;
        switch (b) {
            case 0:
                gjbVar.a(fjbVar);
                break;
            case 1:
                gjbVar.a(fjbVar);
                break;
            default:
                gjbVar.a(fjbVar);
                break;
        }
    }
}
