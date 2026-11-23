package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fm extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ org.telegram.ui.Cells.z e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fm(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f = obj;
        this.e = zVar;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f).a, 3), 250L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f).a, 4), 250L);
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f).a, 5), 250L);
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f).a, 6), 250L);
                    break;
                }
                break;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f).a, 7), 250L);
                    break;
                }
                break;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f).a, 8), 250L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ah(5, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    break;
                }
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                mm mmVar = (mm) this.f;
                bn bnVar = mmVar.a;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.e;
                bnVar.ac = r1Var.getMessageObject().e1();
                bn bnVar2 = mmVar.a;
                bnVar2.bc = 2;
                bnVar2.cc = null;
                r1Var.invalidate();
                break;
            case 1:
                mm mmVar2 = (mm) this.f;
                bn bnVar3 = mmVar2.a;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) this.e;
                bnVar3.ac = r1Var2.getMessageObject().e1();
                bn bnVar4 = mmVar2.a;
                bnVar4.bc = 2;
                bnVar4.cc = null;
                r1Var2.invalidate();
                break;
            case 2:
                mm mmVar3 = (mm) this.f;
                bn bnVar5 = mmVar3.a;
                org.telegram.ui.Cells.r1 r1Var3 = (org.telegram.ui.Cells.r1) this.e;
                bnVar5.ac = r1Var3.getMessageObject().e1();
                bn bnVar6 = mmVar3.a;
                bnVar6.bc = 2;
                bnVar6.cc = null;
                r1Var3.invalidate();
                break;
            case 3:
                mm mmVar4 = (mm) this.f;
                bn bnVar7 = mmVar4.a;
                org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) this.e;
                bnVar7.ac = r1Var4.getMessageObject().e1();
                bn bnVar8 = mmVar4.a;
                bnVar8.bc = 2;
                bnVar8.cc = null;
                r1Var4.invalidate();
                break;
            case 4:
                mm mmVar5 = (mm) this.f;
                bn bnVar9 = mmVar5.a;
                org.telegram.ui.Cells.r1 r1Var5 = (org.telegram.ui.Cells.r1) this.e;
                bnVar9.ac = r1Var5.getMessageObject().e1();
                bn bnVar10 = mmVar5.a;
                bnVar10.bc = 2;
                bnVar10.cc = null;
                r1Var5.invalidate();
                break;
            case 5:
                mm mmVar6 = (mm) this.f;
                bn bnVar11 = mmVar6.a;
                org.telegram.ui.Cells.r1 r1Var6 = (org.telegram.ui.Cells.r1) this.e;
                bnVar11.ac = r1Var6.getMessageObject().e1();
                bn bnVar12 = mmVar6.a;
                bnVar12.bc = 2;
                bnVar12.cc = null;
                r1Var6.invalidate();
                break;
            default:
                fl flVar = (fl) this.f;
                bn bnVar13 = flVar.a.R;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                bnVar13.ac = v0Var.getMessageObject().e1();
                bn bnVar14 = flVar.a.R;
                bnVar14.bc = 4;
                bnVar14.cc = null;
                v0Var.getMessageObject().r = true;
                v0Var.invalidate();
                break;
        }
    }
}
