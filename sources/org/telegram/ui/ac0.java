package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ac0(fc0 fc0Var, String str, int i10) {
        this.a = i10;
        this.b = fc0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fc0 fc0Var = this.b;
                fc0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    fc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    fc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    fc0Var.o("emailRow");
                    break;
                }
                break;
            default:
                fc0 fc0Var2 = this.b;
                fc0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    fc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    fc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    fc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    fc0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
