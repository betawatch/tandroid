package ih;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w1(y1 y1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = y1Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                y1 y1Var = this.b;
                if (!z10) {
                    y1Var.C.setVisibility(8);
                    break;
                } else {
                    y1Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                y1 y1Var2 = this.b;
                if (!z11) {
                    y1Var2.v.setVisibility(8);
                    break;
                } else {
                    y1Var2.getClass();
                    break;
                }
        }
    }
}
