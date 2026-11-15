package ki;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ g4(h4 h4Var, int i7) {
        this.a = i7;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                if (h4Var.x) {
                    h4Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
