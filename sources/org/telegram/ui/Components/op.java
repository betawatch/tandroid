package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bc1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class op implements bc1 {
    public final /* synthetic */ wp a;

    public op(wp wpVar) {
        this.a = wpVar;
    }

    @Override // org.telegram.ui.bc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.bc1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.bc1
    public final void c1(boolean z10) {
        wp wpVar = this.a;
        org.telegram.ui.qn qnVar = wpVar.v;
        wpVar.N = !wpVar.N;
        if (wpVar.M != null) {
            wpVar.P = true;
            qnVar.e7 = true;
            TLRPC.WallPaper wallPaper = wpVar.x() ? null : wpVar.n.h;
            org.telegram.ui.ActionBar.c4 c4Var = wpVar.M.a;
            if (c4Var.a) {
                wpVar.n.k(null, wallPaper, z10, Boolean.valueOf(wpVar.N), false);
            } else {
                wpVar.n.k(c4Var, wallPaper, z10, Boolean.valueOf(wpVar.N), false);
            }
            qnVar.e7 = false;
        }
    }
}
