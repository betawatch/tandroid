// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fw6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lw6 b;
    public final /* synthetic */ ad8 c;

    public /* synthetic */ fw6(lw6 lw6Var, ad8 ad8Var, byte b) {
        this.a = b;
        this.b = lw6Var;
        this.c = ad8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ad8 ad8Var = this.c;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                lw6Var.p.K(lw6Var.f0(ad8Var));
                lw6Var.l.D(ad8Var.q().a(17) ? ad8Var.y0() : aob.a);
                break;
            default:
                lw6Var.p.K(lw6Var.f0(ad8Var));
                break;
        }
    }
}
