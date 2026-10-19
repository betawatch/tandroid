package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5 b;

    public /* synthetic */ h5(j5 j5Var, int i10) {
        this.a = i10;
        this.b = j5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
