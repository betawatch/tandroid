package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new qf(16, this, (org.telegram.ui.Cells.t0) this.e), 250L);
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
                anVar.Wb = q1Var.getMessageObject().f1();
                an anVar2 = lmVar.a;
                anVar2.Xb = 2;
                anVar2.Yb = null;
                q1Var.invalidate();
                break;
            case 1:
                lm lmVar2 = (lm) this.f;
                an anVar3 = lmVar2.a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                anVar3.Wb = q1Var2.getMessageObject().f1();
                an anVar4 = lmVar2.a;
                anVar4.Xb = 2;
                anVar4.Yb = null;
                q1Var2.invalidate();
                break;
            case 2:
                lm lmVar3 = (lm) this.f;
                an anVar5 = lmVar3.a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                anVar5.Wb = q1Var3.getMessageObject().f1();
                an anVar6 = lmVar3.a;
                anVar6.Xb = 2;
                anVar6.Yb = null;
                q1Var3.invalidate();
                break;
            case 3:
                lm lmVar4 = (lm) this.f;
                an anVar7 = lmVar4.a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                anVar7.Wb = q1Var4.getMessageObject().f1();
                an anVar8 = lmVar4.a;
                anVar8.Xb = 2;
                anVar8.Yb = null;
                q1Var4.invalidate();
                break;
            case 4:
                lm lmVar5 = (lm) this.f;
                an anVar9 = lmVar5.a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                anVar9.Wb = q1Var5.getMessageObject().f1();
                an anVar10 = lmVar5.a;
                anVar10.Xb = 2;
                anVar10.Yb = null;
                q1Var5.invalidate();
                break;
            case 5:
                lm lmVar6 = (lm) this.f;
                an anVar11 = lmVar6.a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                anVar11.Wb = q1Var6.getMessageObject().f1();
                an anVar12 = lmVar6.a;
                anVar12.Xb = 2;
                anVar12.Yb = null;
                q1Var6.invalidate();
                break;
            default:
                el elVar = (el) this.f;
                an anVar13 = elVar.a.Q;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.e;
                anVar13.Wb = t0Var.getMessageObject().f1();
                an anVar14 = elVar.a.Q;
                anVar14.Xb = 4;
                anVar14.Yb = null;
                t0Var.getMessageObject().r = true;
                t0Var.invalidate();
                break;
        }
    }
}
