package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements z10 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(z10 z10Var, l0 l0Var, p0 p0Var, p8 p8Var) {
        this.d = p8Var;
        this.b = z10Var;
        this.e = p0Var;
        this.c = l0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                l0 l0Var = this.c;
                l0Var.getClass();
                c0Var.c = (byte[]) obj;
                if (l0Var.N.get(str) == c0Var) {
                    l0Var.k0(c0Var);
                    l0Var.L();
                }
                runnable.run();
                break;
            case 1:
                f8.Z((f8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.e2) this.e, (String) obj);
                break;
            case 2:
                p8 p8Var = (p8) this.d;
                String str2 = (String) this.b;
                p0 p0Var = (p0) this.e;
                l0 l0Var2 = this.c;
                l0Var2.u(str2, new p((z10) obj, l0Var2, p0Var, p8Var));
                break;
            default:
                p8 p8Var2 = (p8) this.d;
                z10 z10Var = (z10) this.b;
                p0 p0Var2 = (p0) this.e;
                c0 c0Var2 = (c0) obj;
                if (c0Var2 != null) {
                    byte[] bArr = c0Var2.c;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] m10 = p0Var2.m();
                        if (m10.length <= 0) {
                            z10Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!p0Var2.f(bArr)) {
                        z10Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        m mVar = new m(z10Var, this.c, p0Var2, p8Var2);
                        p0.h.execute(new org.telegram.ui.Components.i2(p0Var2, p0Var2.l(), bArr == null ? "" : p0.o(bArr), z10, mVar));
                        break;
                    }
                } else {
                    z10Var.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ p(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.c = l0Var;
        this.d = c0Var;
        this.b = str;
        this.e = runnable;
    }

    public /* synthetic */ p(f8 f8Var, String str, l0 l0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = f8Var;
        this.b = str;
        this.c = l0Var;
        this.e = e2Var;
    }

    public /* synthetic */ p(p8 p8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = p8Var;
        this.c = l0Var;
        this.b = str;
        this.e = p0Var;
    }
}
