package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gp implements fd1 {
    public final /* synthetic */ op a;

    public gp(op opVar) {
        this.a = opVar;
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
        op opVar = this.a;
        org.telegram.ui.wn wnVar = opVar.v;
        opVar.N = !opVar.N;
        if (opVar.M != null) {
            opVar.P = true;
            wnVar.e7 = true;
            TLRPC.WallPaper wallPaper = opVar.v() ? null : opVar.n.h;
            org.telegram.ui.ActionBar.b4 b4Var = opVar.M.a;
            if (b4Var.a) {
                opVar.n.i(null, wallPaper, z10, Boolean.valueOf(opVar.N), false);
            } else {
                opVar.n.i(b4Var, wallPaper, z10, Boolean.valueOf(opVar.N), false);
            }
            wnVar.e7 = false;
        }
    }
}
