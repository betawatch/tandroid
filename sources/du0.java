// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class du0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hv0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ du0(hv0 hv0Var, String str, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                cv0 cv0Var = hv0Var.a;
                if (cv0Var != null) {
                    cv0Var.c(str);
                    break;
                }
                break;
            default:
                hv0Var.O = false;
                hv0Var.Q = 0L;
                hv0Var.U = false;
                hv0Var.b = str;
                hv0Var.a();
                cv0 cv0Var2 = hv0Var.a;
                if (cv0Var2 != null) {
                    cv0Var2.onResume();
                    hv0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
