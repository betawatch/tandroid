package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ vo(kp kpVar, int i7) {
        this.a = i7;
        this.b = kpVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                kp kpVar = this.b;
                kpVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                kpVar.Y1 = true;
                kpVar.a1(true);
                kpVar.X1 = false;
                break;
            default:
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                kp kpVar2 = this.b;
                if (kpVar2.getContext() != null) {
                    org.telegram.ui.bn bnVar = kpVar2.v1;
                    ug.k0 k0Var = new ug.k0(22, kpVar2.a, kpVar2.getContext(), bnVar, kpVar2.J0);
                    k0Var.B1(g3Var);
                    k0Var.A1(kpVar2.Z1, true);
                    k0Var.C1(kpVar2.v1.a());
                    k0Var.M2 = new to(kpVar2, 2);
                    k0Var.show();
                    break;
                }
                break;
        }
    }
}
