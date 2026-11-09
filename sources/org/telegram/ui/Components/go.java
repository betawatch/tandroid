package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ go(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                vo voVar = this.b;
                voVar.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                voVar.U1 = true;
                voVar.Z0(true);
                voVar.T1 = false;
                break;
            default:
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                vo voVar2 = this.b;
                if (voVar2.getContext() != null) {
                    org.telegram.ui.cn cnVar = voVar2.r1;
                    ug.i0 i0Var = new ug.i0(22, voVar2.a, voVar2.getContext(), cnVar, voVar2.I0);
                    i0Var.A1(e3Var);
                    i0Var.z1(voVar2.V1, true);
                    i0Var.B1(voVar2.r1.a());
                    i0Var.I2 = new eo(voVar2, 2);
                    i0Var.show();
                    break;
                }
                break;
        }
    }
}
