// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ho6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ho6(jo6 jo6Var, int i, byte b) {
        this.a = b;
        this.b = jo6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        jo6 jo6Var = this.b;
        switch (b) {
            case 0:
                try {
                    jo6Var.b.n(i);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    jo6Var.b.n(i);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    jo6Var.b.n(i);
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            default:
                try {
                    jo6Var.b.n(i);
                    break;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
        }
    }
}
