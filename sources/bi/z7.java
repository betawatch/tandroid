package bi;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements c20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ea b;
    public final /* synthetic */ int c;
    public final /* synthetic */ c20 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ c20 f;

    public /* synthetic */ z7(ea eaVar, int i7, c20 c20Var, boolean[] zArr, c20 c20Var2) {
        this.b = eaVar;
        this.c = i7;
        this.d = c20Var;
        this.e = zArr;
        this.f = c20Var2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.R();
                }
                c20 c20Var = this.d;
                if (c20Var != null) {
                    c20Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                c20 c20Var2 = this.f;
                if (c20Var2 != null) {
                    c20Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.R();
                }
                c20 c20Var3 = this.d;
                if (c20Var3 != null) {
                    c20Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                c20 c20Var4 = this.f;
                if (c20Var4 != null) {
                    c20Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z7(ea eaVar, boolean[] zArr, int i7, c20 c20Var, c20 c20Var2) {
        this.b = eaVar;
        this.e = zArr;
        this.c = i7;
        this.d = c20Var;
        this.f = c20Var2;
    }
}
