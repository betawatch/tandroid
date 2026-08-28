package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uo implements fc1 {
    public final /* synthetic */ cp a;

    public uo(cp cpVar) {
        this.a = cpVar;
    }

    @Override // org.telegram.ui.fc1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.fc1
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.fc1
    public final void m1(boolean z10) {
        cp cpVar = this.a;
        org.telegram.ui.qn qnVar = cpVar.v;
        cpVar.J = !cpVar.J;
        if (cpVar.I != null) {
            cpVar.L = true;
            qnVar.a7 = true;
            TLRPC.WallPaper wallPaper = cpVar.v() ? null : cpVar.n.h;
            org.telegram.ui.ActionBar.b4 b4Var = cpVar.I.a;
            if (b4Var.a) {
                cpVar.n.i(null, wallPaper, z10, Boolean.valueOf(cpVar.J), false);
            } else {
                cpVar.n.i(b4Var, wallPaper, z10, Boolean.valueOf(cpVar.J), false);
            }
            qnVar.a7 = false;
        }
    }
}
