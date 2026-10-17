package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gb0(kb0 kb0Var, String str, int i10) {
        this.a = i10;
        this.b = kb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kb0 kb0Var = this.b;
                if (kb0Var.a()) {
                    kb0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                kb0 kb0Var2 = this.b;
                kb0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    kb0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    kb0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    kb0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                kb0 kb0Var3 = this.b;
                kb0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    kb0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    kb0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    kb0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    kb0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
