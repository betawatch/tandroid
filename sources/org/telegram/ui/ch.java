package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ ch(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.k11.c()) {
                    eo eoVar = this.b;
                    org.telegram.ui.Components.k11 k11Var = eoVar.v0;
                    if (k11Var == null || k11Var.e) {
                        if (eoVar.getParentActivity() != null && org.telegram.ui.Components.k11.c() && eoVar.x0 != null && eoVar.X0 != null) {
                            org.telegram.ui.Components.k11 k11Var2 = eoVar.v0;
                            if (k11Var2 != null) {
                                AndroidUtilities.removeFromParent(k11Var2);
                            }
                            org.telegram.ui.Components.k11 k11Var3 = new org.telegram.ui.Components.k11(eoVar.getParentActivity(), new n(23, eoVar, r2));
                            eoVar.v0 = k11Var3;
                            org.telegram.ui.Components.k11[] k11VarArr = {k11Var3};
                            vm vmVar = eoVar.X0;
                            vmVar.addView(k11Var3, vmVar.indexOfChild(eoVar.x0) + 1, w7.a6.c(-1.0f, -1));
                        }
                    }
                    return eoVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.k11.c() && LiteMode.isEnabled(65536));
        }
    }
}
