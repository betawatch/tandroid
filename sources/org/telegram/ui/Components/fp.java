package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fp implements fd1 {
    public final /* synthetic */ np a;

    public fp(np npVar) {
        this.a = npVar;
    }

    @Override // org.telegram.ui.fd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.fd1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.fd1
    public final void o1(boolean z10) {
        np npVar = this.a;
        org.telegram.ui.xn xnVar = npVar.v;
        npVar.N = !npVar.N;
        if (npVar.M != null) {
            npVar.P = true;
            xnVar.e7 = true;
            TLRPC.WallPaper wallPaper = npVar.v() ? null : npVar.n.h;
            org.telegram.ui.ActionBar.c4 c4Var = npVar.M.a;
            if (c4Var.a) {
                npVar.n.i(null, wallPaper, z10, Boolean.valueOf(npVar.N), false);
            } else {
                npVar.n.i(c4Var, wallPaper, z10, Boolean.valueOf(npVar.N), false);
            }
            xnVar.e7 = false;
        }
    }
}
