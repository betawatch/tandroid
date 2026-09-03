package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    public /* synthetic */ fj0(hj0 hj0Var, int i10) {
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hj0 hj0Var = this.b;
                hj0Var.getClass();
                try {
                    lf.g gVar = hj0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(hj0Var.y0);
                break;
            case 1:
                hj0 hj0Var2 = this.b;
                hj0Var2.N = null;
                hj0Var2.n();
                break;
            case 2:
                hj0.h(this.b);
                break;
            case 3:
                hj0.e(this.b);
                break;
            case 4:
                hj0.d(this.b);
                break;
            case 5:
                hj0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
