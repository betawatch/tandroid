package ci;

import org.telegram.messenger.n10;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements n10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ n10 c;
    public final /* synthetic */ u10 d;

    public /* synthetic */ u6(u10 u10Var, boolean[] zArr, n10 n10Var) {
        this.d = u10Var;
        this.b = zArr;
        this.c = n10Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                u10 u10Var = this.d;
                if (u10Var != null) {
                    u10Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                n10 n10Var = this.c;
                if (n10Var != null) {
                    n10Var.a(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                n10 n10Var2 = this.c;
                if (n10Var2 != null) {
                    n10Var2.a(bool.booleanValue() ? "paid" : "failed", l10);
                }
                u10 u10Var2 = this.d;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u6(boolean[] zArr, n10 n10Var, u10 u10Var) {
        this.b = zArr;
        this.c = n10Var;
        this.d = u10Var;
    }
}
