package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pa0(ta0 ta0Var, String str, int i10) {
        this.a = i10;
        this.b = ta0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ta0 ta0Var = this.b;
                if (ta0Var.a()) {
                    ta0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                ta0 ta0Var2 = this.b;
                ta0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ta0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ta0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ta0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                ta0 ta0Var3 = this.b;
                ta0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ta0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ta0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ta0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ta0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
