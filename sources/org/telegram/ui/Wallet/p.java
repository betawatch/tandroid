package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements r20 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(r20 r20Var, k0 k0Var, p0 p0Var, t8 t8Var) {
        this.d = t8Var;
        this.b = r20Var;
        this.e = p0Var;
        this.c = k0Var;
    }

    @Override // org.telegram.messenger.r20
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
                k8.Z((k8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.k2) this.e, (String) obj);
                break;
            case 2:
                t8 t8Var = (t8) this.d;
                String str2 = (String) this.b;
                p0 p0Var = (p0) this.e;
                k0 k0Var2 = this.c;
                k0Var2.u(str2, new p((r20) obj, k0Var2, p0Var, t8Var));
                break;
            default:
                t8 t8Var2 = (t8) this.d;
                r20 r20Var = (r20) this.b;
                p0 p0Var2 = (p0) this.e;
                b0 b0Var2 = (b0) obj;
                if (b0Var2 != null) {
                    byte[] bArr = b0Var2.c;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] m10 = p0Var2.m();
                        if (m10.length <= 0) {
                            r20Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!p0Var2.f(bArr)) {
                        r20Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        m mVar = new m(r20Var, this.c, p0Var2, t8Var2);
                        p0.h.execute(new org.telegram.ui.Components.k2(p0Var2, p0Var2.l(), bArr == null ? "" : p0.o(bArr), z10, mVar));
                        break;
                    }
                } else {
                    r20Var.a("ADDRESS_NO_INFO");
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

    public /* synthetic */ p(k8 k8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = k8Var;
        this.b = str;
        this.c = k0Var;
        this.e = k2Var;
    }

    public /* synthetic */ p(t8 t8Var, k0 k0Var, String str, p0 p0Var) {
        this.d = t8Var;
        this.c = k0Var;
        this.b = str;
        this.e = p0Var;
    }
}
