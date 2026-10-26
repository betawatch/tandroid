package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ pg(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.g21.c()) {
                    org.telegram.ui.Components.g21 g21Var = unVar.v0;
                    if (g21Var == null || g21Var.e) {
                        if (unVar.getParentActivity() != null && org.telegram.ui.Components.g21.c() && unVar.x0 != null && unVar.j1 != null) {
                            org.telegram.ui.Components.g21 g21Var2 = unVar.v0;
                            if (g21Var2 != null) {
                                AndroidUtilities.removeFromParent(g21Var2);
                            }
                            org.telegram.ui.Components.g21 g21Var3 = new org.telegram.ui.Components.g21(unVar.getParentActivity(), new ed(3, unVar, r2));
                            unVar.v0 = g21Var3;
                            org.telegram.ui.Components.g21[] g21VarArr = {g21Var3};
                            mm mmVar = unVar.j1;
                            mmVar.addView(g21Var3, mmVar.indexOfChild(unVar.x0) + 1, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                        }
                    }
                    return unVar.v0;
                }
                return null;
            case 1:
                ((un) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.g21.c() && LiteMode.isEnabled(65536));
            default:
                return ((ProfileActivity) this.b).getSimpleMenuOverlay();
        }
    }
}
