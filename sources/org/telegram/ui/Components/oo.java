package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ oo(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                dp dpVar = this.b;
                dpVar.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                dpVar.U1 = true;
                dpVar.Z0(true);
                dpVar.T1 = false;
                break;
            default:
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj;
                dp dpVar2 = this.b;
                if (dpVar2.getContext() != null) {
                    org.telegram.ui.un unVar = dpVar2.r1;
                    kg.q0 q0Var = new kg.q0(22, dpVar2.a, dpVar2.getContext(), unVar, dpVar2.I0);
                    q0Var.A1(h3Var);
                    q0Var.z1(dpVar2.V1, true);
                    q0Var.B1(dpVar2.r1.a());
                    q0Var.I2 = new mo(dpVar2, 2);
                    q0Var.show();
                    break;
                }
                break;
        }
    }
}
