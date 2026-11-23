package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements w10 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ v0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s(w10 w10Var, v0 v0Var, a1 a1Var, e9 e9Var) {
        this.d = e9Var;
        this.b = w10Var;
        this.e = a1Var;
        this.c = v0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                v0 v0Var = this.c;
                v0Var.getClass();
                k0Var.c = (byte[]) obj;
                if (v0Var.Q.get(str) == k0Var) {
                    v0Var.v0(k0Var);
                    v0Var.T();
                }
                runnable.run();
                break;
            case 1:
                v8.Z((v8) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.g2) this.e, (String) obj);
                break;
            case 2:
                e9 e9Var = (e9) this.d;
                String str2 = (String) this.b;
                a1 a1Var = (a1) this.e;
                v0 v0Var2 = this.c;
                v0Var2.z(str2, new s((w10) obj, v0Var2, a1Var, e9Var));
                break;
            default:
                e9 e9Var2 = (e9) this.d;
                w10 w10Var = (w10) this.b;
                a1 a1Var2 = (a1) this.e;
                k0 k0Var2 = (k0) obj;
                if (k0Var2 != null) {
                    byte[] bArr = k0Var2.c;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] n10 = a1Var2.n();
                        if (n10.length <= 0) {
                            w10Var.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = n10[0];
                        }
                    }
                    if (!a1Var2.f(bArr)) {
                        w10Var.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        o oVar = new o(w10Var, this.c, a1Var2, e9Var2);
                        a1.i.execute(new org.telegram.ui.Components.r2(a1Var2, a1Var2.l(), bArr == null ? "" : a1.p(bArr), z10, oVar));
                        break;
                    }
                } else {
                    w10Var.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ s(v0 v0Var, k0 k0Var, String str, Runnable runnable) {
        this.c = v0Var;
        this.d = k0Var;
        this.b = str;
        this.e = runnable;
    }

    public /* synthetic */ s(v8 v8Var, String str, v0 v0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = v8Var;
        this.b = str;
        this.c = v0Var;
        this.e = g2Var;
    }

    public /* synthetic */ s(e9 e9Var, v0 v0Var, String str, a1 a1Var) {
        this.d = e9Var;
        this.c = v0Var;
        this.b = str;
        this.e = a1Var;
    }
}
