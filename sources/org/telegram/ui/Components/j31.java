package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ j31(c41 c41Var, int i10) {
        this.a = i10;
        this.b = c41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c41 c41Var = this.b;
                s31 s31Var = c41Var.G;
                s31Var.x1(true);
                q31 q31Var = c41Var.s;
                q31Var.x1(true);
                c41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(q31Var);
                AndroidUtilities.updateVisibleRows(s31Var);
                break;
            default:
                c41 c41Var2 = this.b;
                if (c41Var2.k()) {
                    c41Var2.l();
                    break;
                }
                break;
        }
    }
}
