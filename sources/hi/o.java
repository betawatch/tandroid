package hi;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia b;

    public /* synthetic */ o(ia iaVar, int i7) {
        this.a = i7;
        this.b = iaVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                ia iaVar = this.b;
                iaVar.setPeriod(intValue);
                z10 z10Var = iaVar.B1;
                if (z10Var != null) {
                    z10Var.a(num);
                    break;
                }
                break;
            default:
                z10 z10Var2 = this.b.C1;
                if (z10Var2 != null) {
                    z10Var2.a(num);
                    break;
                }
                break;
        }
    }
}
