// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l94 b;
    public final /* synthetic */ k94 c;

    public /* synthetic */ d94(l94 l94Var, k94 k94Var, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = k94Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k94 k94Var = this.c;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                k94Var.l = null;
                l94Var.H0.remove(k94Var);
                k94Var.k = true;
                break;
            default:
                l94Var.k(k94Var, null);
                k94Var.f.freeResources();
                break;
        }
    }
}
