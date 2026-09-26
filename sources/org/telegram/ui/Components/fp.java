package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        org.telegram.ui.wn wnVar = npVar.v;
        npVar.N = !npVar.N;
        if (npVar.M != null) {
            npVar.P = true;
            wnVar.e7 = true;
            TLRPC.WallPaper wallPaper = npVar.v() ? null : npVar.n.h;
            org.telegram.ui.ActionBar.b4 b4Var = npVar.M.a;
            if (b4Var.a) {
                npVar.n.i(null, wallPaper, z10, Boolean.valueOf(npVar.N), false);
            } else {
                npVar.n.i(b4Var, wallPaper, z10, Boolean.valueOf(npVar.N), false);
            }
            wnVar.e7 = false;
        }
    }
}
