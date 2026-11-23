package di;

import org.telegram.messenger.p10;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements p10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ p10 c;
    public final /* synthetic */ w10 d;

    public /* synthetic */ o6(w10 w10Var, boolean[] zArr, p10 p10Var) {
        this.d = w10Var;
        this.b = zArr;
        this.c = p10Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                w10 w10Var = this.d;
                if (w10Var != null) {
                    w10Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                p10 p10Var = this.c;
                if (p10Var != null) {
                    p10Var.a(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                p10 p10Var2 = this.c;
                if (p10Var2 != null) {
                    p10Var2.a(bool.booleanValue() ? "paid" : "failed", l10);
                }
                w10 w10Var2 = this.d;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o6(boolean[] zArr, p10 p10Var, w10 w10Var) {
        this.b = zArr;
        this.c = p10Var;
        this.d = w10Var;
    }
}
