package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ah(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.c21.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.c21.c()) {
                    zn znVar = this.b;
                    org.telegram.ui.Components.c21 c21Var = znVar.v0;
                    if (c21Var == null || c21Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.c21.c() && znVar.x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.c21 c21Var2 = znVar.v0;
                            if (c21Var2 != null) {
                                AndroidUtilities.removeFromParent(c21Var2);
                            }
                            org.telegram.ui.Components.c21 c21Var3 = new org.telegram.ui.Components.c21(znVar.getParentActivity(), new org.telegram.ui.ActionBar.p(27, znVar, r2));
                            znVar.v0 = c21Var3;
                            org.telegram.ui.Components.c21[] c21VarArr = {c21Var3};
                            sm smVar = znVar.X0;
                            smVar.addView(c21Var3, smVar.indexOfChild(znVar.x0) + 1, w7.x5.d(-1.0f, -1));
                        }
                    }
                    return znVar.v0;
                }
                return null;
        }
    }
}
