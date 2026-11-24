// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eq8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq8 b;

    public /* synthetic */ eq8(pq8 pq8Var, byte b) {
        this.a = b;
        this.b = pq8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.b();
                break;
            case 1:
                pq8Var.c();
                break;
            case 2:
                pq8Var.f(false);
                break;
            default:
                pq8Var.d();
                break;
        }
    }
}
