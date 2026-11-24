// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cm6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cm6(em6 em6Var, int i, byte b) {
        this.a = b;
        this.b = em6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        em6 em6Var = this.b;
        switch (b) {
            case 0:
                try {
                    em6Var.b.n(i);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                try {
                    em6Var.b.n(i);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    em6Var.b.n(i);
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            default:
                try {
                    em6Var.b.n(i);
                    break;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
        }
    }
}
