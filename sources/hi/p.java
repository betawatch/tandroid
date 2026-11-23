package hi;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ p(db dbVar, int i7) {
        this.a = i7;
        this.b = dbVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                db dbVar = this.b;
                dbVar.setPeriod(intValue);
                w10 w10Var = dbVar.B1;
                if (w10Var != null) {
                    w10Var.a(num);
                    break;
                }
                break;
            default:
                w10 w10Var2 = this.b.C1;
                if (w10Var2 != null) {
                    w10Var2.a(num);
                    break;
                }
                break;
        }
    }
}
