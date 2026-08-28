package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fb0(kb0 kb0Var, String str, int i9) {
        this.a = i9;
        this.b = kb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kb0 kb0Var = this.b;
                kb0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    kb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    kb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    kb0Var.o("emailRow");
                    break;
                }
                break;
            default:
                kb0 kb0Var2 = this.b;
                kb0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    kb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    kb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    kb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    kb0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
