package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                return Boolean.valueOf(org.telegram.ui.Components.z11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.z11.c()) {
                    fo foVar = this.b;
                    org.telegram.ui.Components.z11 z11Var = foVar.v0;
                    if (z11Var == null || z11Var.e) {
                        if (foVar.getParentActivity() != null && org.telegram.ui.Components.z11.c() && foVar.x0 != null && foVar.X0 != null) {
                            org.telegram.ui.Components.z11 z11Var2 = foVar.v0;
                            if (z11Var2 != null) {
                                AndroidUtilities.removeFromParent(z11Var2);
                            }
                            org.telegram.ui.Components.z11 z11Var3 = new org.telegram.ui.Components.z11(foVar.getParentActivity(), new jd(3, foVar, r2));
                            foVar.v0 = z11Var3;
                            org.telegram.ui.Components.z11[] z11VarArr = {z11Var3};
                            xm xmVar = foVar.X0;
                            xmVar.addView(z11Var3, xmVar.indexOfChild(foVar.x0) + 1, w7.z5.d(-1.0f, -1));
                        }
                    }
                    return foVar.v0;
                }
                return null;
        }
    }
}
