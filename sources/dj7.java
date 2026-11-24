// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dj7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jj7 b;

    public /* synthetic */ dj7(jj7 jj7Var, byte b) {
        this.a = b;
        this.b = jj7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jj7 jj7Var = this.b;
        switch (b) {
            case 0:
                gl.t1(jj7Var.l1);
                break;
            default:
                gl.E3(jj7Var.m1.getEditText());
                break;
        }
    }
}
