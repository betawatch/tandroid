package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ f21(w21 w21Var, int i10) {
        this.a = i10;
        this.b = w21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w21 w21Var = this.b;
                m21 m21Var = w21Var.D;
                m21Var.w1(true);
                k21 k21Var = w21Var.s;
                k21Var.w1(true);
                w21Var.G.a(true, true);
                AndroidUtilities.updateVisibleRows(k21Var);
                AndroidUtilities.updateVisibleRows(m21Var);
                break;
            default:
                w21 w21Var2 = this.b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    break;
                }
                break;
        }
    }
}
