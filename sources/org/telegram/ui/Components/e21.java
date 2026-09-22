package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ e21(x21 x21Var, int i10) {
        this.a = i10;
        this.b = x21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b;
                n21 n21Var = x21Var.G;
                n21Var.w1(true);
                l21 l21Var = x21Var.s;
                l21Var.w1(true);
                x21Var.J.a(true, true);
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
