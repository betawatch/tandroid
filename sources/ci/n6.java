package ci;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ n6(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                i7Var.R = false;
                i7Var.S = null;
                break;
            case 1:
                i7 i7Var2 = this.b;
                i7Var2.s = true;
                i7Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                i7 i7Var3 = this.b;
                i7Var3.R = false;
                i7Var3.S = null;
                break;
        }
    }
}
