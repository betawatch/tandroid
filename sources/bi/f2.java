package bi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f2(i2 i2Var, boolean z10, int i7) {
        this.a = i7;
        this.b = i2Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                i2 i2Var = this.b;
                if (!z10) {
                    i2Var.H.setVisibility(8);
                    break;
                } else {
                    i2Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                i2 i2Var2 = this.b;
                if (!z11) {
                    i2Var2.w.setVisibility(8);
                    break;
                } else {
                    i2Var2.getClass();
                    break;
                }
        }
    }
}
