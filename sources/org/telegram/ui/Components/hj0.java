package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij0 b;

    public /* synthetic */ hj0(ij0 ij0Var, int i10) {
        this.a = i10;
        this.b = ij0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ij0 ij0Var = this.b;
                ij0Var.getClass();
                try {
                    yf.e eVar = ij0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ij0Var.z0);
                break;
            case 1:
                ij0 ij0Var2 = this.b;
                ij0Var2.P = null;
                ij0Var2.p();
                break;
            case 2:
                ij0.h(this.b);
                break;
            case 3:
                ij0.e(this.b);
                break;
            case 4:
                ij0.d(this.b);
                break;
            case 5:
                ij0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
