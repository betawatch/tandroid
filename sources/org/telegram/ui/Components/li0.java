package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;

    public /* synthetic */ li0(oi0 oi0Var, int i10) {
        this.a = i10;
        this.b = oi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oi0 oi0Var = this.b;
                oi0Var.getClass();
                try {
                    gf.h hVar = oi0Var.z0;
                    if (hVar != null) {
                        hVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(oi0Var.x0);
                break;
            case 1:
                oi0 oi0Var2 = this.b;
                oi0Var2.M = null;
                oi0Var2.n();
                break;
            case 2:
                oi0.h(this.b);
                break;
            case 3:
                oi0.e(this.b);
                break;
            case 4:
                oi0.d(this.b);
                break;
            case 5:
                oi0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
