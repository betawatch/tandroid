package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ jb0(ob0 ob0Var, String str, int i10) {
        this.a = i10;
        this.b = ob0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ob0 ob0Var = this.b;
                ob0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ob0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ob0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ob0Var.o("emailRow");
                    break;
                }
                break;
            default:
                ob0 ob0Var2 = this.b;
                ob0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ob0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ob0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ob0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ob0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
