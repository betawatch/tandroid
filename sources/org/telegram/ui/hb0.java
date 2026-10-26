package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hb0(lb0 lb0Var, String str, int i10) {
        this.a = i10;
        this.b = lb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lb0 lb0Var = this.b;
                if (lb0Var.a()) {
                    lb0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                lb0 lb0Var2 = this.b;
                lb0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    lb0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    lb0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    lb0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                lb0 lb0Var3 = this.b;
                lb0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    lb0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    lb0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    lb0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    lb0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
