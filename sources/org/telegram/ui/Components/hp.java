package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class hp implements id1 {
    public final /* synthetic */ pp a;

    public hp(pp ppVar) {
        this.a = ppVar;
    }

    @Override // org.telegram.ui.id1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.id1
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.id1
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
