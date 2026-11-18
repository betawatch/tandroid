package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l90(s90 s90Var, String str, int i7) {
        this.a = i7;
        this.b = s90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s90 s90Var = this.b;
                s90Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    s90Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    s90Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    s90Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    s90Var.x("fingerprintRow");
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                s90 s90Var2 = this.b;
                s90Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    s90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    s90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str2)) {
                    s90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                s90 s90Var3 = this.b;
                if (s90Var3.a()) {
                    s90Var3.w(this.c);
                    break;
                }
                break;
        }
    }
}
