package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ jv0(uv0 uv0Var, int i10) {
        this.a = i10;
        this.b = uv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uv0 uv0Var = this.b;
                AndroidUtilities.runOnUIThread(new jv0(uv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = uv0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = uv0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                om omVar = uv0Var.e0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    uv0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ jv0(uv0 uv0Var, boolean z10) {
        this.a = 0;
        this.b = uv0Var;
    }
}
