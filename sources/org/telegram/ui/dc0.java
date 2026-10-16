package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ dc0(ic0 ic0Var, String str, int i10) {
        this.a = i10;
        this.b = ic0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ic0 ic0Var = this.b;
                if (ic0Var.a()) {
                    ic0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                ic0 ic0Var2 = this.b;
                ic0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ic0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ic0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ic0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                ic0 ic0Var3 = this.b;
                ic0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ic0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ic0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ic0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ic0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
