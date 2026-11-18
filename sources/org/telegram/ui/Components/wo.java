package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ wo(lp lpVar, int i7) {
        this.a = i7;
        this.b = lpVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lp lpVar = this.b;
                lpVar.Z1 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.Y1 = true;
                lpVar.a1(true);
                lpVar.X1 = false;
                break;
            default:
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                lp lpVar2 = this.b;
                if (lpVar2.getContext() != null) {
                    org.telegram.ui.bn bnVar = lpVar2.v1;
                    ug.l0 l0Var = new ug.l0(22, lpVar2.a, lpVar2.getContext(), bnVar, lpVar2.J0);
                    l0Var.B1(g3Var);
                    l0Var.A1(lpVar2.Z1, true);
                    l0Var.C1(lpVar2.v1.a());
                    l0Var.M2 = new uo(lpVar2, 2);
                    l0Var.show();
                    break;
                }
                break;
        }
    }
}
