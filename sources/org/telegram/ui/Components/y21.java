package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q31 b;

    public /* synthetic */ y21(q31 q31Var, int i10) {
        this.a = i10;
        this.b = q31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q31 q31Var = this.b;
                f31 f31Var = q31Var.G;
                f31Var.x1(true);
                d31 d31Var = q31Var.s;
                d31Var.x1(true);
                q31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(d31Var);
                AndroidUtilities.updateVisibleRows(f31Var);
                break;
            default:
                q31 q31Var2 = this.b;
                if (q31Var2.k()) {
                    q31Var2.l();
                    break;
                }
                break;
        }
    }
}
