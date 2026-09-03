package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;

    public /* synthetic */ ej0(gj0 gj0Var, int i10) {
        this.a = i10;
        this.b = gj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gj0 gj0Var = this.b;
                gj0Var.getClass();
                try {
                    kf.g gVar = gj0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(gj0Var.y0);
                break;
            case 1:
                gj0 gj0Var2 = this.b;
                gj0Var2.N = null;
                gj0Var2.n();
                break;
            case 2:
                gj0.h(this.b);
                break;
            case 3:
                gj0.e(this.b);
                break;
            case 4:
                gj0.d(this.b);
                break;
            case 5:
                gj0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
