package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                n50 n50Var = m50Var.b;
                if (n50Var != null) {
                    n50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new l50(m50Var, 2), 16L);
                break;
            case 1:
                n50 n50Var2 = this.b.b;
                if (n50Var2 != null) {
                    n50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
