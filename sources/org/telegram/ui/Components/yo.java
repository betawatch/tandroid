package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ yo(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                npVar.Y1 = true;
                npVar.a1(true);
                npVar.X1 = false;
                break;
            default:
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                np npVar2 = this.b;
                if (npVar2.getContext() != null) {
                    org.telegram.ui.bn bnVar = npVar2.v1;
                    ug.k0 k0Var = new ug.k0(22, npVar2.a, npVar2.getContext(), bnVar, npVar2.J0);
                    k0Var.B1(g3Var);
                    k0Var.A1(npVar2.Z1, true);
                    k0Var.C1(npVar2.v1.a());
                    k0Var.M2 = new wo(npVar2, 2);
                    k0Var.show();
                    break;
                }
                break;
        }
    }
}
