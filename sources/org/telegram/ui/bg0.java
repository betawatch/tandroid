package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ bg0(t3 t3Var, int i10) {
        this.a = i10;
        this.b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new bg0(this.b, 0));
                break;
        }
    }
}
