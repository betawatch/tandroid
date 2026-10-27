package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g50 b;

    public /* synthetic */ f50(g50 g50Var, int i10) {
        this.a = i10;
        this.b = g50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g50 g50Var = this.b;
                b20 b20Var = g50Var.b;
                if (b20Var != null) {
                    b20Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new f50(g50Var, 2), 16L);
                break;
            case 1:
                b20 b20Var2 = this.b.b;
                if (b20Var2 != null) {
                    b20Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
