package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
