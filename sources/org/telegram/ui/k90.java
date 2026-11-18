package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k90(r90 r90Var, String str, int i7) {
        this.a = i7;
        this.b = r90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r90 r90Var = this.b;
                r90Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    r90Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    r90Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    r90Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    r90Var.x("fingerprintRow");
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                r90 r90Var2 = this.b;
                r90Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    r90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    r90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str2)) {
                    r90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                r90 r90Var3 = this.b;
                if (r90Var3.a()) {
                    r90Var3.w(this.c);
                    break;
                }
                break;
        }
    }
}
