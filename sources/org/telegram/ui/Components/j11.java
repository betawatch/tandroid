package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b21 b;

    public /* synthetic */ j11(b21 b21Var, int i9) {
        this.a = i9;
        this.b = b21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b21 b21Var = this.b;
                q11 q11Var = b21Var.C;
                q11Var.w1(true);
                o11 o11Var = b21Var.s;
                o11Var.w1(true);
                b21Var.F.a(true, true);
                AndroidUtilities.updateVisibleRows(o11Var);
                AndroidUtilities.updateVisibleRows(q11Var);
                break;
            default:
                b21 b21Var2 = this.b;
                if (b21Var2.k()) {
                    b21Var2.l();
                    break;
                }
                break;
        }
    }
}
