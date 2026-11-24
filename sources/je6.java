// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class je6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ je6(qe6 qe6Var, int i, byte b) {
        this.a = b;
        this.b = qe6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        qe6 qe6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new je6(qe6Var, i, (byte) 1));
                break;
            case 1:
                qe6Var.z(i);
                break;
            default:
                qe6Var.f.f[i].D(1.0f);
                break;
        }
    }
}
