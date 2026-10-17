package ki;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v2(h1 h1Var, int i10, int i11) {
        this.a = i11;
        this.b = h1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                h1Var.r();
                h1Var.setSelection(Math.max(0, Math.min(this.c, h1Var.length())));
                break;
            case 1:
                h1 h1Var2 = this.b;
                h1Var2.r();
                h1Var2.setSelection(Math.max(0, Math.min(this.c, h1Var2.length())));
                break;
            case 2:
                h1 h1Var3 = this.b;
                h1Var3.r();
                h1Var3.setSelection(Math.max(0, Math.min(this.c, h1Var3.length())));
                break;
            case 3:
                h1 h1Var4 = this.b;
                h1Var4.r();
                h1Var4.setSelection(Math.min(this.c, h1Var4.length()));
                break;
            default:
                h1 h1Var5 = this.b;
                h1Var5.r();
                h1Var5.setSelection(Math.max(0, Math.min(this.c, h1Var5.length())));
                break;
        }
    }
}
