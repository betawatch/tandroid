package hi;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
