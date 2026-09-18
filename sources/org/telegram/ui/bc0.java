package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ bc0(gc0 gc0Var, String str, int i10) {
        this.a = i10;
        this.b = gc0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc0 gc0Var = this.b;
                gc0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    gc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    gc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    gc0Var.o("emailRow");
                    break;
                }
                break;
            default:
                gc0 gc0Var2 = this.b;
                gc0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    gc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    gc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    gc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    gc0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
