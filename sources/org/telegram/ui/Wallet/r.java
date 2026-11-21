package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements x10 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ u0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(x10 x10Var, u0 u0Var, z0 z0Var, d9 d9Var) {
        this.d = d9Var;
        this.b = x10Var;
        this.e = z0Var;
        this.c = u0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                u0 u0Var = this.c;
                u0Var.getClass();
                j0Var.c = (byte[]) obj;
                if (u0Var.Q.get(str) == j0Var) {
                    u0Var.v0(j0Var);
                    u0Var.T();
                }
                runnable.run();
                break;
            case 1:
                u8.Z((u8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.g2) this.e, (String) obj);
                break;
            case 2:
                d9 d9Var = (d9) this.d;
                String str2 = (String) this.b;
                z0 z0Var = (z0) this.e;
                u0 u0Var2 = this.c;
                u0Var2.z(str2, new r((x10) obj, u0Var2, z0Var, d9Var));
                break;
            default:
                d9 d9Var2 = (d9) this.d;
                x10 x10Var = (x10) this.b;
                z0 z0Var2 = (z0) this.e;
                j0 j0Var2 = (j0) obj;
                if (j0Var2 != null) {
                    byte[] bArr = j0Var2.c;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] n10 = z0Var2.n();
                        if (n10.length <= 0) {
                            x10Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = n10[0];
                        }
                    }
                    if (!z0Var2.f(bArr)) {
                        x10Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        o oVar = new o(x10Var, this.c, z0Var2, d9Var2);
                        z0.i.execute(new org.telegram.ui.Components.s2(z0Var2, z0Var2.l(), bArr == null ? "" : z0.p(bArr), z10, oVar));
                        break;
                    }
                } else {
                    x10Var.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ r(u0 u0Var, j0 j0Var, String str, Runnable runnable) {
        this.c = u0Var;
        this.d = j0Var;
        this.b = str;
        this.e = runnable;
    }

    public /* synthetic */ r(u8 u8Var, String str, u0 u0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = u8Var;
        this.b = str;
        this.c = u0Var;
        this.e = g2Var;
    }

    public /* synthetic */ r(d9 d9Var, u0 u0Var, String str, z0 z0Var) {
        this.d = d9Var;
        this.c = u0Var;
        this.b = str;
        this.e = z0Var;
    }
}
