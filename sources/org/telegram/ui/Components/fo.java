package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ fo(vo voVar, int i3) {
        this.a = i3;
        this.b = voVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                vo voVar = this.b;
                voVar.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                voVar.V1 = true;
                voVar.Z0(true);
                voVar.U1 = false;
                break;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                vo voVar2 = this.b;
                if (voVar2.getContext() != null) {
                    org.telegram.ui.wm wmVar = voVar2.s1;
                    vg.i0 i0Var = new vg.i0(22, voVar2.a, voVar2.getContext(), wmVar, voVar2.J0);
                    i0Var.A1(e3Var);
                    i0Var.z1(voVar2.W1, true);
                    i0Var.B1(voVar2.s1.a());
                    i0Var.J2 = new co(voVar2, 2);
                    i0Var.show();
                    break;
                }
                break;
        }
    }
}
