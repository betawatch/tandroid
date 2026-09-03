package o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a0(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h();
                break;
            case 1:
                e0 e0Var = this.b;
                if (!e0Var.Y) {
                    s sVar = e0Var.D;
                    sVar.getClass();
                    sVar.X1(e0Var);
                    break;
                }
                break;
            default:
                this.b.S = true;
                break;
        }
    }
}
