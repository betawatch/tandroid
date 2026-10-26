package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e50 b;

    public /* synthetic */ d50(e50 e50Var, int i10) {
        this.a = i10;
        this.b = e50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e50 e50Var = this.b;
                z10 z10Var = e50Var.b;
                if (z10Var != null) {
                    z10Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new d50(e50Var, 2), 16L);
                break;
            case 1:
                z10 z10Var2 = this.b.b;
                if (z10Var2 != null) {
                    z10Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
