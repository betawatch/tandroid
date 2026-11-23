package di;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements y10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ y8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y10 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ y10 f;

    public /* synthetic */ u6(y8 y8Var, int i7, y10 y10Var, boolean[] zArr, y10 y10Var2) {
        this.b = y8Var;
        this.c = i7;
        this.d = y10Var;
        this.e = zArr;
        this.f = y10Var2;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.Q();
                }
                y10 y10Var = this.d;
                if (y10Var != null) {
                    y10Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                y10 y10Var2 = this.f;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.Q();
                }
                y10 y10Var3 = this.d;
                if (y10Var3 != null) {
                    y10Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                y10 y10Var4 = this.f;
                if (y10Var4 != null) {
                    y10Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u6(y8 y8Var, boolean[] zArr, int i7, y10 y10Var, y10 y10Var2) {
        this.b = y8Var;
        this.e = zArr;
        this.c = i7;
        this.d = y10Var;
        this.f = y10Var2;
    }
}
