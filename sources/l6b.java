// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l6b(t7b t7bVar, boolean z, byte b) {
        this.a = b;
        this.b = t7bVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.c(z);
                break;
            case 1:
                if (!z) {
                    t7bVar.K0.b(false, false);
                    break;
                }
                break;
            default:
                t7bVar.S = null;
                t7bVar.e = false;
                t7bVar.o(z);
                break;
        }
    }
}
