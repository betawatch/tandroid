package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements u10 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(u10 u10Var, k0 k0Var, o0 o0Var, n8 n8Var) {
        this.d = n8Var;
        this.b = u10Var;
        this.e = o0Var;
        this.c = k0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                k0 k0Var = this.c;
                k0Var.getClass();
                b0Var.c = (byte[]) obj;
                if (k0Var.N.get(str) == b0Var) {
                    k0Var.k0(b0Var);
                    k0Var.L();
                }
                runnable.run();
                break;
            case 1:
                e8.Z((e8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.d2) this.e, (String) obj);
                break;
            case 2:
                n8 n8Var = (n8) this.d;
                String str2 = (String) this.b;
                o0 o0Var = (o0) this.e;
                k0 k0Var2 = this.c;
                k0Var2.u(str2, new p((u10) obj, k0Var2, o0Var, n8Var));
                break;
            default:
                n8 n8Var2 = (n8) this.d;
                u10 u10Var = (u10) this.b;
                o0 o0Var2 = (o0) this.e;
                b0 b0Var2 = (b0) obj;
                if (b0Var2 != null) {
                    byte[] bArr = b0Var2.c;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] m10 = o0Var2.m();
                        if (m10.length <= 0) {
                            u10Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!o0Var2.f(bArr)) {
                        u10Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        m mVar = new m(u10Var, this.c, o0Var2, n8Var2);
                        o0.h.execute(new org.telegram.ui.Components.h2(o0Var2, o0Var2.l(), bArr == null ? "" : o0.o(bArr), z10, mVar));
                        break;
                    }
                } else {
                    u10Var.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ p(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.c = k0Var;
        this.d = b0Var;
        this.b = str;
        this.e = runnable;
    }

    public /* synthetic */ p(e8 e8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = e8Var;
        this.b = str;
        this.c = k0Var;
        this.e = d2Var;
    }

    public /* synthetic */ p(n8 n8Var, k0 k0Var, String str, o0 o0Var) {
        this.d = n8Var;
        this.c = k0Var;
        this.b = str;
        this.e = o0Var;
    }
}
