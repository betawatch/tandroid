package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.m11.c()) {
                    zn znVar = this.b;
                    org.telegram.ui.Components.m11 m11Var = znVar.v0;
                    if (m11Var == null || m11Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.m11.c() && znVar.x0 != null && znVar.X0 != null) {
                            org.telegram.ui.Components.m11 m11Var2 = znVar.v0;
                            if (m11Var2 != null) {
                                AndroidUtilities.removeFromParent(m11Var2);
                            }
                            org.telegram.ui.Components.m11 m11Var3 = new org.telegram.ui.Components.m11(znVar.getParentActivity(), new org.telegram.ui.ActionBar.h6(24, znVar, r2));
                            znVar.v0 = m11Var3;
                            org.telegram.ui.Components.m11[] m11VarArr = {m11Var3};
                            rm rmVar = znVar.X0;
                            rmVar.addView(m11Var3, rmVar.indexOfChild(znVar.x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return znVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.m11.c() && LiteMode.isEnabled(65536));
        }
    }
}
