// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ o6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.c(false);
                t7bVar.n2 = null;
                break;
            default:
                t7bVar.getClass();
                t7bVar.d(1.0f, true, new d6b(t7bVar, (byte) 27));
                t7bVar.c1.b(true, true);
                break;
        }
    }
}
