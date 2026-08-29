package eg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ y1(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(true);
                break;
            case 1:
                this.b.b0(true, false);
                break;
            case 2:
                this.b.R();
                break;
            case 3:
                this.b.b0(true, false);
                break;
            case 4:
                this.b.b0(true, false);
                break;
            case 5:
                this.b.b0(true, false);
                break;
            case 6:
                g2 g2Var = this.b;
                g2Var.a0.clear();
                g2Var.b0.clear();
                g2Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
