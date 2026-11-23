package hi;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia b;

    public /* synthetic */ q(ia iaVar, int i7) {
        this.a = i7;
        this.b = iaVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                ia iaVar = this.b;
                iaVar.setPeriod(intValue);
                y10 y10Var = iaVar.B1;
                if (y10Var != null) {
                    y10Var.a(num);
                    break;
                }
                break;
            default:
                y10 y10Var2 = this.b.C1;
                if (y10Var2 != null) {
                    y10Var2.a(num);
                    break;
                }
                break;
        }
    }
}
