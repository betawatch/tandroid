package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ bh(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.n11.c()) {
                    zn znVar = this.b;
                    org.telegram.ui.Components.n11 n11Var = znVar.v0;
                    if (n11Var == null || n11Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.n11.c() && znVar.x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.n11 n11Var2 = znVar.v0;
                            if (n11Var2 != null) {
                                AndroidUtilities.removeFromParent(n11Var2);
                            }
                            org.telegram.ui.Components.n11 n11Var3 = new org.telegram.ui.Components.n11(znVar.getParentActivity(), new org.telegram.ui.ActionBar.c6(26, znVar, r2));
                            znVar.v0 = n11Var3;
                            org.telegram.ui.Components.n11[] n11VarArr = {n11Var3};
                            rm rmVar = znVar.X0;
                            rmVar.addView(n11Var3, rmVar.indexOfChild(znVar.x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return znVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.n11.c() && LiteMode.isEnabled(65536));
        }
    }
}
