package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ r21(k31 k31Var, int i10) {
        this.a = i10;
        this.b = k31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k31 k31Var = this.b;
                a31 a31Var = k31Var.G;
                a31Var.w1(true);
                y21 y21Var = k31Var.s;
                y21Var.w1(true);
                k31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(y21Var);
                AndroidUtilities.updateVisibleRows(a31Var);
                break;
            default:
                k31 k31Var2 = this.b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    break;
                }
                break;
        }
    }
}
