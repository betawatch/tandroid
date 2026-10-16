package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y31 b;

    public /* synthetic */ g31(y31 y31Var, int i10) {
        this.a = i10;
        this.b = y31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y31 y31Var = this.b;
                o31 o31Var = y31Var.G;
                o31Var.x1(true);
                m31 m31Var = y31Var.s;
                m31Var.x1(true);
                y31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(m31Var);
                AndroidUtilities.updateVisibleRows(o31Var);
                break;
            default:
                y31 y31Var2 = this.b;
                if (y31Var2.k()) {
                    y31Var2.l();
                    break;
                }
                break;
        }
    }
}
