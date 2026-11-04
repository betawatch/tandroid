package ci;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u10 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ u10 f;

    public /* synthetic */ a7(e9 e9Var, int i3, u10 u10Var, boolean[] zArr, u10 u10Var2) {
        this.b = e9Var;
        this.c = i3;
        this.d = u10Var;
        this.e = zArr;
        this.f = u10Var2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.R();
                }
                u10 u10Var = this.d;
                if (u10Var != null) {
                    u10Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                u10 u10Var2 = this.f;
                if (u10Var2 != null) {
                    u10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.R();
                }
                u10 u10Var3 = this.d;
                if (u10Var3 != null) {
                    u10Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                u10 u10Var4 = this.f;
                if (u10Var4 != null) {
                    u10Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a7(e9 e9Var, boolean[] zArr, int i3, u10 u10Var, u10 u10Var2) {
        this.b = e9Var;
        this.e = zArr;
        this.c = i3;
        this.d = u10Var;
        this.f = u10Var2;
    }
}
