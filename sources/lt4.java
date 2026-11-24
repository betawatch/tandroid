// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt4 b;

    public /* synthetic */ lt4(nt4 nt4Var, byte b) {
        this.a = b;
        this.b = nt4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nt4 nt4Var = this.b;
        switch (b) {
            case 0:
                nt4Var.E();
                break;
            default:
                String str = "https://t.me/giftcode/" + nt4Var.h;
                cj3 cj3Var = new cj3(tb4.j(3, "onlySelect", "dialogsType", true));
                cj3Var.E2 = new v82(nt4Var, str, (byte) 29);
                nt4Var.e.presentFragment(cj3Var);
                ((ot4) nt4Var).r.dismiss();
                break;
        }
    }
}
