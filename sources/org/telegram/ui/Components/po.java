package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class po implements org.telegram.ui.o71 {
    public final /* synthetic */ vo a;

    public po(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.o71
    public final boolean a() {
        return this.a.D1;
    }

    @Override // org.telegram.ui.o71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.o71
    public final void t1(boolean z9) {
        vo voVar = this.a;
        org.telegram.ui.cn cnVar = voVar.r1;
        voVar.D1 = !voVar.D1;
        if (voVar.C1 != null) {
            voVar.F1 = true;
            cnVar.u7 = true;
            TLRPC.WallPaper wallPaper = voVar.P0() ? null : voVar.o1.g;
            org.telegram.ui.ActionBar.r3 r3Var = voVar.C1.a;
            if (r3Var.a) {
                voVar.o1.r(null, wallPaper, z9, Boolean.valueOf(voVar.D1), false);
            } else {
                voVar.o1.r(r3Var, wallPaper, z9, Boolean.valueOf(voVar.D1), false);
            }
            cnVar.u7 = false;
        }
    }
}
