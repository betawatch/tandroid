package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
