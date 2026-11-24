// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hi8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ji8 b;

    public /* synthetic */ hi8(ji8 ji8Var, byte b) {
        this.a = b;
        this.b = ji8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ji8 ji8Var = this.b;
        switch (b) {
            case 0:
                String str = "https://t.me/giftcode/" + ji8Var.M2;
                cj3 cj3Var = new cj3(tb4.j(3, "onlySelect", "dialogsType", true));
                cj3Var.E2 = new dx6(ji8Var, str, (byte) 24);
                ji8Var.r1.presentFragment(cj3Var);
                ji8Var.dismiss();
                break;
            default:
                xh8 xh8Var = new xh8(ji8Var.r1, y6c.t0, null, null, null, ji8Var.J0);
                xh8Var.E2 = true;
                xh8Var.F2 = true;
                xh8Var.X1 = true;
                ji8Var.r1.showDialog(xh8Var);
                break;
        }
    }
}
