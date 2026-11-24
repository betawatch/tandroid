// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class mj4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sj4 b;

    public /* synthetic */ mj4(sj4 sj4Var, byte b) {
        this.a = b;
        this.b = sj4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sj4 sj4Var = this.b;
        switch (b) {
            case 0:
                sj4Var.q();
                if (sj4Var.b.j()) {
                    gl.d3(this, 500L);
                    break;
                }
                break;
            default:
                if (!sj4Var.b.b0()) {
                    sj4Var.u = false;
                    sj4Var.o(false);
                    sj4Var.w = false;
                    break;
                } else {
                    gl.d3(this, 1500L);
                    break;
                }
        }
    }
}
