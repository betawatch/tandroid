package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements c20 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(c20 c20Var, l0 l0Var, p0 p0Var, m8 m8Var) {
        this.d = m8Var;
        this.b = c20Var;
        this.e = p0Var;
        this.c = l0Var;
    }

    @Override // org.telegram.messenger.c20
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
                d8.Z((d8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.f2) this.e, (String) obj);
                break;
            case 2:
                m8 m8Var = (m8) this.d;
                String str2 = (String) this.b;
                p0 p0Var = (p0) this.e;
                l0 l0Var2 = this.c;
                l0Var2.u(str2, new p((c20) obj, l0Var2, p0Var, m8Var));
                break;
            default:
                m8 m8Var2 = (m8) this.d;
                c20 c20Var = (c20) this.b;
                p0 p0Var2 = (p0) this.e;
                c0 c0Var2 = (c0) obj;
                if (c0Var2 != null) {
                    byte[] bArr = c0Var2.c;
                    boolean z9 = false;
                    if (bArr == null) {
                        byte[][] m10 = p0Var2.m();
                        if (m10.length <= 0) {
                            c20Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!p0Var2.f(bArr)) {
                        c20Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        m mVar = new m(c20Var, this.c, p0Var2, m8Var2);
                        p0.h.execute(new org.telegram.ui.Components.j2(p0Var2, p0Var2.l(), bArr == null ? "" : p0.o(bArr), z9, mVar));
                        break;
                    }
                } else {
                    c20Var.a("ADDRESS_NO_INFO");
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

    public /* synthetic */ p(d8 d8Var, String str, l0 l0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = d8Var;
        this.b = str;
        this.c = l0Var;
        this.e = f2Var;
    }

    public /* synthetic */ p(m8 m8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = m8Var;
        this.c = l0Var;
        this.b = str;
        this.e = p0Var;
    }
}
