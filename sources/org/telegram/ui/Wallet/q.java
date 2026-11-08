package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements c20 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(c20 c20Var, m0 m0Var, q0 q0Var, n8 n8Var) {
        this.d = n8Var;
        this.b = c20Var;
        this.e = q0Var;
        this.c = m0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                m0 m0Var = this.c;
                m0Var.getClass();
                d0Var.c = (byte[]) obj;
                if (m0Var.N.get(str) == d0Var) {
                    m0Var.k0(d0Var);
                    m0Var.L();
                }
                runnable.run();
                break;
            case 1:
                e8.Z((e8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.f2) this.e, (String) obj);
                break;
            case 2:
                n8 n8Var = (n8) this.d;
                String str2 = (String) this.b;
                q0 q0Var = (q0) this.e;
                m0 m0Var2 = this.c;
                m0Var2.u(str2, new q((c20) obj, m0Var2, q0Var, n8Var));
                break;
            default:
                n8 n8Var2 = (n8) this.d;
                c20 c20Var = (c20) this.b;
                q0 q0Var2 = (q0) this.e;
                d0 d0Var2 = (d0) obj;
                if (d0Var2 != null) {
                    byte[] bArr = d0Var2.c;
                    boolean z9 = false;
                    if (bArr == null) {
                        byte[][] m10 = q0Var2.m();
                        if (m10.length <= 0) {
                            c20Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!q0Var2.f(bArr)) {
                        c20Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        m mVar = new m(c20Var, this.c, q0Var2, n8Var2);
                        q0.h.execute(new org.telegram.ui.Components.j2(q0Var2, q0Var2.l(), bArr == null ? "" : q0.o(bArr), z9, mVar));
                        break;
                    }
                } else {
                    c20Var.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ q(m0 m0Var, d0 d0Var, String str, Runnable runnable) {
        this.c = m0Var;
        this.d = d0Var;
        this.b = str;
        this.e = runnable;
    }

    public /* synthetic */ q(e8 e8Var, String str, m0 m0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = e8Var;
        this.b = str;
        this.c = m0Var;
        this.e = f2Var;
    }

    public /* synthetic */ q(n8 n8Var, m0 m0Var, String str, q0 q0Var) {
        this.d = n8Var;
        this.c = m0Var;
        this.b = str;
        this.e = q0Var;
    }
}
