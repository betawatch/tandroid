package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ n8 b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ q0 d;
    public final /* synthetic */ m0 e;

    public /* synthetic */ i8(n8 n8Var, Utilities.Callback callback, m0 m0Var, q0 q0Var) {
        this.b = n8Var;
        this.c = callback;
        this.e = m0Var;
        this.d = q0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                n8.Y(this.b, this.c, this.e, this.d, (j0) obj);
                break;
            default:
                d0 d0Var = (d0) obj;
                Utilities.Callback callback = this.c;
                if (d0Var != null) {
                    byte[] bArr = d0Var.c;
                    q0 q0Var = this.d;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] m10 = q0Var.m();
                        if (m10.length <= 0) {
                            callback.run("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!q0Var.f(bArr)) {
                        callback.run("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        i8 i8Var = new i8(this.b, callback, this.e, q0Var);
                        q0.h.execute(new org.telegram.ui.Components.r2(q0Var, q0Var.l(), bArr == null ? "" : q0.o(bArr), z10, i8Var));
                        break;
                    }
                } else {
                    callback.run("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ i8(n8 n8Var, Utilities.Callback callback, q0 q0Var, m0 m0Var) {
        this.b = n8Var;
        this.c = callback;
        this.d = q0Var;
        this.e = m0Var;
    }
}
