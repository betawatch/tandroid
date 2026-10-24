package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ an0(cn0 cn0Var, int i10) {
        this.a = i10;
        this.b = cn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn0 cn0Var = this.b;
                cn0Var.getClass();
                AndroidUtilities.runOnUIThread(new an0(cn0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new an0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
