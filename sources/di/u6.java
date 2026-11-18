package di;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements x10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ x8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x10 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ x10 f;

    public /* synthetic */ u6(x8 x8Var, int i7, x10 x10Var, boolean[] zArr, x10 x10Var2) {
        this.b = x8Var;
        this.c = i7;
        this.d = x10Var;
        this.e = zArr;
        this.f = x10Var2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.Q();
                }
                x10 x10Var = this.d;
                if (x10Var != null) {
                    x10Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                x10 x10Var2 = this.f;
                if (x10Var2 != null) {
                    x10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.Q();
                }
                x10 x10Var3 = this.d;
                if (x10Var3 != null) {
                    x10Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                x10 x10Var4 = this.f;
                if (x10Var4 != null) {
                    x10Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u6(x8 x8Var, boolean[] zArr, int i7, x10 x10Var, x10 x10Var2) {
        this.b = x8Var;
        this.e = zArr;
        this.c = i7;
        this.d = x10Var;
        this.f = x10Var2;
    }
}
