package bi;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ r7(u8 u8Var, int i10) {
        this.a = i10;
        this.b = u8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u8 u8Var = this.b;
                u8Var.R = false;
                u8Var.S = null;
                break;
            case 1:
                u8 u8Var2 = this.b;
                u8Var2.s = true;
                u8Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                u8 u8Var3 = this.b;
                u8Var3.R = false;
                u8Var3.S = null;
                break;
        }
    }
}
