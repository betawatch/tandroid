package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ bh(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.w01.c()) {
                    co coVar = this.b;
                    org.telegram.ui.Components.w01 w01Var = coVar.v0;
                    if (w01Var == null || w01Var.e) {
                        if (coVar.getParentActivity() != null && org.telegram.ui.Components.w01.c() && coVar.x0 != null && coVar.X0 != null) {
                            org.telegram.ui.Components.w01 w01Var2 = coVar.v0;
                            if (w01Var2 != null) {
                                AndroidUtilities.removeFromParent(w01Var2);
                            }
                            org.telegram.ui.Components.w01 w01Var3 = new org.telegram.ui.Components.w01(coVar.getParentActivity(), new org.telegram.ui.ActionBar.c6(26, coVar, r2));
                            coVar.v0 = w01Var3;
                            org.telegram.ui.Components.w01[] w01VarArr = {w01Var3};
                            um umVar = coVar.X0;
                            umVar.addView(w01Var3, umVar.indexOfChild(coVar.x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return coVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.w01.c() && LiteMode.isEnabled(65536));
        }
    }
}
