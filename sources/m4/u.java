package m4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ u(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                y yVar = a0Var.u;
                if (yVar != null) {
                    a0Var.t.D(yVar);
                    break;
                }
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                a0.a(this.b);
                break;
            default:
                this.b.t();
                break;
        }
    }
}
