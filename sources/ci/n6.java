package ci;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
