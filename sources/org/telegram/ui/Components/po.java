package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ po(ep epVar, int i7) {
        this.a = i7;
        this.b = epVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ep epVar = this.b;
                epVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                epVar.Y1 = true;
                epVar.Z0(true);
                epVar.X1 = false;
                break;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                ep epVar2 = this.b;
                if (epVar2.getContext() != null) {
                    org.telegram.ui.an anVar = epVar2.v1;
                    ug.j0 j0Var = new ug.j0(22, epVar2.a, epVar2.getContext(), anVar, epVar2.J0);
                    j0Var.A1(e3Var);
                    j0Var.z1(epVar2.Z1, true);
                    j0Var.B1(epVar2.v1.a());
                    j0Var.M2 = new no(epVar2, 2);
                    j0Var.show();
                    break;
                }
                break;
        }
    }
}
