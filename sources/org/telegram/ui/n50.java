package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ n50(o50 o50Var, int i10) {
        this.a = i10;
        this.b = o50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o50 o50Var = this.b;
                eg.h0 h0Var = o50Var.b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new n50(o50Var, 2), 16L);
                break;
            case 1:
                eg.h0 h0Var2 = this.b.b;
                if (h0Var2 != null) {
                    h0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
