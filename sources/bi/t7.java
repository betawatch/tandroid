package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements v10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ v10 c;
    public final /* synthetic */ c20 d;

    public /* synthetic */ t7(c20 c20Var, boolean[] zArr, v10 v10Var) {
        this.d = c20Var;
        this.b = zArr;
        this.c = v10Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                c20 c20Var = this.d;
                if (c20Var != null) {
                    c20Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                v10 v10Var = this.c;
                if (v10Var != null) {
                    v10Var.a(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                v10 v10Var2 = this.c;
                if (v10Var2 != null) {
                    v10Var2.a(bool.booleanValue() ? "paid" : "failed", l10);
                }
                c20 c20Var2 = this.d;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t7(boolean[] zArr, v10 v10Var, c20 c20Var) {
        this.b = zArr;
        this.c = v10Var;
        this.d = c20Var;
    }
}
