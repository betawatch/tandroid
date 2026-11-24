// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mic implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ric b;
    public final /* synthetic */ int c;

    public /* synthetic */ mic(ric ricVar, int i, byte b) {
        this.a = b;
        this.b = ricVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ric ricVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new mic(ricVar, i, (byte) 2));
                break;
            case 1:
                gl.c3(new mic(ricVar, i, (byte) 3));
                break;
            case 2:
                ricVar.c(i);
                break;
            default:
                ricVar.a(i);
                break;
        }
    }
}
