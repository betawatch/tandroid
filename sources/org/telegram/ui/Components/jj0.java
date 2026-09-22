package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj0 b;

    public /* synthetic */ jj0(kj0 kj0Var, int i10) {
        this.a = i10;
        this.b = kj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kj0 kj0Var = this.b;
                kj0Var.getClass();
                try {
                    yf.e eVar = kj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(kj0Var.z0);
                break;
            case 1:
                kj0 kj0Var2 = this.b;
                kj0Var2.P = null;
                kj0Var2.p();
                break;
            case 2:
                kj0.h(this.b);
                break;
            case 3:
                kj0.e(this.b);
                break;
            case 4:
                kj0.d(this.b);
                break;
            case 5:
                kj0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
