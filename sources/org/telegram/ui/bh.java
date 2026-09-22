package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ bh(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.x01.c()) {
                    bo boVar = this.b;
                    org.telegram.ui.Components.x01 x01Var = boVar.v0;
                    if (x01Var == null || x01Var.e) {
                        if (boVar.getParentActivity() != null && org.telegram.ui.Components.x01.c() && boVar.x0 != null && boVar.X0 != null) {
                            org.telegram.ui.Components.x01 x01Var2 = boVar.v0;
                            if (x01Var2 != null) {
                                AndroidUtilities.removeFromParent(x01Var2);
                            }
                            org.telegram.ui.Components.x01 x01Var3 = new org.telegram.ui.Components.x01(boVar.getParentActivity(), new l4(20, boVar, r2));
                            boVar.v0 = x01Var3;
                            org.telegram.ui.Components.x01[] x01VarArr = {x01Var3};
                            tm tmVar = boVar.X0;
                            tmVar.addView(x01Var3, tmVar.indexOfChild(boVar.x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return boVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.x01.c() && LiteMode.isEnabled(65536));
        }
    }
}
