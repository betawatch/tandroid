package di;

import org.telegram.messenger.r10;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements r10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ r10 c;
    public final /* synthetic */ y10 d;

    public /* synthetic */ o6(y10 y10Var, boolean[] zArr, r10 r10Var) {
        this.d = y10Var;
        this.b = zArr;
        this.c = r10Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                y10 y10Var = this.d;
                if (y10Var != null) {
                    y10Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                r10 r10Var = this.c;
                if (r10Var != null) {
                    r10Var.a(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                r10 r10Var2 = this.c;
                if (r10Var2 != null) {
                    r10Var2.a(bool.booleanValue() ? "paid" : "failed", l10);
                }
                y10 y10Var2 = this.d;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o6(boolean[] zArr, r10 r10Var, y10 y10Var) {
        this.b = zArr;
        this.c = r10Var;
        this.d = y10Var;
    }
}
