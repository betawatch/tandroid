package ci;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ m6(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                h7Var.R = false;
                h7Var.S = null;
                break;
            case 1:
                h7 h7Var2 = this.b;
                h7Var2.s = true;
                h7Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                h7 h7Var3 = this.b;
                h7Var3.R = false;
                h7Var3.S = null;
                break;
        }
    }
}
