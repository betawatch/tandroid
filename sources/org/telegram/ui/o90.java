package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ o90(s90 s90Var, String str, int i7) {
        this.a = i7;
        this.b = s90Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s90 s90Var = this.b;
                if (s90Var.a()) {
                    s90Var.w(this.c);
                    break;
                }
                break;
            case 1:
                this.b.w(this.c);
                break;
            case 2:
                s90 s90Var2 = this.b;
                s90Var2.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    s90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    s90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    s90Var2.x("emailRow");
                    break;
                }
                break;
            default:
                s90 s90Var3 = this.b;
                s90Var3.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    s90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    s90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    s90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    s90Var3.x("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
