// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2b b;

    public /* synthetic */ m1b(g2b g2bVar, byte b) {
        this.a = b;
        this.b = g2bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g2b g2bVar = this.b;
        switch (b) {
            case 0:
            default:
                g2bVar.R = false;
                g2bVar.S = null;
                break;
            case 1:
                g2bVar.s = true;
                g2bVar.l.edit().putBoolean("read_loaded", true).apply();
                break;
        }
    }
}
