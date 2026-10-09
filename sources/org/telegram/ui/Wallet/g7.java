package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ p0 d;
    public final /* synthetic */ k0 e;

    public /* synthetic */ g7(l7 l7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var) {
        this.b = l7Var;
        this.c = callback;
        this.e = k0Var;
        this.d = p0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l7.Y(this.b, this.c, this.e, this.d, (h0) obj);
                break;
            default:
                b0 b0Var = (b0) obj;
                Utilities.Callback callback = this.c;
                if (b0Var != null) {
                    byte[] bArr = b0Var.c;
                    p0 p0Var = this.d;
                    boolean z10 = false;
                    if (bArr == null) {
                        byte[][] m10 = p0Var.m();
                        if (m10.length <= 0) {
                            callback.run("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = m10[0];
                        }
                    }
                    if (!p0Var.f(bArr)) {
                        callback.run("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        g7 g7Var = new g7(this.b, callback, this.e, p0Var);
                        p0.h.execute(new org.telegram.ui.Components.r2(p0Var, p0Var.l(), bArr == null ? "" : p0.o(bArr), z10, g7Var));
                        break;
                    }
                } else {
                    callback.run("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ g7(l7 l7Var, Utilities.Callback callback, p0 p0Var, k0 k0Var) {
        this.b = l7Var;
        this.c = callback;
        this.d = p0Var;
        this.e = k0Var;
    }
}
