package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ i90(m90 m90Var, String str, int i3) {
        this.a = i3;
        this.b = m90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m90 m90Var = this.b;
                if (m90Var.a()) {
                    m90Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                m90 m90Var2 = this.b;
                m90Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    m90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    m90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    m90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                m90 m90Var3 = this.b;
                m90Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    m90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    m90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    m90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    m90Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
