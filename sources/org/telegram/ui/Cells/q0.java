package org.telegram.ui.Cells;

import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij0 b;

    public /* synthetic */ q0(ij0 ij0Var, int i10) {
        this.a = i10;
        this.b = ij0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H(false);
                break;
            default:
                this.b.start();
                break;
        }
    }
}
