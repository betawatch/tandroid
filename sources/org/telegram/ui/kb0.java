package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ kb0(ob0 ob0Var, String str, int i10) {
        this.a = i10;
        this.b = ob0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ob0 ob0Var = this.b;
                if (ob0Var.a()) {
                    ob0Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                ob0 ob0Var2 = this.b;
                ob0Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ob0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ob0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ob0Var2.x("emailRow");
                    break;
                }
                break;
            default:
                ob0 ob0Var3 = this.b;
                ob0Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ob0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ob0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ob0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ob0Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
