package di;

import org.telegram.messenger.s10;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements s10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ s10 c;
    public final /* synthetic */ z10 d;

    public /* synthetic */ l6(z10 z10Var, boolean[] zArr, s10 s10Var) {
        this.d = z10Var;
        this.b = zArr;
        this.c = s10Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                z10 z10Var = this.d;
                if (z10Var != null) {
                    z10Var.a(Boolean.TRUE);
                }
                this.b[0] = true;
                s10 s10Var = this.c;
                if (s10Var != null) {
                    s10Var.a(bool.booleanValue() ? "paid" : "failed", l10);
                    break;
                }
                break;
            default:
                this.b[0] = true;
                s10 s10Var2 = this.c;
                if (s10Var2 != null) {
                    s10Var2.a(bool.booleanValue() ? "paid" : "failed", l10);
                }
                z10 z10Var2 = this.d;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l6(boolean[] zArr, s10 s10Var, z10 z10Var) {
        this.b = zArr;
        this.c = s10Var;
        this.d = z10Var;
    }
}
