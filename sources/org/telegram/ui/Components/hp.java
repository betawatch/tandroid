package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gd1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hp implements gd1 {
    public final /* synthetic */ pp a;

    public hp(pp ppVar) {
        this.a = ppVar;
    }

    @Override // org.telegram.ui.gd1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.gd1
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.gd1
    public final void q1(boolean z10) {
        pp ppVar = this.a;
        org.telegram.ui.yn ynVar = ppVar.v;
        ppVar.N = !ppVar.N;
        if (ppVar.M != null) {
            ppVar.P = true;
            ynVar.c7 = true;
            TLRPC.WallPaper wallPaper = ppVar.v() ? null : ppVar.n.h;
            org.telegram.ui.ActionBar.c4 c4Var = ppVar.M.a;
            if (c4Var.a) {
                ppVar.n.i(null, wallPaper, z10, Boolean.valueOf(ppVar.N), false);
            } else {
                ppVar.n.i(c4Var, wallPaper, z10, Boolean.valueOf(ppVar.N), false);
            }
            ynVar.c7 = false;
        }
    }
}
