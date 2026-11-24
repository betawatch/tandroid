// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class el9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ul9 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ el9(ul9 ul9Var, Exception exc, byte b) {
        this.a = b;
        this.b = ul9Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        ul9 ul9Var = this.b;
        switch (b) {
            case 0:
                ul9Var.h(exc);
                break;
            case 1:
                ul9Var.h(exc);
                break;
            case 2:
                ul9Var.h(exc);
                break;
            default:
                ul9Var.h(exc);
                break;
        }
    }
}
