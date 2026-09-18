package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ dh(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.y01.c()) {
                    bo boVar = this.b;
                    org.telegram.ui.Components.y01 y01Var = boVar.v0;
                    if (y01Var == null || y01Var.e) {
                        if (boVar.getParentActivity() != null && org.telegram.ui.Components.y01.c() && boVar.x0 != null && boVar.X0 != null) {
                            org.telegram.ui.Components.y01 y01Var2 = boVar.v0;
                            if (y01Var2 != null) {
                                AndroidUtilities.removeFromParent(y01Var2);
                            }
                            org.telegram.ui.Components.y01 y01Var3 = new org.telegram.ui.Components.y01(boVar.getParentActivity(), new l4(20, boVar, r2));
                            boVar.v0 = y01Var3;
                            org.telegram.ui.Components.y01[] y01VarArr = {y01Var3};
                            tm tmVar = boVar.X0;
                            tmVar.addView(y01Var3, tmVar.indexOfChild(boVar.x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return boVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.y01.c() && LiteMode.isEnabled(65536));
        }
    }
}
