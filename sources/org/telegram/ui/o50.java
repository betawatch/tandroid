package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p50 b;

    public /* synthetic */ o50(p50 p50Var, int i10) {
        this.a = i10;
        this.b = p50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p50 p50Var = this.b;
                q50 q50Var = p50Var.b;
                if (q50Var != null) {
                    q50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new o50(p50Var, 2), 16L);
                break;
            case 1:
                q50 q50Var2 = this.b.b;
                if (q50Var2 != null) {
                    q50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
