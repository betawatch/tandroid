package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ec0(jc0 jc0Var, String str, int i10) {
        this.a = i10;
        this.b = jc0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jc0 jc0Var = this.b;
                if (jc0Var.a()) {
                    jc0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                jc0 jc0Var2 = this.b;
                jc0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    jc0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    jc0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    jc0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                jc0 jc0Var3 = this.b;
                jc0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    jc0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    jc0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    jc0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    jc0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
