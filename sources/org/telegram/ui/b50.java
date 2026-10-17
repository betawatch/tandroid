package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c50 b;

    public /* synthetic */ b50(c50 c50Var, int i10) {
        this.a = i10;
        this.b = c50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c50 c50Var = this.b;
                x10 x10Var = c50Var.b;
                if (x10Var != null) {
                    x10Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new b50(c50Var, 2), 16L);
                break;
            case 1:
                x10 x10Var2 = this.b.b;
                if (x10Var2 != null) {
                    x10Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
