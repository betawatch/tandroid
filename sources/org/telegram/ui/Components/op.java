package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class op implements dc1 {
    public final /* synthetic */ wp a;

    public op(wp wpVar) {
        this.a = wpVar;
    }

    @Override // org.telegram.ui.dc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.dc1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.dc1
    public final void c1(boolean z10) {
        wp wpVar = this.a;
        org.telegram.ui.sn snVar = wpVar.v;
        wpVar.N = !wpVar.N;
        if (wpVar.M != null) {
            wpVar.P = true;
            snVar.e7 = true;
            TLRPC.WallPaper wallPaper = wpVar.x() ? null : wpVar.n.h;
            org.telegram.ui.ActionBar.c4 c4Var = wpVar.M.a;
            if (c4Var.a) {
                wpVar.n.k(null, wallPaper, z10, Boolean.valueOf(wpVar.N), false);
            } else {
                wpVar.n.k(c4Var, wallPaper, z10, Boolean.valueOf(wpVar.N), false);
            }
            snVar.e7 = false;
        }
    }
}
