package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ m90(q90 q90Var, String str, int i7) {
        this.a = i7;
        this.b = q90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q90 q90Var = this.b;
                if (q90Var.a()) {
                    q90Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                q90 q90Var2 = this.b;
                q90Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    q90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    q90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    q90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                q90 q90Var3 = this.b;
                q90Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    q90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    q90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    q90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    q90Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
