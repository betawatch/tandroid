package hi;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja b;

    public /* synthetic */ p(ja jaVar, int i7) {
        this.a = i7;
        this.b = jaVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                ja jaVar = this.b;
                jaVar.setPeriod(intValue);
                x10 x10Var = jaVar.B1;
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
