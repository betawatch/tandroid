package di;

import org.telegram.messenger.q10;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ q10 c;
    public final /* synthetic */ x10 d;

    public /* synthetic */ o6(x10 x10Var, boolean[] zArr, q10 q10Var) {
        this.d = x10Var;
        this.b = zArr;
        this.c = q10Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                x10 x10Var = this.d;
                if (x10Var != null) {
                    x10Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                q10 q10Var = this.c;
                if (q10Var != null) {
                    q10Var.a(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                q10 q10Var2 = this.c;
                if (q10Var2 != null) {
                    q10Var2.a(bool.booleanValue() ? "paid" : "failed", l10);
                }
                x10 x10Var2 = this.d;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o6(boolean[] zArr, q10 q10Var, x10 x10Var) {
        this.b = zArr;
        this.c = q10Var;
        this.d = x10Var;
    }
}
