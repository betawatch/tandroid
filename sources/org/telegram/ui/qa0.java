package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qa0(ua0 ua0Var, String str, int i10) {
        this.a = i10;
        this.b = ua0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ua0 ua0Var = this.b;
                if (ua0Var.a()) {
                    ua0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                ua0 ua0Var2 = this.b;
                ua0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ua0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ua0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ua0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                ua0 ua0Var3 = this.b;
                ua0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ua0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ua0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ua0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ua0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
