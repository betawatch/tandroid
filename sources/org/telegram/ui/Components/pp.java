package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pp implements hc1 {
    public final /* synthetic */ wp a;

    public pp(wp wpVar) {
        this.a = wpVar;
    }

    @Override // org.telegram.ui.hc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.hc1
    public final boolean a() {
        return this.a.M;
    }

    @Override // org.telegram.ui.hc1
    public final void c1(boolean z10) {
        wp wpVar = this.a;
        org.telegram.ui.sn snVar = wpVar.v;
        wpVar.M = !wpVar.M;
        if (wpVar.L != null) {
            wpVar.O = true;
            snVar.q7 = true;
            TLRPC.WallPaper wallPaper = wpVar.A() ? null : wpVar.n.g;
            org.telegram.ui.ActionBar.f4 f4Var = wpVar.L.a;
            if (f4Var.a) {
                wpVar.n.q(null, wallPaper, z10, Boolean.valueOf(wpVar.M), false);
            } else {
                wpVar.n.q(f4Var, wallPaper, z10, Boolean.valueOf(wpVar.M), false);
            }
            snVar.q7 = false;
        }
    }
}
