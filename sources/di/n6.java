package di;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ n6(h7 h7Var, int i10) {
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
