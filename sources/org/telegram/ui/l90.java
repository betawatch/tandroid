package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l90(p90 p90Var, String str, int i7) {
        this.a = i7;
        this.b = p90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p90 p90Var = this.b;
                if (p90Var.a()) {
                    p90Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                p90 p90Var2 = this.b;
                p90Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    p90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    p90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    p90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                p90 p90Var3 = this.b;
                p90Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    p90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    p90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    p90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    p90Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
