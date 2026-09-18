package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ cc0(hc0 hc0Var, String str, int i10) {
        this.a = i10;
        this.b = hc0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hc0 hc0Var = this.b;
                hc0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    hc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    hc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    hc0Var.o("emailRow");
                    break;
                }
                break;
            default:
                hc0 hc0Var2 = this.b;
                hc0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    hc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    hc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    hc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    hc0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
