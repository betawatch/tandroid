package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qb0(wb0 wb0Var, String str, int i10) {
        this.a = i10;
        this.b = wb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wb0 wb0Var = this.b;
                wb0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    wb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    wb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    wb0Var.o("emailRow");
                    break;
                }
                break;
            default:
                wb0 wb0Var2 = this.b;
                wb0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    wb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    wb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    wb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    wb0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
