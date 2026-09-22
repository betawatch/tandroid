package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ q50(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r50 r50Var = this.b;
                s50 s50Var = r50Var.b;
                if (s50Var != null) {
                    s50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new q50(r50Var, 2), 16L);
                break;
            case 1:
                s50 s50Var2 = this.b.b;
                if (s50Var2 != null) {
                    s50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
