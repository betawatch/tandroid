package hi;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia b;

    public /* synthetic */ q(ia iaVar, int i7) {
        this.a = i7;
        this.b = iaVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                ia iaVar = this.b;
                iaVar.setPeriod(intValue);
                x10 x10Var = iaVar.B1;
                if (x10Var != null) {
                    x10Var.a(num);
                    break;
                }
                break;
            default:
                x10 x10Var2 = this.b.C1;
                if (x10Var2 != null) {
                    x10Var2.a(num);
                    break;
                }
                break;
        }
    }
}
