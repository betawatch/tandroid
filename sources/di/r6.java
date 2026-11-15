package di;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements z10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ z10 d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ z10 f;

    public /* synthetic */ r6(v8 v8Var, int i7, z10 z10Var, boolean[] zArr, z10 z10Var2) {
        this.b = v8Var;
        this.c = i7;
        this.d = z10Var;
        this.e = zArr;
        this.f = z10Var2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                this.e[0] = true;
                if (this.c > 0) {
                    this.b.R();
                }
                z10 z10Var = this.d;
                if (z10Var != null) {
                    z10Var.a(bool.booleanValue() ? "paid" : "failed");
                }
                z10 z10Var2 = this.f;
                if (z10Var2 != null) {
                    z10Var2.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (this.c > 0) {
                    this.b.R();
                }
                z10 z10Var3 = this.d;
                if (z10Var3 != null) {
                    z10Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                z10 z10Var4 = this.f;
                if (z10Var4 != null) {
                    z10Var4.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r6(v8 v8Var, boolean[] zArr, int i7, z10 z10Var, z10 z10Var2) {
        this.b = v8Var;
        this.e = zArr;
        this.c = i7;
        this.d = z10Var;
        this.f = z10Var2;
    }
}
