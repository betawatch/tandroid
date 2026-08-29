package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hb0(mb0 mb0Var, String str, int i10) {
        this.a = i10;
        this.b = mb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mb0 mb0Var = this.b;
                mb0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    mb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    mb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    mb0Var.o("emailRow");
                    break;
                }
                break;
            default:
                mb0 mb0Var2 = this.b;
                mb0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    mb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    mb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    mb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    mb0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
