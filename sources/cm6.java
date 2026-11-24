// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
