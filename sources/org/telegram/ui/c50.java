package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d50 b;

    public /* synthetic */ c50(d50 d50Var, int i10) {
        this.a = i10;
        this.b = d50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d50 d50Var = this.b;
                e50 e50Var = d50Var.b;
                if (e50Var != null) {
                    e50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new c50(d50Var, 2), 16L);
                break;
            case 1:
                e50 e50Var2 = this.b.b;
                if (e50Var2 != null) {
                    e50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
