package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ g21(x21 x21Var, int i10) {
        this.a = i10;
        this.b = x21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b;
                n21 n21Var = x21Var.D;
                n21Var.w1(true);
                l21 l21Var = x21Var.s;
                l21Var.w1(true);
                x21Var.G.a(true, true);
                AndroidUtilities.updateVisibleRows(l21Var);
                AndroidUtilities.updateVisibleRows(n21Var);
                break;
            default:
                x21 x21Var2 = this.b;
                if (x21Var2.k()) {
                    x21Var2.l();
                    break;
                }
                break;
        }
    }
}
