package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rd1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kp implements rd1 {
    public final /* synthetic */ sp a;

    public kp(sp spVar) {
        this.a = spVar;
    }

    @Override // org.telegram.ui.rd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.rd1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.rd1
    public final void n1(boolean z10) {
        sp spVar = this.a;
        org.telegram.ui.eo eoVar = spVar.v;
        spVar.N = !spVar.N;
        if (spVar.M != null) {
            spVar.P = true;
            eoVar.e7 = true;
            TLRPC.WallPaper wallPaper = spVar.v() ? null : spVar.n.h;
            org.telegram.ui.ActionBar.f4 f4Var = spVar.M.a;
            if (f4Var.a) {
                spVar.n.i(null, wallPaper, z10, Boolean.valueOf(spVar.N), false);
            } else {
                spVar.n.i(f4Var, wallPaper, z10, Boolean.valueOf(spVar.N), false);
            }
            eoVar.e7 = false;
        }
    }
}
