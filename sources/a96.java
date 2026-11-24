// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k96 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a96(k96 k96Var, int i, byte b) {
        this.a = b;
        this.b = k96Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        k96 k96Var = this.b;
        switch (b) {
            case 0:
                k96Var.P = false;
                k96Var.j(i);
                break;
            case 1:
                k96Var.P = false;
                k96Var.j(i);
                break;
            case 2:
                k96Var.Z0(i, null, true, null);
                break;
            default:
                k96Var.Z0(i, null, true, null);
                break;
        }
    }
}
