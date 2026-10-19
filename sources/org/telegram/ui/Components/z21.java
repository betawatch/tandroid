package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class z21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r31 b;

    public /* synthetic */ z21(r31 r31Var, int i10) {
        this.a = i10;
        this.b = r31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r31 r31Var = this.b;
                g31 g31Var = r31Var.G;
                g31Var.x1(true);
                e31 e31Var = r31Var.s;
                e31Var.x1(true);
                r31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(e31Var);
                AndroidUtilities.updateVisibleRows(g31Var);
                break;
            default:
                r31 r31Var2 = this.b;
                if (r31Var2.k()) {
                    r31Var2.l();
                    break;
                }
                break;
        }
    }
}
