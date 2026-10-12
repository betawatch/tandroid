package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ o0 d;
    public final /* synthetic */ j0 e;

    public /* synthetic */ f7(k7 k7Var, Utilities.Callback callback, j0 j0Var, o0 o0Var) {
        this.b = k7Var;
        this.c = callback;
        this.e = j0Var;
        this.d = o0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k7.Y(this.b, this.c, this.e, this.d, (g0) obj);
                break;
            default:
                a0 a0Var = (a0) obj;
                Utilities.Callback callback = this.c;
                if (a0Var != null) {
                    byte[] bArr = a0Var.c;
                    o0 o0Var = this.d;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] m10 = o0Var.m();
                        if (m10.length <= 0) {
                            callback.run("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!o0Var.f(bArr)) {
                        callback.run("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        f7 f7Var = new f7(this.b, callback, this.e, o0Var);
                        o0.h.execute(new org.telegram.ui.Components.r2(o0Var, o0Var.l(), bArr == null ? "" : o0.o(bArr), z10, f7Var));
                        break;
                    }
                } else {
                    callback.run("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ f7(k7 k7Var, Utilities.Callback callback, o0 o0Var, j0 j0Var) {
        this.b = k7Var;
        this.c = callback;
        this.d = o0Var;
        this.e = j0Var;
    }
}
