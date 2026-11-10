package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oo implements org.telegram.ui.p71 {
    public final /* synthetic */ vo a;

    public oo(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.p71
    public final boolean a() {
        return this.a.G1;
    }

    @Override // org.telegram.ui.p71
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.p71
    public final void t1(boolean z9) {
        vo voVar = this.a;
        org.telegram.ui.cn cnVar = voVar.u1;
        voVar.G1 = !voVar.G1;
        if (voVar.F1 != null) {
            voVar.I1 = true;
            cnVar.u7 = true;
            TLRPC.WallPaper wallPaper = voVar.P0() ? null : voVar.r1.g;
            org.telegram.ui.ActionBar.s3 s3Var = voVar.F1.a;
            if (s3Var.a) {
                voVar.r1.r(null, wallPaper, z9, Boolean.valueOf(voVar.G1), false);
            } else {
                voVar.r1.r(s3Var, wallPaper, z9, Boolean.valueOf(voVar.G1), false);
            }
            cnVar.u7 = false;
        }
    }
}
