package di;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements w10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ y8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ w10 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ w10 f;

    public /* synthetic */ u6(y8 y8Var, int i7, w10 w10Var, boolean[] zArr, w10 w10Var2) {
        this.b = y8Var;
        this.c = i7;
        this.d = w10Var;
        this.e = zArr;
        this.f = w10Var2;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.Q();
                }
                w10 w10Var = this.d;
                if (w10Var != null) {
                    w10Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                w10 w10Var2 = this.f;
                if (w10Var2 != null) {
                    w10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.Q();
                }
                w10 w10Var3 = this.d;
                if (w10Var3 != null) {
                    w10Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                w10 w10Var4 = this.f;
                if (w10Var4 != null) {
                    w10Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u6(y8 y8Var, boolean[] zArr, int i7, w10 w10Var, w10 w10Var2) {
        this.b = y8Var;
        this.e = zArr;
        this.c = i7;
        this.d = w10Var;
        this.f = w10Var2;
    }
}
