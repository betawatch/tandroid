package nh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ x5(t6 t6Var, int i10) {
        this.a = i10;
        this.b = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t6 t6Var = this.b;
                t6Var.R = false;
                t6Var.S = null;
                break;
            case 1:
                t6 t6Var2 = this.b;
                t6Var2.s = true;
                t6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                t6 t6Var3 = this.b;
                t6Var3.R = false;
                t6Var3.S = null;
                break;
        }
    }
}
