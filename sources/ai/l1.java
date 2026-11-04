package ai;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;
    public final /* synthetic */ u10 c;

    public /* synthetic */ l1(b3 b3Var, u10 u10Var, int i3) {
        this.a = i3;
        this.b = b3Var;
        this.c = u10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                u10 u10Var = this.c;
                if (u10Var != null) {
                    b3Var.getClass();
                    u10Var.a(Boolean.FALSE);
                }
                b3Var.dismiss();
                break;
            case 1:
                b3 b3Var2 = this.b;
                u10 u10Var2 = this.c;
                if (u10Var2 != null) {
                    b3Var2.getClass();
                    u10Var2.a(Boolean.FALSE);
                }
                b3Var2.dismiss();
                break;
            default:
                b3 b3Var3 = this.b;
                u10 u10Var3 = this.c;
                if (u10Var3 != null) {
                    b3Var3.getClass();
                    u10Var3.a(Boolean.FALSE);
                }
                b3Var3.dismiss();
                break;
        }
    }
}
