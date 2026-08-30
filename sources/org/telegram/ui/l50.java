package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m50 b;

    public /* synthetic */ l50(m50 m50Var, int i10) {
        this.a = i10;
        this.b = m50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m50 m50Var = this.b;
                eg.h0 h0Var = m50Var.b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
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
