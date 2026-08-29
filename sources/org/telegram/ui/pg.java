package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ pg(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.p01.c()) {
                    tn tnVar = this.b;
                    org.telegram.ui.Components.p01 p01Var = tnVar.r0;
                    if (p01Var == null || p01Var.e) {
                        if (tnVar.getParentActivity() != null && org.telegram.ui.Components.p01.c() && tnVar.t0 != null && tnVar.T0 != null) {
                            org.telegram.ui.Components.p01 p01Var2 = tnVar.r0;
                            if (p01Var2 != null) {
                                AndroidUtilities.removeFromParent(p01Var2);
                            }
                            org.telegram.ui.Components.p01 p01Var3 = new org.telegram.ui.Components.p01(tnVar.getParentActivity(), new org.telegram.ui.ActionBar.c(29, tnVar, r2));
                            tnVar.r0 = p01Var3;
                            org.telegram.ui.Components.p01[] p01VarArr = {p01Var3};
                            km kmVar = tnVar.T0;
                            kmVar.addView(p01Var3, kmVar.indexOfChild(tnVar.t0) + 1, i7.f6.c(-1.0f, -1));
                        }
                    }
                    return tnVar.r0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.p01.c() && LiteMode.isEnabled(65536));
        }
    }
}
