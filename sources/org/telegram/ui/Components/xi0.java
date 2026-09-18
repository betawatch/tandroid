package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi0 b;

    public /* synthetic */ xi0(yi0 yi0Var, int i10) {
        this.a = i10;
        this.b = yi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yi0 yi0Var = this.b;
                yi0Var.getClass();
                try {
                    yf.e eVar = yi0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yi0Var.z0);
                break;
            case 1:
                yi0 yi0Var2 = this.b;
                yi0Var2.P = null;
                yi0Var2.p();
                break;
            case 2:
                yi0.h(this.b);
                break;
            case 3:
                yi0.e(this.b);
                break;
            case 4:
                yi0.d(this.b);
                break;
            case 5:
                yi0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
