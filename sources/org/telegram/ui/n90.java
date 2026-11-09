package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ n90(r90 r90Var, String str, int i7) {
        this.a = i7;
        this.b = r90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r90 r90Var = this.b;
                if (r90Var.a()) {
                    r90Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                r90 r90Var2 = this.b;
                r90Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    r90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    r90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    r90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                r90 r90Var3 = this.b;
                r90Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    r90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    r90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    r90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    r90Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
