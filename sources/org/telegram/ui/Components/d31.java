package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w31 b;

    public /* synthetic */ d31(w31 w31Var, int i10) {
        this.a = i10;
        this.b = w31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w31 w31Var = this.b;
                m31 m31Var = w31Var.G;
                m31Var.x1(true);
                k31 k31Var = w31Var.s;
                k31Var.x1(true);
                w31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(k31Var);
                AndroidUtilities.updateVisibleRows(m31Var);
                break;
            default:
                w31 w31Var2 = this.b;
                if (w31Var2.k()) {
                    w31Var2.l();
                    break;
                }
                break;
        }
    }
}
