package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;

    public /* synthetic */ wj0(xj0 xj0Var, int i10) {
        this.a = i10;
        this.b = xj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xj0 xj0Var = this.b;
                xj0Var.getClass();
                try {
                    ag.k kVar = xj0Var.B0;
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xj0Var.z0);
                break;
            case 1:
                xj0 xj0Var2 = this.b;
                xj0Var2.P = null;
                xj0Var2.p();
                break;
            case 2:
                xj0.h(this.b);
                break;
            case 3:
                xj0.e(this.b);
                break;
            case 4:
                xj0.d(this.b);
                break;
            case 5:
                xj0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
