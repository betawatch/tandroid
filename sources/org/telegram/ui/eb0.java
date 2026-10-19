package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ eb0(ib0 ib0Var, String str, int i10) {
        this.a = i10;
        this.b = ib0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ib0 ib0Var = this.b;
                if (ib0Var.a()) {
                    ib0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                ib0 ib0Var2 = this.b;
                ib0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ib0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ib0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ib0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                ib0 ib0Var3 = this.b;
                ib0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ib0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ib0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ib0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ib0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
