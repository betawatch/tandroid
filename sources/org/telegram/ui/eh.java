package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ eh(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.y11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.y11.c()) {
                    fo foVar = this.b;
                    org.telegram.ui.Components.y11 y11Var = foVar.v0;
                    if (y11Var == null || y11Var.e) {
                        if (foVar.getParentActivity() != null && org.telegram.ui.Components.y11.c() && foVar.x0 != null && foVar.X0 != null) {
                            org.telegram.ui.Components.y11 y11Var2 = foVar.v0;
                            if (y11Var2 != null) {
                                AndroidUtilities.removeFromParent(y11Var2);
                            }
                            org.telegram.ui.Components.y11 y11Var3 = new org.telegram.ui.Components.y11(foVar.getParentActivity(), new fc(8, foVar, r2));
                            foVar.v0 = y11Var3;
                            org.telegram.ui.Components.y11[] y11VarArr = {y11Var3};
                            xm xmVar = foVar.X0;
                            xmVar.addView(y11Var3, xmVar.indexOfChild(foVar.x0) + 1, w7.a6.d(-1.0f, -1));
                        }
                    }
                    return foVar.v0;
                }
                return null;
        }
    }
}
