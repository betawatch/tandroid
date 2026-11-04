package gi;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ la b;

    public /* synthetic */ o(la laVar, int i3) {
        this.a = i3;
        this.b = laVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                la laVar = this.b;
                laVar.setPeriod(intValue);
                u10 u10Var = laVar.B1;
                if (u10Var != null) {
                    u10Var.a(num);
                    break;
                }
                break;
            default:
                u10 u10Var2 = this.b.C1;
                if (u10Var2 != null) {
                    u10Var2.a(num);
                    break;
                }
                break;
        }
    }
}
