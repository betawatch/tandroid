package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class em extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ em(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f = obj;
        this.e = zVar;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new zg(5, this, (org.telegram.ui.Cells.t0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                lm lmVar = (lm) this.f;
                an anVar = lmVar.a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                anVar.Zb = q1Var.getMessageObject().e1();
                an anVar2 = lmVar.a;
                anVar2.ac = 2;
                anVar2.bc = null;
                q1Var.invalidate();
                break;
            case 1:
                lm lmVar2 = (lm) this.f;
                an anVar3 = lmVar2.a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                anVar3.Zb = q1Var2.getMessageObject().e1();
                an anVar4 = lmVar2.a;
                anVar4.ac = 2;
                anVar4.bc = null;
                q1Var2.invalidate();
                break;
            case 2:
                lm lmVar3 = (lm) this.f;
                an anVar5 = lmVar3.a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                anVar5.Zb = q1Var3.getMessageObject().e1();
                an anVar6 = lmVar3.a;
                anVar6.ac = 2;
                anVar6.bc = null;
                q1Var3.invalidate();
                break;
            case 3:
                lm lmVar4 = (lm) this.f;
                an anVar7 = lmVar4.a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                anVar7.Zb = q1Var4.getMessageObject().e1();
                an anVar8 = lmVar4.a;
                anVar8.ac = 2;
                anVar8.bc = null;
                q1Var4.invalidate();
                break;
            case 4:
                lm lmVar5 = (lm) this.f;
                an anVar9 = lmVar5.a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                anVar9.Zb = q1Var5.getMessageObject().e1();
                an anVar10 = lmVar5.a;
                anVar10.ac = 2;
                anVar10.bc = null;
                q1Var5.invalidate();
                break;
            case 5:
                lm lmVar6 = (lm) this.f;
                an anVar11 = lmVar6.a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                anVar11.Zb = q1Var6.getMessageObject().e1();
                an anVar12 = lmVar6.a;
                anVar12.ac = 2;
                anVar12.bc = null;
                q1Var6.invalidate();
                break;
            default:
                el elVar = (el) this.f;
                an anVar13 = elVar.a.R;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.e;
                anVar13.Zb = t0Var.getMessageObject().e1();
                an anVar14 = elVar.a.R;
                anVar14.ac = 4;
                anVar14.bc = null;
                t0Var.getMessageObject().r = true;
                t0Var.invalidate();
                break;
        }
    }
}
