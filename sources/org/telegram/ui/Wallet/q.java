package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements c20 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(c20 c20Var, n0 n0Var, r0 r0Var, o8 o8Var) {
        this.d = o8Var;
        this.b = c20Var;
        this.e = r0Var;
        this.c = n0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                n0 n0Var = this.c;
                n0Var.getClass();
                e0Var.c = (byte[]) obj;
                if (n0Var.N.get(str) == e0Var) {
                    n0Var.k0(e0Var);
                    n0Var.L();
                }
                runnable.run();
                break;
            case 1:
                f8.Z((f8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.f2) this.e, (String) obj);
                break;
            case 2:
                o8 o8Var = (o8) this.d;
                String str2 = (String) this.b;
                r0 r0Var = (r0) this.e;
                n0 n0Var2 = this.c;
                n0Var2.u(str2, new q((c20) obj, n0Var2, r0Var, o8Var));
                break;
            default:
                o8 o8Var2 = (o8) this.d;
                c20 c20Var = (c20) this.b;
                r0 r0Var2 = (r0) this.e;
                e0 e0Var2 = (e0) obj;
                if (e0Var2 != null) {
                    byte[] bArr = e0Var2.c;
                    boolean z9 = false;
                    if (bArr == null) {
                        byte[][] m10 = r0Var2.m();
                        if (m10.length <= 0) {
                            c20Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!r0Var2.f(bArr)) {
                        c20Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        m mVar = new m(c20Var, this.c, r0Var2, o8Var2);
                        r0.h.execute(new org.telegram.ui.Components.j2(r0Var2, r0Var2.l(), bArr == null ? "" : r0.o(bArr), z9, mVar));
                        break;
                    }
                } else {
                    c20Var.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ q(n0 n0Var, e0 e0Var, String str, Runnable runnable) {
        this.c = n0Var;
        this.d = e0Var;
        this.b = str;
        this.e = runnable;
    }

    public /* synthetic */ q(f8 f8Var, String str, n0 n0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = f8Var;
        this.b = str;
        this.c = n0Var;
        this.e = f2Var;
    }

    public /* synthetic */ q(o8 o8Var, n0 n0Var, String str, r0 r0Var) {
        this.d = o8Var;
        this.c = n0Var;
        this.b = str;
        this.e = r0Var;
    }
}
