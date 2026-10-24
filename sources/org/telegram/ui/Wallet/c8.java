package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ p0 d;
    public final /* synthetic */ l0 e;

    public /* synthetic */ c8(i8 i8Var, Utilities.Callback callback, l0 l0Var, p0 p0Var) {
        this.b = i8Var;
        this.c = callback;
        this.e = l0Var;
        this.d = p0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i8.Y(this.b, this.c, this.e, this.d, (i0) obj);
                break;
            default:
                c0 c0Var = (c0) obj;
                Utilities.Callback callback = this.c;
                if (c0Var != null) {
                    byte[] bArr = c0Var.c;
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
                        c8 c8Var = new c8(this.b, callback, this.e, p0Var);
                        p0.h.execute(new org.telegram.ui.Components.q2(p0Var, p0Var.l(), bArr == null ? "" : p0.o(bArr), z10, c8Var));
                        break;
                    }
                } else {
                    callback.run("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ c8(i8 i8Var, Utilities.Callback callback, p0 p0Var, l0 l0Var) {
        this.b = i8Var;
        this.c = callback;
        this.d = p0Var;
        this.e = l0Var;
    }
}
