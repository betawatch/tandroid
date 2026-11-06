package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class po implements org.telegram.ui.m71 {
    public final /* synthetic */ vo a;

    public po(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.m71
    public final boolean a() {
        return this.a.D1;
    }

    @Override // org.telegram.ui.m71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.m71
    public final void t1(boolean z9) {
        vo voVar = this.a;
        org.telegram.ui.an anVar = voVar.r1;
        voVar.D1 = !voVar.D1;
        if (voVar.C1 != null) {
            voVar.F1 = true;
            anVar.u7 = true;
            TLRPC.WallPaper wallPaper = voVar.P0() ? null : voVar.o1.g;
            org.telegram.ui.ActionBar.r3 r3Var = voVar.C1.a;
            if (r3Var.a) {
                voVar.o1.r(null, wallPaper, z9, Boolean.valueOf(voVar.D1), false);
            } else {
                voVar.o1.r(r3Var, wallPaper, z9, Boolean.valueOf(voVar.D1), false);
            }
            anVar.u7 = false;
        }
    }
}
