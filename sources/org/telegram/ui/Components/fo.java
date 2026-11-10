package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ fo(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                vo voVar = this.b;
                voVar.Y1 = (TL_stories.TL_premium_boostsStatus) obj;
                voVar.X1 = true;
                voVar.Z0(true);
                voVar.W1 = false;
                break;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                vo voVar2 = this.b;
                if (voVar2.getContext() != null) {
                    org.telegram.ui.cn cnVar = voVar2.u1;
                    ug.i0 i0Var = new ug.i0(22, voVar2.a, voVar2.getContext(), cnVar, voVar2.I0);
                    i0Var.A1(e3Var);
                    i0Var.z1(voVar2.Y1, true);
                    i0Var.B1(voVar2.u1.a());
                    i0Var.L2 = new co(voVar2, 2);
                    i0Var.show();
                    break;
                }
                break;
        }
    }
}
