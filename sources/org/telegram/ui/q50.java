package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
